package hungry.ex_frag;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

import hungry.ex_frag.mongo.Thread_notice;
import com.google.android.gms.ads.MobileAds;

public class LoadingActivity extends ActivityHelper{
    public static MyHandler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        getSupportActionBar().hide();
        mHandler= new MyHandler(this);

        //애드몹
        String myCode = getString(R.string.addmop_code);
        MobileAds.initialize(this, myCode);


        //https://api.mlab.com/api/1/databases/my-db/collections/my-coll?apiKey=myAPIKey
        //https://api.mlab.com/api/1/databases/my-db/collections/my-coll?q={"active": true}&apiKey=myAPIKey
        new Thread_notice(this).execute();
    }

    public static class MyHandler extends Handler {
        private final WeakReference<LoadingActivity> mActivity;

        public MyHandler(LoadingActivity activity) {
            mActivity = new WeakReference<LoadingActivity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            LoadingActivity activity = mActivity.get();
            if (activity != null) {
                Intent intent = new Intent(activity, MainActivity.class);
                activity.startActivity(intent);
                activity.finish();
            }
        }
    }
}



