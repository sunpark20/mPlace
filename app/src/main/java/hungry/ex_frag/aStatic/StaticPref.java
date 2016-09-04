package hungry.ex_frag.aStatic;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;

import hungry.ex_frag.numPrac.SavedDate;

/**
 * Created by soy on 2016-01-07.
 */
public class StaticPref {
    // < HashSet<Boolean> sharedpreference
    public static void savePref_score(Context c, HashSet<Integer> al) {
        final String name = "PREF_SCORE";
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String s= new Gson().toJson(al);
        editor.putString(name, s);
        editor.commit();
    }

    public static HashSet<Integer> loadPref_score(Context c){
        final String name = "PREF_SCORE";
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
        String s = sharedPreferences.getString(name, "defValue");
        if(s.compareTo("defValue")==0) {
            System.out.println("score 해쉬셋이 없네유 빈 껍데기를 리턴해드려유");
            return new HashSet<Integer>();
        }
        else {
            Type type = new TypeToken<HashSet<Integer>>() {}.getType();
            HashSet<Integer> prefTeam = new Gson().fromJson(s, type);
            return (HashSet<Integer>) prefTeam;
        }
    }
    //END  HashSet<Boolean> sharedpreference

    // < HashSet<Boolean> sharedpreference
    public static void savePref_savedDate(Context c, SavedDate sd) {
        final String name = "PREF_savedDate";
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(sd); // myObject - instance of MyObject
        editor.putString(name, json);
        editor.commit();
    }

    public static SavedDate loadPref_savedDate(Context c){
        final String name = "PREF_savedDate";
        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
        Gson gson = new Gson();
        String json = mPrefs.getString(name, "defValue");
        if(json.compareTo("defValue")==0) {
            System.out.println(name+ "없음");
            return new SavedDate();
        }else{
            SavedDate obj = gson.fromJson(json, SavedDate.class);
            return obj;
        }
    }
    //END  HashSet<Boolean> sharedpreference

//    //START  ArrayList<String> sharedpreference
//    public static void savePref_long(Context c, long millis) {
//        final String name = "PREF_LONG";
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putLong(name, millis);
//        editor.commit();
//    }
//    public static Long loadPref_long(Context c){
//        final String name = "PREF_LONG";
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
//        Long millis=sharedPreferences.getLong(name, 0);
//        return millis;
//    }
//    //START  ArrayList<String> sharedpreference
//
//    //START string sharedpreference
//    public static void savePref_String(Context c,String TAG, String str, String name) {
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        Log.e(TAG, "savePref_String: "+str+" saved");
//        editor.putString(name, str);
//        editor.commit();
//    }
//    public static String loadPref_String(Context c,String TAG, String name){
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
//        String str=sharedPreferences.getString(name, "defValue");
//        Log.e(TAG, "loadPref_String: " + str + " loaded");
//        return str;
//    }
//    //END string sharedpreference

    /*//START  ArrayList<String> sharedpreference
    public static void savePref_prefTeam(Context c, ArrayList<String> al) {
        final String name = "PREF_TEAM";
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String s= new Gson().toJson(al);
        editor.putString(name, s);
        editor.commit();
    }
    public static ArrayList<String> loadPref_prefTeam(Context c){
        final String name = "PREF_TEAM";
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
        String s = sharedPreferences.getString(name, "defValue");
        if(s.compareTo("defValue")==0)
            return new ArrayList<String>();
        else {
            Type type = new TypeToken<List<String>>() {}.getType();
            List<String> prefTeam = new Gson().fromJson(s, type);
            return (ArrayList<String>) prefTeam;
        }
    }
    //END  ArrayList<String> sharedpreference

    //START  Map<Integer, AlarmInfo> prefInfo
    public static void savePref_prefInfo(Context c, Map<Integer, PrefInfo> pi) {
        final String name = "PREF_INFO";
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String gridJsonString= new Gson().toJson(pi);
        editor.putString(name, gridJsonString);
        editor.commit();
    }

    public static Map<Integer, PrefInfo> loadPref_prefInfo(Context c) {
        final String name = "PREF_INFO";
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c.getApplicationContext());
        String s = sharedPreferences.getString(name, "defValue");
        if(s.compareTo("defValue")==0)
            return new HashMap<Integer, PrefInfo>();
        else{
            Type type = new TypeToken<Map<Integer, PrefInfo>>() {}.getType();
            Map<Integer, PrefInfo> prefInfo = new Gson().fromJson(s, type);
            return (Map<Integer, PrefInfo>)prefInfo;
        }
    }
    //Map<Integer, AlarmInfo> prefInfo*/
}
