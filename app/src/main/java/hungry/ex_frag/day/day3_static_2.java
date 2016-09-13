package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-22.
 */
public class day3_static_2 {
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "그리스 고서 rhetorica ad herennium에 소개된 장소기억법에 대한 내용입니다.",
                R.drawable.d32_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "기억의 궁전은 장소와 모상으로 이루어집니다.\n" +
                        "스케치북에 물감으로 그림을 그릴 수 있듯이 장소는 스케치북, 모상은 그림이라고 생각하세요",
                R.drawable.d32_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "장소는 나무나 강과 같은 자연물이나 사람이 지은 건축물, 또는 상상력을 더해 설정해 놓은 눈에 잘 띄는" +
                        " 장면입니다.\n" +
                        "장소는 기초적인 뼈대 역할을 하기 때문에 아주 중요합니다. ",
                R.drawable.d32_6));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "장소는 순서대로 기억하고 있어야 합니다." +
                        " 서울, 대전, 대구, 부산은 쉽지만 그 사이에 광주를 넣는다면 혼란스러울 것입니다." +
                        " 순서를 확실히 해야 정보를 순서대로 끄집어 낼 수 있습니다. ",
                R.drawable.d32_4));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "장소에 사람이나 사물이 너무 많다면 혼란스럽습니다. 심플한 장소가 모상을 놔두기" +
                        " 쉽습니다. 또한 장소는 적당한 크기가 좋습니다. 너무 크면 모상이 잘 안보이고, 너무 작으면" +
                        " 모상을 놔두기가 어렵습니다. 너무 밝거나 어두워도 안되며, 장소 사이의 간격도 쉽게 다음 장소가" +
                        " 보일 수 있도록 설정하는 것이 좋습니다.",
                R.drawable.d32_3));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "(3세 이상 이용가능인데... 모자이크만 하면 되려나)\n" +
                        "모상은 모습, 형태, 흔적, 모사물 같은 것을 말합니다. 인간의 뇌는 익숙한 것 보다는 새로운 것," +
                        "야한장면, 끔찍스러운 것, 칼날에 베인 아픈 상처, 새빨간 피 같은 충격적인 것을 쉽게 기억합니다." +
                        " 그래서 우습게도 남자는 이런 장면을 많이 사용하고, 여자는 감정적인 것들을 사용한다고 합니다." +
                        " 외설적인 것을 적극 활용하면 도움이 됩니다. 참고로 이점은 고대에도 기억술이 천대받는 원인이 되었습니다.",
                R.drawable.d32_5));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "꾸준하게 장소를 확보해야 많은 것들을 담을 수 있습니다. 꾸준히 연습하시다 보면 어떤 장소가 좋은지," +
                        " 어떤 모상이 잘 안보였는지 점차 알수 있을 겁니다. 화이팅! 바바이",
                0));
        Static.setBundle();

        //모상은 글자와 마찬가지로 지울 수 있지만, 장소는 그대로 재사용 할수 있습니다.
    }
}
