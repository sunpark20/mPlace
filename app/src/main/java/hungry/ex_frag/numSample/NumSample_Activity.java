package hungry.ex_frag.numSample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    static ArrayList<Item> sampleAl=new ArrayList<>();

    //애드몹
    public AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numsample);

        //애드몹
        mAdView = (AdView)findViewById(R.id.adView111);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        GridView gridview = (GridView) findViewById(R.id.gridView);
        gridview.setAdapter(new GridViewAdapter(this, makeSet()));

        readRawTextFile(this, R.raw.numsample);
        show();

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent intent = new Intent(getApplicationContext(), NumSample_Dialog.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

    private void show(){
        for(int i=0;i<sampleAl.size();i++){
            Item item=sampleAl.get(i);
            System.out.println(item.name+" "+item.cha+" "+item.des);
        }
    }

    private static void readRawTextFile(Context ctx, int resId)
    {
        InputStream inputStream = ctx.getResources().openRawResource(resId);

        InputStreamReader inputreader = new InputStreamReader(inputStream);
        BufferedReader buffreader = new BufferedReader(inputreader);
        String line;
        StringBuilder text = new StringBuilder();

        int c=0;
        Item item=null;
        try {
            while (( line = buffreader.readLine()) != null) {
                if(c%4==1) {
                    item = new Item();
                    item.setName(line);
                }else if(c%4==2){
                    item.setCha(line);
                }else if(c%4==3){
                    item.setDes(line);
                    sampleAl.add(item);
                }
//                text.append(line);
//                text.append('\n');
                c++;
            }
        } catch (IOException e) {
            e.printStackTrace();
//            return null;
        }
//        return text.toString();
    }

    private ArrayList<String> makeSet() {
        //It method to be optimal as conver array from list
        ArrayList<String> al = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            String temp = String.valueOf(a);
            al.add(temp);
        }
        for (int a = 0; a < 100; a++) {
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


