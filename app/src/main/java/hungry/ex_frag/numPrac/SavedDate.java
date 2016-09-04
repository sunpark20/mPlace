package hungry.ex_frag.numPrac;

import java.util.ArrayList;

/**
 * Created by soy on 2016-09-04.
 */
public class SavedDate {
    ArrayList<String> date=new ArrayList<>();
    ArrayList<String> time=new ArrayList<>();
    ArrayList<String> inco=new ArrayList<>();

    void show(){
        for(int i=0;i<date.size();i++){
            System.out.println(date.get(i));
            System.out.println(time.get(i));
            System.out.println(inco.get(i));
        }
    }
}
