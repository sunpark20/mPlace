package hungry.ex_frag.picTest;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by soy on 2016-08-08.
 */
public class PutData {
    static ArrayList<RandomNum> rNumAl=new ArrayList<>();
    public static void setTiArray(Context c) {
        pic_Activity.initAllArray();
        makeRandomNum();

        //page1
        pic_Activity.tiArray=new ArrayList<>();
        pic_Activity.tiArray.add(new TI(
                "0.5초 마다 바뀌는 사진을 유심히 보고, 다음으로 갑시다.",
                0));
        //animation
        AnimationDrawable animation=new AnimationDrawable();

        for(int i=1;i<rNumAl.size();i++){
            String name="i"+rNumAl.get(i).getNum();
            int resID = c.getResources().getIdentifier(name , "drawable", c.getPackageName());
            animation.addFrame(c.getResources().getDrawable(resID), 500);
        }
//        animation.addFrame(c.getResources().getDrawable(R.drawable.i2), 1000);
        animation.setOneShot(true);
        pic_Activity.CustomAniHM.put(pic_Activity.setArrayCount, animation);
        pic_Activity.youtubeAL.add(pic_Activity.setArrayCount);
        Static.set();

        //page2
        pic_Activity.tiArray=new ArrayList<>();
        pic_Activity.tiArray.add(new TI(
                "0.5초 마다 바뀌는 사진을 유심히 보고, 다음으로 갑시다.",
                0));
        Static.set();
    }
    static void makeRandomNum(){
        //rNumAl 변수는 액티비티를 나갔다 왔을 때도 스태틱이라서 초기화가 안된다. 여기서 초기화
        rNumAl.clear();
        for(int i=1;i<=21;i++){
            RandomNum rn=new RandomNum(i);
            rNumAl.add(rn);
        }
        Collections.shuffle(rNumAl);
    }
}

class RandomNum {
    private int num;
    private boolean used;

    public RandomNum(int num) {
        this.num = num;
        this.used = false;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
