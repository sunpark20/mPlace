package hungry.ex_frag.numPrac;

import android.os.Bundle;
import android.widget.GridView;

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
        gridview.setAdapter(new GridViewAdapter(this, makeSet()));
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

