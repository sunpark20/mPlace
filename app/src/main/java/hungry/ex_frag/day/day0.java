package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-08.
 */
public class day0 {

    //resource 할당시작
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "'기억의궁전'이라 불리는 기억술의 시초는 B.C 86년에 쓰여진 책입니다.\n" +
                        "고대에는 종이가 귀했기 때문에 기억술은 지식인의 필수교양으로 여겨졌습니다. 덕분에 고대에 기억술은 비약적으로 발전했고 후대에 전대질 수 있었습니다. "
                ,
                R.drawable.d0_5));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "동물들은 직감적으로 방향과 위치를 알고 있습니다. 뇌에는 위치를 인지하는 영역과 세포가 있습니다. " +
                        "이 공간을 이용한 기억법이 바로 '기억의궁전'입니다. \n\n" +
                        "하지만 이건 짠 하면 외워지는 마법같은 기술이 아닙니다. " +
                        "운동으로 근육을 키우는 것처럼 '기억의 궁전' 또한 꾸준한 훈련이 필요합니다. ",
                R.drawable.d0_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "프로 기억력 선수들과 '기억의궁전'을 배운 많은 사람들이 기억술의 힘을 증명하고 있습니다.\n" +
                "학교에서 성적을 잘 받거나, 얼굴과 이름을 기억하는 등 생활 전반에 도움이 될 것입니다." +
                " 그리고 옥스포드 사전의 6만개 단어의 뜻을 암기하고, 8만자리의 원주율값을 순서대로 외우는 등의 엄청난 능력을 발휘할 수도 있습니다.",
                R.drawable.d0_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "기억력대회를 취재하러 갔다가, 1년만에 미국기억력 챔피언이 된 기자의 ted 강연입니다.\n   ▽\n나중에 보셔도 됩니다. 데이터조심!",
                0));
        Day_Activity.youtubeAL.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "천재? 똑똑함? 과는 상관없습니다. 인간에게는 장소를 기억하는 힘이 있습니다."+
                        "\n간단한 기억법부터 시작해서 '기억의 궁전'을 배워 봅시다. 레츠고!",
                R.drawable.d0_3));
        Static.setBundle();
    }

}
