package hungry.ex_frag;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import hungry.ex_frag.aStatic.StaticMethod;
import hungry.ex_frag.day1.Day_Activity;
import hungry.ex_frag.day1.day0_static;
import hungry.ex_frag.day1.day1_static;
import hungry.ex_frag.day1.day2_static;

public class MainActivity extends AppCompatActivity {
    public static String dayTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void day0ButtonOnClicked(View view) {
        day0_static.setTiArray();
        dayTitle="Day 0 머릿말";
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }

    public void day1ButtonOnClicked(View view) {
        day1_static.setTiArray();
        dayTitle="Day 1 몸 기억법";
        Intent intent = new Intent(this, Day_Activity.class);
        startActivity(intent);
    }
    public void day2ButtonOnClicked(View view) {
        day2_static.setTiArray();
        dayTitle="Day 2 숫자 -> 이미지";
        Intent intent = new Intent(this, Day_Activity.class);
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
        if(exitCount==2)
            MainActivity.this.finish();

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
