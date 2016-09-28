package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-22.
 */
public class day4_static {
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "오늘은 숫자를 외우는 기억법입니다. day2보다 훨씬 효율적인 방법입니다.\n" +
                        "먼저 숫자를 한글의 자음으로 변환합니다. 그리고 자음을 인물로 변환하고 기억의 궁전에 넣을 것입니다.",
                R.drawable.d4_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자에 한글 자음을 순서대로 맞추면 됩니다. 지금 당장 외울 필요는 없습니다." +
                        "손가락을 접으며 기역..니은..디귿.. 하면 알아낼 수 있으니까요.\n" +
                        "숫자는 뜻이 없고 추상적이기 때문에 기억하기 어렵습니다. 이것을 해결하기 위해서 " +
                        "1648년 독일의 \'J.winkelann\'에 의해서 숫자의 자음화가 시작되었고 지금까지 계속 발전해왔습니다.",
                R.drawable.d4_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자 2개를 자음화 시키고 초성에 맞게 글자를 넣으면 됩니다. 2자리 이상의 단어가 되어도 앞 2자리만 사용하시면 됩니다. 술자리에서 하는 초성게임과 비슷합니다. 무슨 단어로도 바꿀 수 있지만, 사람으로 바꾸는 것을 추천드립니다.\n" +
                        "이유는 사람마다 차이점과 특징이 확실하기 때문입니다.",
                R.drawable.d4_a));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자를 글자로 바꾸고 이미지로 바꿔주시면 됩니다. 제가 만든 예를 참고하시고, 다음으로 가서 여러분만의 이미지를 만들어봅시다.\n" +
                        "60 - 연예인 배철수는 생방송도중 감전사고를 당합니다.\n" +
                        "61 - 롯데자이언트 치어리더 박기량이 제기 같이 생긴 치어리딩 도구를 쥐고 양손을 들고 응원하고 있습니다.\n" +
                        "62 - 만화 캐릭터 보노보노가 조개를 양손에 들고 있습니다.\n" +
                        "63 - (저는 3을 ㄷ,ㅌ으로 사용합니다) 배트맨이 박쥐가 그려진 검은 슈트를 입고 있습니다.\n" +
                        "64 - 텔레토비에 나오는 보라돌이입니다. 머리마크는 동그라미죠.\n" +
                        "65 - 무한도전에서 박명수가 우이쒸 하고 화를 냅니다.\n" +
                        "66 - 쇼미더 머니에 나왔던 바비가 랩을 하고 있습니다.\n" +
                        "67 - 박세리가 바지를 겆고 호수옆에 빠진 골프공을 쳐올립니다.\n" +
                        "68 - 바우와우는 제가 어릴때 보던 만화의 주인공 이름입니다. 바우와우가 침을 흘리고 있습니다.\n" +
                        "69 - 배지환은 제 사촌동생 이름 입니다. 이건 아무도 못써먹겠네요..,\n" +
						"명심하세요. 자신이 제일 처음 떠올린 이미지가 가장 강력한 기억입니다. 반드시 자신만의 이미지를 만드세요.",
                R.drawable.d4_3));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 10분 동안 60 ~ 79를 자신만의 인물로 바꿔서 외우자.\n펜과 종이를 써도 되고, 기억의 궁전도 함께 써서 외워보세요. 시간이 되면 알려드릴께요.\n\n다 외우셨으면 다음으로 넘어가세요.\n",
                R.drawable.d4_4));
        Day_Activity.alarmTimeHM.put(Day_Activity.setArrayCount, 10 * 60);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, 0);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "손바닥치기하고~ 조금 쉬고 갑시다. 이제 숫자를 보고 2자리씩 자음화시키고 이미지로 바꿔 기억의 궁전에 넣으면 됩니다. 다음으로 가서 미션을 수행해봅시다.",
                R.drawable.d2_16));
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 8분 동안 위의 숫자를 외우자.\n10개짜리 방으로 이루어진 기억의궁전이 필요하겠네요. day3에서 썼던 궁전을 다시 한번 써보세요. 한 방에 2개의 이미지가 있으면 헷갈릴 것 같지만 오히려" +
                        " 연상을 쉽게 해줍니다. 하지만 만약에 헷갈린다면 새로운 궁전을 짓고 도전하세요.\n다 외우셨으면 다음으로 넘어가세요.",
                R.drawable.d4_5));
        Day_Activity.alarmTimeHM.put(Day_Activity.setArrayCount, 8 * 60);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, 0);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "잘 외우셨나요?? 저는 숫자를 인물로 바꿀 때 엄청 오래걸렸습니다. 어릴적 하던 게임도 생각해보고 웹에서 온갖 자료를 보며 이미지를 만들었습니다." +
                        "\n다음 시간에 만나요~",
                R.drawable.d4_b));
        Static.setBundle();


    }
}
