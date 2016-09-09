package hungry.ex_frag.numSample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import hungry.ex_frag.R;

class GridViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> al;

    public GridViewAdapter(Context context, ArrayList<String> al) {
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
        tv.setTextAppearance(context, android.R.style.TextAppearance_Large);

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