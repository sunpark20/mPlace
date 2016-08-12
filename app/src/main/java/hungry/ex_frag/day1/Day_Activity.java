package hungry.ex_frag.day1;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import hungry.ex_frag.MainActivity;
import hungry.ex_frag.R;
import hungry.ex_frag.aStatic.PushWakeLock;

/**
 * Created by soy on 2016-07-14.
 */
public class Day_Activity extends AppCompatActivity {

    public static ArrayList<TI> tiArray=new ArrayList<>();
    public static ArrayList<Integer> touchPage =new ArrayList<>();
    public static ArrayList<Integer> touchSound =new ArrayList<>();
    public static HashMap<Integer, Integer> alarmDrawableHM =new HashMap<>();
    public static HashMap<Integer, Integer> firstPageAniDrawableHM =new HashMap<>();
    public static HashMap<Integer, Integer> firstPageSound=new HashMap<>();
    public static HashMap<Integer, Integer> alarmTimeHM=new HashMap<>();

    TextView tv;
    TextView pageNum;
    ImageView iv;
    Button preButton;
    Button nextButton;
    int currentPage=0;

    //터치와 알람 관리.
    int alarmTime=0;
    //sound
    MediaPlayer fsMedia;

    //viberation
    Vibrator vibe;
    long[] pattern = { 3000, 500, 3000, 500};

    //timer variable
    public static int ALARM_TIME_DEFAULT =5000;
    public TextView timer;
    AudioManager mAudioManager;

