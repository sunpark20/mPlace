package hungry.ex_frag.numPrac;

import android.os.Bundle;
import android.widget.ListView;

import hungry.ex_frag.ActivityHelper;
import hungry.ex_frag.R;
import hungry.ex_frag.aStatic.StaticPref;

/**
 * Created by soy on 2016-08-31.
 */
public class NumPrac_mem_date_Activity extends ActivityHelper {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numprac_mem_date);

        ListView listView = (ListView) findViewById(R.id.listView);

        SavedDate sd=StaticPref.loadPref_savedDate(getApplicationContext());

        listView.setAdapter(new ListViewAdapter(this,sd));
    }
}

