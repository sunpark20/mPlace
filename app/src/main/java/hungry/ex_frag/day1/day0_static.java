package hungry.ex_frag.day1;

import java.util.ArrayList;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-08.
 */
public class day0_static {
    
    //resource 할당  길이가 너무 기니까 젤 밑에 놔두자------------------------------------------------------------
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray=new ArrayList<>();
        Day_Activity.tiArray.add(new TI(
                "기억의 궁전은 로마 시대부터 전해오는 고대의 기억술입니다.",
                R.drawable.d0_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "인간의 뇌에는 장소를 관리하는 기관과 세포가 따로 있습니다. 그것을 이용한 기억법이 '기억의궁전'이죠.\n   ▽\n선천적으로 타고난 기억력과 상관없이 연습을 통해 뛰어난 기억력을 가질 수 있습니다.",
                R.drawable.d0_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "기억력대가의 강연을 하나 볼까요.\n   ▽\n데이터 조심하세요. 나중에 보셔도 됩니다.",
                0));
        Day_Activity.youtubeAL.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "간단한 기억법부터 차근차근 배워가며 기초를 다질 것입니다.\n   ▽\n최종목표는 '기억의궁전' 기억법을 배우는 것입니다.",
                R.drawable.d0_3));
        Static.setBundle();
    }

}
