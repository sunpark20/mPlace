package hungry.ex_frag;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;

import java.lang.ref.WeakReference;

import hungry.ex_frag.aStatic.StaticMethod;
import hungry.ex_frag.aStatic.StaticVari;
import hungry.ex_frag.day.Day_Activity;
import hungry.ex_frag.day.day0_static;
import hungry.ex_frag.day.day1_static;
import hungry.ex_frag.day.day2_static;
import hungry.ex_frag.day.day3_static;
import hungry.ex_frag.day.day3_static_2;
import hungry.ex_frag.day.day4_static;
import hungry.ex_frag.day.day_statc_fc;
import hungry.ex_frag.day.day_static_pao;
import hungry.ex_frag.mongo.Thread_version;
import hungry.ex_frag.numPrac.NumPrac_Activity;
import hungry.ex_frag.numSample.NumSample_Activity;
import hungry.ex_frag.picTest.PutData;
import hungry.ex_frag.picTest.pic_Activity;

public class MainActivity extends ActivityHelper {
    public static MyHandler mHandler;
    static  Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mContext= this;

        mHandler= new MyHandler(this);
        new Thread_version(this).execute();

        //notice
        if(!StaticVari.worked_notice){
            StaticVari.worked_notice=true; //only once run notice
            StaticVari.dialogTitle="공지사항";
            Intent intent = new Intent(this, NoticeActivity.class);
            startActivity(intent);
        }

    }

    public static class MyHandler extends Handler {

        private final WeakReference<MainActivity> mActivity;

        public MyHandler(MainActivity activity) {
            mActivity = new WeakReference<MainActivity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            MainActivity activity = mActivity.get();
            if (activity != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.mContext);
                builder.setTitle("새로운 버전의 업데이트 확인")        // 제목 설정
                        .setMessage("")        // 메세지 설정
                        .setCancelable(false)        // 뒤로 버튼 클릭시 취소 가능 설정
                        .setPositiveButton("업데이트", new DialogInterface.OnClickListener(){
                            // 확인 버튼 클릭시 설정
                            public void onClick(DialogInterface dialog, int whichButton){
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+MainActivity.mContext.getPackageName()));
                                MainActivity.mContext.startActivity(intent);
                            }
                        })
                        .setNegativeButton("안함", new DialogInterface.OnClickListener(){
                            // 취소 버튼 클릭시 설정
                            public void onClick(DialogInterface dialog, int whichButton){
                                dialog.cancel();
                            }
                        });
                AlertDialog dialog = builder.create();    // 알림창 객체 생성
                dialog.show();    // 알림창 띄우기
            }
        }
    }

    public void day0ButtonOnClicked(View view) {
        day0_static.setTiArray();
        Day_Activity.dayTitle=getString(R.string.intro);
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }

    public void day1ButtonOnClicked(View view) {
        day1_static.setTiArray();
        Day_Activity.dayTitle=getString(R.string.day1);
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }

    public void day2ButtonOnClicked(View view) {
        day2_static.setTiArray();
        Day_Activity.dayTitle=getString(R.string.day2);
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }

    public void day3ButtonOnClicked(View view) {
        day3_static.setTiArray();
        Day_Activity.dayTitle=getString(R.string.day3);
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }
    public void day3_2ButtonOnClicked(View view) {
        day3_static_2.setTiArray();
        Day_Activity.dayTitle=getString(R.string.day3_2);
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }

    public void day4ButtonOnClicked(View view) {
        day4_static.setTiArray();
        Day_Activity.dayTitle=getString(R.string.day4);
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }

    public void peopleToNumsampleButtonOnClicked(View view) {
        Intent intent = new Intent(this, NumSample_Activity.class);
        startActivity(intent);
    }

    public void firstChallengeButtonOnClicked(View view) {
        day_statc_fc.setTiArray();
        Day_Activity.dayTitle=getString(R.string.day_fc);
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }

    //day6 숫자2
    public void day_paoButtonOnClicked(View view) {
        day_static_pao.setTiArray();
        Day_Activity.dayTitle=getString(R.string.day_pao);
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }

    public void day6_pacButtonOnClicked(View view) {
        Intent intent = new Intent(this, NumPrac_Activity.class);
        startActivity(intent);
    }

    public void testButtonOnClicked(View view) {
        PutData.setTiArray(getApplicationContext());
        pic_Activity.dayTitle="테스트 입니다.";
        Intent intent = new Intent(this, pic_Activity.class);
        startActivity(intent);
    }

    int exitCount=0;
    @Override
    public void onBackPressed() {
        exitCount++;
        if(exitCount==1) {
            String message = "'뒤로'버튼을 한번 더 누르면 종료됩니다.";
            StaticMethod.fToast(this, message);
        }
        if(exitCount==2) {
            MainActivity.this.finish();

            ActivityCompat.finishAffinity(this);
            System.runFinalization();
            System.exit(0);
        }

        Runnable task = new Runnable() {
            public void run() {
                SystemClock.sleep(2000);
                exitCount=0;
                Log.e("백버튼 스택이 감소", exitCount + "");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }



}
