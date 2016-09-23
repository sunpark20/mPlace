package hungry.ex_frag.day;

/**
 * Created by soy on 2016-08-22.
 */
public class day_static_pao {
    public static void setTiArray() {
        Day_Activity.initAllArray();
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자2 입니다.",
                0));
        Static.setBundle();
    }
}
