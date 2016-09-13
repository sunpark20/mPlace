package hungry.ex_frag.mongo;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import hungry.ex_frag.LoadingActivity;

public class Thread_notice extends AsyncTask<String, Void, String> {
    final String TAG="Thread_notice";
    public static String notice;
    Context context;


    public Thread_notice(Context context){
        this.context=context;
    }

    @Override
    protected String doInBackground(String... arg0) {

        String result ="";
        QueryBuilder qb = new QueryBuilder();
        String urlString=qb.buildN();
        //보낸 url api 주소 확인
        Log.e(TAG, urlString);

        try {
            result = loadFromNetwork(urlString);
        }catch (IOException e) {
            Log.e(TAG, "connection_error");
        }
        return result;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        try{
            JSONArray ja=new JSONArray(result);
            JSONObject jo=ja.getJSONObject(0);
            notice=jo.get("text").toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        Log.e(TAG, "string받음 "+notice);

        LoadingActivity.mHandler.sendEmptyMessage(0);
    }

    /** Given a URL string, initiate a fetch operation. */
    private String loadFromNetwork(String urlString) throws IOException {
        InputStream stream = null;
        String str ="";

        try {
            stream = downloadUrl(urlString);
            str = readIt(stream);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally
        {
            if (stream != null) {
                stream.close();
            }
        }
        return str;
    }


    private String readIt(InputStream stream) throws IOException {

        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        for(String line = reader.readLine(); line != null; line = reader.readLine())
            builder.append(line);
        reader.close();
        return builder.toString();
    }

    private InputStream downloadUrl(String urlString) throws IOException {

        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(3000 /* milliseconds */);
        conn.setConnectTimeout(1500 /* milliseconds */);
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }
        // Start the query
        conn.connect();
        InputStream stream = conn.getInputStream();
        return stream;
    }

}//END query_score class
