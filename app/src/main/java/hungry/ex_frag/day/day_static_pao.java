package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-22.
 */
public class day_static_pao {
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "숫자를 외우는 신무기를 장착해봅시다.\n" +
                        "[반드시 '첫번째 도전'을 끝내고 진행해주세요]",
                R.drawable.dp_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "밀러의 실험에서 사람은 평균적으로 한번에 7개의 정보를 기억했습니다.\n" +
                        "(숫자나 무작위 알파벳 같은 의미 없는 정보)\n" +
                        "순간적인 기억은 단기기억 또는 작업기억이라 불립니다. 지속되는 시간은 20초 미만으로 극도로 짧습니다.\n" +
                        "더 많이 기억 할 수 있는 방법은 없을까요??",
                R.drawable.dp_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "청킹, 덩어리짓기, 묶음짓기 모두 같은 의미입니다. 정보를 의미 있는 묶음 덩어리로 만든다면 한번에 외울 수 있는 양이 늘어나게 됩니다." +
                        "사실 청킹은 일상에서 무의식, 의식적으로 항상 쓰여지고 있습니다.",
                R.drawable.dp_3));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "방법은 간단합니다. 자신의 머리속에 있는 장기기억과 새로운 정보를 묶어주면 됩니다. 다음으로 가서 예를 봅시다.",
                R.drawable.dp_4));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "어떻게 묶음이 지어지나요?\n" +
                        "010은 휴대폰 앞자리, 119는 소방소, 112는 경찰서 9개의 숫자가 3덩어리로 잘립니다. 훨씬 효율적으로 외울 수 있게 됐습니다.\n" +
                        "또한 청킹은 숫자에만 국한된 것이 아니라 모든 정보에 적용됩니다.",
                R.drawable.dp_5));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "오늘 장착할 신무기인 PAO시스템 입니다. 숫자-인물 변환에서는 2자리 숫자를 인물하나로 변환 할 수 있었죠. 이것도 청킹입니다." +
                        " PAO시스템을 활용하면 4자리 숫자를 PAO로 변환할 수 있습니다.\n" +
                        "P: PERSON(사람), A: ACTION(행동), O: OBJECT(사람+행동) 입니다. 다음으로 가서 예를 살펴봅시다.",
                R.drawable.dp_6));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "78: ㅅㅇ -> 성유리 , 04: ㅊㅎ -> 최홍만, 사람(P)과 행동(A)을 합쳐서 이미지로 저장합니다.\n" +
                        "핑클의 성유리가 K1무대에서 양손으로 내 목을 잡고 니킥으로 공격한다. 코피가 난다.\n" +
                        "한번 여러분의 이미지로 바꿔 볼까요?",
                R.drawable.dp_7));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "8분이 지나면 알람을 울려드립니다. 기억의 궁전을 이용해서 다음 숫자를 외워봅시다.",
                R.drawable.dp_8));
        Day_Activity.alarmTimeHM.put(Day_Activity.setArrayCount, 8 * 60);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, 0);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "맞추셨나요?? 잘하셨습니다.\n\n" +
                        "특정 도시들의 위도 경도 정보였습니다. (아무 의미 없지만...)\n" +
                        "서울   12.7  37.6\n" +
                        "뉴욕   40.8  73.9\n" +
                        "런던   51.5  0\n" +
                        "시드니 34.3  151\n" +
                        "밖에 나가시면 자동차 번호판이 많이 보입니다. 매장이나 가게의 간판에 전화번호도에 붙어 있습니다. 매장은 공간을 포함하고 있으므로 그 자체가\n" +
                        " 기억의 궁전이 되기 때문에 상당히 재밋습니다(?). 쭉쭉 외우면서 숫자 기억을 마스터 해봅시다.\n" +
                        "day6-숫자2 오른쪽에 PAO 연습도 있으니 하루 한번씩 연습해보세요.",
                R.drawable.d2_16));
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();
    }
}
