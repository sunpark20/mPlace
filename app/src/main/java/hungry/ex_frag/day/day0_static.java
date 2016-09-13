package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-08.
 */
public class day0_static {
    
    public static void setTiArray() {
        Day_Activity.initAllArray();

        /* " 웹에 온갖 지식이 가득차 있는 세상에서 기억법이 무슨 의미가 있을까 생각할 수 도 있습니다. 저는 그 지식을 자신의 것으로 만들고," +
                " 구글의 검색엔진보다 놀라운 뇌의 연결능력을 통해 가치있는 지식과 나를 발견 할 수 있다고 믿습니다.",*/
       /* Day_Activity.tiArray.add(new TI(
                "먼저 앱을 만들게 된 이유에 대해 설명하겠습니다. 쉽게 기억의궁전을 접할 수 있는 징검다리의 역할을 하려고 합니다.",
                R.drawable.d0_0));
        Static.setBundle();*/

        Day_Activity.tiArray.add(new TI(
                "'기억의 궁전'이라 불리는 기억법은 고대 유럽에서부터 시작됐습니다. 당시 종이에 문자를 기록하는 것은 값이 비싸고 힘든 일이었습니다." +
                        " 덕분에 머리에 기억을 저장하는 기억술들이 비약적으로 발전했습니다.",
                R.drawable.d0_5));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "인간의 뇌에는 장소를 관리하는 기관과 세포가 따로 있습니다. 그것을 이용한 기억법이 '기억의궁전'입니다. 이는 어떤 마법도 아니고" +
                        " 짠 하면 외워지는 기술도 아닙니다. 운동으로 근육을 키우는 것과 같이 기억의 궁전 또한 노력과 훈련이 필요합니다." +
                        " 하지만 선천적인 지능과 관계 없이 모든 사람의 기억을 극대화 시킬수 있는 도구입니다.",
                R.drawable.d0_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "전문 기억술사와 많은 일반사람들이 다음을 증명하고 있습니다." +
                "기억의 궁전을 통해 학교에서 좋은 성적을 내고, 지인들의 전화번호를 외울 수 있으며, 할일을 새겨두는 것부터," +
                " 옥스포드 사전의 6만개 단어의 뜻을 암기하고 8만자리의 원주율값을 순서대로 외울 수 있습니다.",
                R.drawable.d0_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "기억력 대회를 취재하러 갔다가 1년만에 미국기억력 챔피언이 된 기자의 강연을 봅시다.\n   ▽\n데이터 조심하세요. 나중에 보셔도 됩니다.",
                0));
        Day_Activity.youtubeAL.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "간단한 기억법부터 차근차근 배워가며 기초를 다질 것입니다.\n   \n최종 목표는 '기억의 궁전' 기억법을 배우는 것입니다.",
                R.drawable.d0_3));
        Static.setBundle();
    }

}
