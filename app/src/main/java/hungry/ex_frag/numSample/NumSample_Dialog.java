package hungry.ex_frag.numSample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import hungry.ex_frag.R;

public class NumSample_Dialog extends Activity{
    final String TAG="NumSample_Dialog";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //sync <
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_numsample);
        //sync >
        TextView name=(TextView)findViewById(R.id.namet);
        TextView cha=(TextView)findViewById(R.id.charact);
        TextView des=(TextView)findViewById(R.id.desct);
        //notice image쓸 일이 하나밖에 없어서, hardcoding함.
        int position=getIntent().getIntExtra("position", -1);
        name.setText(NumSample_Activity.sampleAl.get(position).name);
        cha.setText(NumSample_Activity.sampleAl.get(position).cha);
        des.setText(NumSample_Activity.sampleAl.get(position).des);

    }
}
