package hungry.ex_frag.numSample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import hungry.ex_frag.ActivityHelper;
import hungry.ex_frag.NoticeActivity;
import hungry.ex_frag.R;
import hungry.ex_frag.aStatic.StaticVari;
import hungry.ex_frag.mongo.Thread_notice;

/**
 * Created by soy on 2016-07-14.
 */
public class NumSample_Activity extends ActivityHelper {
    static final int SIZE_TOTALNUM=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numsample);

        GridView gridview = (GridView) findViewById(R.id.gridView);
        gridview.setAdapter(new GridViewAdapter(this, makeSet()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(), "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    private ArrayList<String> makeSet() {
        //It method to be optimal as conver array from list
        ArrayList<String> al = new ArrayList<>();
        for (int a = 0; a < NumSample_Activity.SIZE_TOTALNUM; a++) {
            String temp = String.valueOf(a);
            while (temp.length() < 2)
                temp = "0" + temp;
            al.add(temp);
        }
        return al;
    }

    public void helpButtonOnClicked(View view) {
        /*
        //노티스 액티비티에서
        //notice image쓸 일이 하나밖에 없어서, hardcoding함.
        if(getIntent().getIntExtra("image", 0)==1) {
            ImageView iv=(ImageView)findViewById(R.id.iv);
            iv.setVisibility(View.VISIBLE);
            iv.setImageResource(R.drawable.d4_2);
        }*/
        Thread_notice.notice=getString(R.string.help2);
        StaticVari.dialogTitle="설명서";
        Intent intent = new Intent(this, NoticeActivity.class);
        intent.putExtra("image", 1);
        startActivity(intent);
    }
}


