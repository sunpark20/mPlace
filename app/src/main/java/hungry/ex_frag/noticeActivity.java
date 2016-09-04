package hungry.ex_frag;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import hungry.ex_frag.aStatic.StaticVari;
import hungry.ex_frag.mongo.Thread_notice;

public class NoticeActivity extends Activity{
    final String TAG="NoticeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //sync <
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_notice);
        //sync >

        //setTitle
        TextView diaTitle=(TextView)findViewById(R.id.dialogTitle);
        diaTitle.setText(StaticVari.dialogTitle);

        //바깥영역 클릭시 액티비티 종료 막기
        this.setFinishOnTouchOutside(false);

        TextView tv=(TextView)findViewById(R.id.tv);
        if(Thread_notice.notice==null){
            Thread_notice.notice="네트워크가 연결되어 있지 않습니다.\n연결 후 확인해주세요.";
        }
        tv.setText(Thread_notice.notice);
    }

    public void exitButtonOnClicked(View view) {
        finish();
    }
    public void exit2ButtonOnClicked(View view) {
        finish();
    }
}
