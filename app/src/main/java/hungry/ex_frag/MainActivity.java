package hungry.ex_frag;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;

import hungry.ex_frag.aStatic.StaticMethod;
import hungry.ex_frag.aStatic.StaticVari;
import hungry.ex_frag.day.Day_Activity;
import hungry.ex_frag.numSample.NumSample_Activity;
import hungry.ex_frag.day.day0_static;
import hungry.ex_frag.day.day1_static;
import hungry.ex_frag.day.day2_static;
import hungry.ex_frag.day.day3_static;
import hungry.ex_frag.day.day4_static;
import hungry.ex_frag.day.day_statc_fc;
import hungry.ex_frag.numPrac.NumPrac_Activity;

public class MainActivity extends ActivityHelper {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //notice
        if(!StaticVari.worked_notice){
            StaticVari.worked_notice=true; //only once run notice
            StaticVari.dialogTitle="공지사항";
            Intent intent = new Intent(this, NoticeActivity.class);
            startActivity(intent);
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



    public void day6_pacButtonOnClicked(View view) {
        Intent intent = new Intent(this, NumPrac_Activity.class);
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
