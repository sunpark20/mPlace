package hungry.ex_frag.picTest;


import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.AnimationDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import hungry.ex_frag.ActivityHelper;
import hungry.ex_frag.R;
import hungry.ex_frag.aStatic.PushWakeLock;
import hungry.ex_frag.day.OnSwipeTouchListener;

/**
 * Created by soy on 2016-07-14.
 */
public class pic_Activity extends ActivityHelper {
    final private String LNAME="pic_Activity";
    public static String dayTitle;

    // < this variable need init before start each day
    public static int setArrayCount=0;
    public static ArrayList<Integer> youtubeAL=new ArrayList<>();
    public static ArrayList<TI> tiArray=new ArrayList<>();
    public static ArrayList<Integer> touchPage =new ArrayList<>();
    public static ArrayList<Integer> touchSound =new ArrayList<>();
    public static ArrayList<Integer> linkText =new ArrayList<>();
    public static HashMap<Integer, Integer> alarmDrawableHM =new HashMap<>();
    public static HashMap<Integer, AnimationDrawable> CustomAniHM =new HashMap<>();
    public static HashMap<Integer, Integer> firstPageAniDrawableHM =new HashMap<>();
    public static HashMap<Integer, Integer> firstPageSound=new HashMap<>();
    public static HashMap<Integer, Integer> alarmTimeHM=new HashMap<>();
    public static int currentPage=0;
    static boolean test=false;
    // >

    TextView tv;
    TextView pageNum;
    ImageView iv;
    Button preButton;
    Button nextButton;
    Button youtubeButton;
    ScrollView scV;

    //터치와 알람 관리.
    int alarmTime=0;
    //sound
    MediaPlayer fsMedia;

    //viberation
    Vibrator vibe;
    long[] pattern = { 3000, 500, 3000, 500};

    //timer variable
    public TextView timer;
    AudioManager mAudioManager;

    //youtube
    private static final String VIDEO_ID = "Lr-towHhQuE";
    private static final int REQ_START_STANDALONE_PLAYER = 1;
    private static final int REQ_RESOLVE_SERVICE_MISSING = 2;

    //animation
    static AnimationDrawable frameAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(LNAME, "onCreate");
        setContentView(R.layout.activity_pictest);
        setTitle(pic_Activity.dayTitle);

        tv = (TextView) findViewById(R.id.tvFragDay1_1);
        pageNum = (TextView) findViewById(R.id.pageNum);
        nextButton = (Button) findViewById(R.id.nextButton);
        preButton = (Button) findViewById(R.id.previousButton);
        timer = (TextView) findViewById(R.id.timer);
        iv = (ImageView) findViewById(R.id.image);

        //youtube
        youtubeButton= (Button) findViewById(R.id.youtubeButton);

        youtubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //test에 따라 동작 구분
                if(test){

                }else{
                    iv.setVisibility(View.VISIBLE);
                    youtubeButton.setVisibility(View.GONE);
                    if(CustomAniHM.get(currentPage)!=null){
                        CustomAniHandler.sendEmptyMessage(currentPage);
                    }else{
                        cancleHandler(firstPageAniHandler);
                    }
                }
            }
        });

        iv.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            public void Touch(){
                Log.e("EE",touchSound+"");
                if(touchPage.contains(currentPage))
                    nextLoad();
                if(touchSound.contains(currentPage)) {
                    if (fsMedia != null)
                        fsMedia.stop();
                    runSound(R.raw.highfive);
                }
            }
            public void onSwipeRight() {
                preLoad();
            }
            public void onSwipeLeft() {
                nextLoad();
            }
        });

        scV=(ScrollView)findViewById(R.id.scV);
        scV.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            public void onSwipeRight() {
                preLoad();
            }

            public void onSwipeLeft() {
                nextLoad();
            }
        });

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

        //setTiArray always is located end
        setTiArray();
    }

    private boolean canResolveIntent(Intent intent) {
        List<ResolveInfo> resolveInfo = getPackageManager().queryIntentActivities(intent, 0);
        return resolveInfo != null && !resolveInfo.isEmpty();
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
        //scrollview position init
        scV.scrollTo(0, 0);
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

        //youtube
        if(youtubeButton.getVisibility()==View.GONE){
            if(youtubeAL.contains(currentPage)) {
                iv.setVisibility(View.INVISIBLE);
                youtubeButton.setVisibility(View.VISIBLE);
            }
        }else{
            iv.setVisibility(View.VISIBLE);
            youtubeButton.setVisibility(View.GONE);
        }

        //linkText
        if(linkText.contains(currentPage)) {
            tv.setMovementMethod(LinkMovementMethod.getInstance());
            String text=tiArray.get(currentPage).text;
            tv.setText(Html.fromHtml(text));
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
    //handler4 - CustomAniHandler
    Handler CustomAniHandler = new Handler() {
        public void handleMessage(Message msg) {
            AnimationDrawable ani=CustomAniHM.get(msg.what);
            iv.setBackgroundDrawable(ani);
            // run the start() method later on the UI thread
            iv.post(new Starter(ani));
        }
    };

    //handler1 method
    private void runAlarm(int num) {
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
            setAnimation(alarmDrawableHM.get(num), 5000*12);
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
        currentPage=0;
        setArrayCount=0;
        tiArray.clear();
        touchPage.clear();
        touchSound.clear();
        alarmDrawableHM.clear();
        firstPageAniDrawableHM.clear();
        CustomAniHM.clear();
        firstPageSound.clear();
        alarmTimeHM.clear();
        youtubeAL.clear();
        test=false;
    }

    @Override
    protected void onDestroy() { //액티비티를 나갈 땐 모든 핸들러 멈추기.
        super.onDestroy();
        Log.e(LNAME, "온 디스트로이");
        alarmHandler.removeCallbacksAndMessages(null);
        firstPageAniHandler.removeCallbacksAndMessages(null);
        firstPageSoundHandler.removeCallbacksAndMessages(null);
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(LNAME, "온스탑");
    }
}


