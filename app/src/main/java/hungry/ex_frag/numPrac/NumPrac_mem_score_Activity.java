package hungry.ex_frag.numPrac;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import hungry.ex_frag.ActivityHelper;
import hungry.ex_frag.R;


/**
 * Created by soy on 2016-08-31.
 */
public class NumPrac_mem_score_Activity extends ActivityHelper {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numprac_mem_score);

        GridView gridview = (GridView) findViewById(R.id.gridView);
        gridview.setAdapter(new TextViewAdapter(this, makeSet()));

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
        for (int a = 0; a < NumPrac_Activity.SIZE_TOTALNUM; a++) {
            String temp = String.valueOf(a);
            while (temp.length() < 4)
                temp = "0" + temp;
            al.add(temp);
        }
        return al;
    }
}

class TextViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> al;

    public TextViewAdapter(Context context, ArrayList<String> al) {
        this.context = context;
        this.al = al;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        TextView tv=null;

        //틀만 재사용한다.
        if (convertView == null) {
            gridView = new View(context);
            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.item_numprac_mem_score, null);
        } else {
            gridView = (View) convertView;
        }
        // set value into textview
        tv = (TextView) gridView
                .findViewById(R.id.num);
        tv.setText(al.get(position));

        //스코어 맞춘건 색깔
        if(NumPrac_Activity.score.contains(position)){
            tv.setTextColor(context.getResources().getColor(R.color.green));
            tv.setBackgroundColor(context.getResources().getColor(R.color.black));
        }else{
            setDefault(tv);
        }

        return gridView;
    }
    private void setDefault(TextView tv){
        tv.setTextColor(context.getResources().getColor(R.color.black));
        tv.setBackgroundColor(context.getResources().getColor(R.color.white));
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