    //animation
    static AnimationDrawable frameAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_day1_1);
        setTitle(MainActivity.dayTitle);

        tv = (TextView) findViewById(R.id.tvFragDay1_1);
        pageNum = (TextView) findViewById(R.id.pageNum);
        iv = (ImageView) findViewById(R.id.image);
        nextButton = (Button) findViewById(R.id.nextButton);
        preButton = (Button) findViewById(R.id.previousButton);
        //<<<start set timer
        timer = (TextView) findViewById(R.id.timer);
        //>>>end set timer
        setTiArray();

        preButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preLoad();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //끝페이지에서 종료시키기.
                if(currentPage==tiArray.size()-1)
                    finish();
                nextLoad();
            }
        });


        //화면 터치에 다음으로 가기.
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(touchPage.contains(currentPage))
                    nextLoad();
                if(touchSound.contains(currentPage)) {
                    if(fsMedia!=null)
                        fsMedia.stop();
                    runSound(R.raw.highfive);
                }
            }
        });
    }

    void preLoad(){
        if (0 < currentPage) {
            currentPage--;
            tv.setText(tiArray.get(currentPage).text);
            iv.setImageResource(tiArray.get(currentPage).image);

        } else {
            Toast.makeText(getApplicationContext(), "처음", Toast.LENGTH_SHORT).show();
        }
        doCommonThings();
    }
    void nextLoad(){
        if (currentPage + 1 < tiArray.size()) {
            currentPage++;
            tv.setText(tiArray.get(currentPage).text);
            iv.setImageResource(tiArray.get(currentPage).image);
        } else {
            Toast.makeText(getApplicationContext(), "끝", Toast.LENGTH_SHORT).show();
        }
        doCommonThings();
    }

    void doCommonThings(){

        if(fsMedia!=null)
            fsMedia.stop();

        pageNum.setText((currentPage) + " / " + (tiArray.size() - 1));
        iv.setBackgroundResource(0);

        //handler1 - alarm page
        if(alarmDrawableHM.get(currentPage)!=null){

            // < sync start
            //alarmTime도 번들로 묶어서 핸들러로 보내면 좋은데, 1초후에 핸들러메세지 다시 보낼때 문제가 발생.
            //sync-1
            if(alarmTimeHM.get(currentPage)!=null)
                alarmTime=alarmTimeHM.get(currentPage);
            else
                alarmTime=15;
            //sync-2
            alarmHandler.sendEmptyMessage(currentPage);
            // > sync end

        }else{
            cancleHandler(alarmHandler);
        }
        timer.setText("");
        //handler2 - firstPageAni
        if(firstPageAniDrawableHM.get(currentPage)!=null){
            firstPageAniHandler.sendEmptyMessage(currentPage);
        }else{
            cancleHandler(firstPageAniHandler);
        }
        //handler3 - firstPageSound
        if(firstPageSound.get(currentPage)!=null){
            firstPageSoundHandler.sendEmptyMessage(currentPage);
        }else{
            cancleHandler(firstPageSoundHandler);
        }
    }

    private void cancleHandler(Handler handler){
        if(handler !=null){
            if(0<currentPage && currentPage<tiArray.size())
                alarmHandler.removeMessages(currentPage+1);
            alarmHandler.removeMessages(currentPage - 1);
        }
    }
    //handlers
    //handler1 - alarm
    Handler alarmHandler = new Handler() {
        public void handleMessage(Message msg) {
            runAlarm(msg.what);
        }
    };
    //handler2 - first page animation
    Handler firstPageAniHandler = new Handler() {
        public void handleMessage(Message msg) {
            setAnimation(firstPageAniDrawableHM.get(msg.what), 60 * 1000);
        }
    };
    //handler3 - first page sound
    Handler firstPageSoundHandler = new Handler() {
        public void handleMessage(Message msg) {
            runSound(firstPageSound.get(msg.what));
        }
    };

    //handler1 method
    private void runAlarm(int num){
        alarmTime--;
        timer.setText(alarmTime + "");
        // 메세지를 처리하고 또다시 핸들러에 메세지 전달 (1000ms 지연)
        alarmHandler.sendEmptyMessageDelayed(num, 1000);

        if(alarmTime ==0){
            alarmHandler.removeMessages(num);
            timer.setText("");
            PushWakeLock.acquireCpuWakeLock(getApplicationContext());
            alarmSound();
            nextLoad();
            setAnimation(alarmDrawableHM.get(num), 5000);
            PushWakeLock.releaseCpuLock();
        }
    }

    //handler1 method
    private void alarmSound(){
        vibe = (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(pattern, -1);

        mAudioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
//        System.out.println(mAudioManager.getRingerMode());
        switch(mAudioManager.getRingerMode()){
            case AudioManager.RINGER_MODE_VIBRATE: //진동  진동모드일 경우(값1)
                vibe.vibrate(pattern, -1);
                break;
            case AudioManager.RINGER_MODE_NORMAL:  //벨  벨 모드일 경우(값2)
//                MediaPlayer mPlayer;
//                mPlayer = MediaPlayer.create(getActivity(),
//                        Settings.System.DEFAULT_NOTIFICATION_URI);
                MediaPlayer media = MediaPlayer.create(getApplicationContext(), R.raw.alarm);
                media.start();
                vibe.vibrate(pattern, -1);
                break;
            case AudioManager.RINGER_MODE_SILENT: //무음 일런트 모드일 경우(값0)
                break;
        }
    }

    private void setAnimation(int imageResource, long duration){
        if(imageResource==0) //알람만 쓰는거에요.
            return;

        iv.setImageResource(0);
        iv.setBackgroundResource(imageResource);
        frameAnimation =
                (AnimationDrawable) iv.getBackground();

        final long d=duration;
        new Thread(new Runnable() {

            @Override
            public void run() {
                frameAnimation.start();
                try {
                    Thread.sleep(d);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                frameAnimation.stop();
            }
        }).start();
    }

    private void runSound(int source){
            fsMedia = MediaPlayer.create(getApplicationContext(), source);
            fsMedia.start();
    }

    //resource 할당  길이가 너무 기니까 젤 밑에 놔두자------------------------------------------------------------
    void setTiArray() {
        tv.setText(tiArray.get(currentPage).text);
        iv.setImageResource(tiArray.get(currentPage).image);
        doCommonThings();
    }
    public static void initAllArray(){
        tiArray.clear();
        touchPage.clear();
        touchSound.clear();
        alarmDrawableHM.clear();
        firstPageAniDrawableHM.clear();
        firstPageSound.clear();
        alarmTimeHM.clear();
    }

}


