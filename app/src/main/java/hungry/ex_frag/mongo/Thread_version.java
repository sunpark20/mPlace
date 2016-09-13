package hungry.ex_frag.mongo;

import android.content.Context;
import android.os.AsyncTask;

import hungry.ex_frag.MainActivity;
import hungry.ex_frag.MarketVersionChecker;

public class Thread_version extends AsyncTask<String, Void, String> {
    final String TAG="Thread_version";
    Context context;

    public Thread_version(Context context){
        this.context=context;
    }

    @Override
    protected String doInBackground(String... arg0) {
        String result=null;
        //업데이트 다이얼로그 띄우기
        try {
            String store_version = MarketVersionChecker.getMarketVersion(context.getPackageName());
            String device_version = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
          if (store_version.compareTo(device_version) > 0) {
              return "update";
          } else {
              return "no";
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        try {
            if(result.compareTo("update")==0)
                MainActivity.mHandler.sendEmptyMessage(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
