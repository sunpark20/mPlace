package hungry.ex_frag.numPrac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;

import hungry.ex_frag.ActivityHelper;
import hungry.ex_frag.NoticeActivity;
import hungry.ex_frag.R;
import hungry.ex_frag.aStatic.StaticMethod;
import hungry.ex_frag.aStatic.StaticPref;
import hungry.ex_frag.aStatic.StaticVari;
import hungry.ex_frag.mongo.Thread_notice;

/**
 * Created by soy on 2016-08-31.
 */
public class NumPrac_Activity extends ActivityHelper {
    static final int SIZE_SET=30;
    public static final int SIZE_TOTALNUM=10000;

    public static HashSet<Integer> score;

    final String TAG="NumPrac_Activity";
    ArrayList<String> set;
    private int index=0;
    TextView tv, s_correct, s_inco, s_total;
    Chronometer cm;

    boolean end=false;

    //애드몹
    public AdView mAdView;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putCharSequence("cm", cm.getText());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numprac);

        //애드몹
        mAdView = (AdView)findViewById(R.id.adView111);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        cm=(Chronometer)findViewById(R.id.cm);
        cm.start();

        score=StaticPref.loadPref_score(getApplicationContext());

//        // < 받은 데이터 확인
//        Iterator<Integer> iter=score.iterator();
//        int tCount=0;
//        while(iter.hasNext()){
//            System.out.println(tCount++ +" "+ iter.next());
//        }
//        // > 받은 데이터 확인

        set=makeSet();
        tv=(TextView)findViewById(R.id.tv);
        tv.setText(set.get(index));

        s_correct=(TextView)findViewById(R.id.s_correct);
        s_inco=(TextView)findViewById(R.id.s_inco);
        s_total=(TextView)findViewById(R.id.s_total);

        s_total.setText(String.valueOf(SIZE_SET));
        //inco랑 co는 0으로 xml에서 초기화

    }

    private ArrayList<String> makeSet(){
        ArrayList<String> al=new ArrayList<>();
        for(int a=0;a<SIZE_TOTALNUM;a++){
            String temp=String.valueOf(a);
            while (temp.length()<4)
                temp="0"+temp;
            al.add(temp);
        }
        Collections.shuffle(al);
        ArrayList<String> set=new ArrayList<>();
        for(int i=0;i<SIZE_SET;i++){
            set.add(al.get(i));
        }
        return set;
    }

    public void helpButtonOnClicked(View view) {
        Thread_notice.notice=getString(R.string.help);
        StaticVari.dialogTitle="설명서";
        Intent intent = new Intent(this, NoticeActivity.class);
        startActivity(intent);
    }

    public void incoButtonOnClicked(View view) {
        if(end) //끝나면 더이상 버튼 xx
            return;
        if(complete()) //마지막 전 처리.. 헷갈  나중에 갈아 엎자
            return;
        if(set.size()==1) {
            StaticMethod.fToast(getApplicationContext(), "마지막 숫자입니다.");
            return;
        }

        //끝이면 처음으로
        if(set.size()-1 <= index)
            index=0;
        else
            index++;
        tv.setText(set.get(index));

        push_s_inco();
//        show();
    }

    public void correctButtonOnClicked(View view) {
        if(end) //끝나면 더이상 버튼 xx
            return;
        if(complete()) //마지막 전 처리.. 헷갈  나중에 갈아 엎자
            return;
        set.remove(index);
        if(complete()) { //여기가 완전 종료인듯.
            push_s_correct();
            push_s_total();
            end=true;
            return;
        }
        // < sync
        int tempI=Integer.valueOf(tv.getText().toString());

        //스코어 저장
        score.add(tempI);
        StaticPref.savePref_score(getApplicationContext(), score);
        //끝이면 처음으로
        if(set.size()-1 <= index)
            index=0;
        // > sync
        tv.setText(set.get(index));

        push_s_correct();
        push_s_total();

//        show();
    }
    private void push_s_correct(){
        //맞음 1증가 시켜서 setText
        String temp=s_correct.getText().toString();
        int temp2=Integer.valueOf(temp)+1;
        s_correct.setText(String.valueOf(temp2));
    }
    private void push_s_inco(){
        //맞음 1증가 시켜서 setText
        String temp=s_inco.getText().toString();
        int temp2=Integer.valueOf(temp)+1;
        s_inco.setText(String.valueOf(temp2));
    }
    private void push_s_total(){
        //맞음 1증가 시켜서 setText
        String temp=s_total.getText().toString();
        int temp2=Integer.valueOf(temp)-1;
        s_total.setText(String.valueOf(temp2));
    }


    private void show(){
        for(String s:set){
            System.out.println(s);
        }
        System.out.println("           "+set.size());
    }
    private boolean complete(){
        if(set.size()==0) {
            cm.stop();
            System.out.println("컴플리트");
            tv.setText("완료");
            saveData();
            return true;
        }
        return false;
    }

    private void saveData(){
        SavedDate sd=StaticPref.loadPref_savedDate(getApplicationContext());
        String weekDay;
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy.MM.dd EEE HH:mm");
        Calendar calendar = Calendar.getInstance();
        weekDay = dayFormat.format(calendar.getTime());
        sd.date.add(weekDay);
        sd.time.add(cm.getText().toString());
        sd.inco.add(s_inco.getText().toString());
        StaticPref.savePref_savedDate(getApplicationContext(), sd);
    }

    public void scoreCheckButtonOnClicked(View view) {
        Intent intent = new Intent(this, NumPrac_mem_Activity.class);
        startActivity(intent);
    }
}
