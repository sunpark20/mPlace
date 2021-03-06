package hungry.ex_frag;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import hungry.ex_frag.aStatic.StaticVari;
import hungry.ex_frag.mongo.Thread_notice;

//고치기- try catch 인터넷 연결안됬을 시  개판으로 해놓음.

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

        //notice image쓸 일이 하나밖에 없어서, hardcoding함.
        if(getIntent().getIntExtra("image", 0)==1) {
            ImageView iv=(ImageView)findViewById(R.id.iv);
            iv.setVisibility(View.VISIBLE);
            iv.setImageResource(R.drawable.d4_2);
        }

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
