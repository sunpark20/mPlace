package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-22.
 */
public class day4_static {
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "오늘은 숫자를 외우는 기억법입니다. day2에서도 숫자를 외웠습니다. 그때는 조금 어려웠죠.\n" +
                        "숫자를 인물로 변환하고 기억의 궁전에 넣을 것입니다.",
                R.drawable.d4_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자에 한글 자음을 순서대로 맞추면 됩니다. 지금 당장 외울 필요는 없습니다. " +
                        "손가락을 접으며 기역..니은..디귿.. 하면 알아낼 수 있으니까요.",
                R.drawable.d4_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자를 자음으로 변환시키고 생각나는 인물을 떠올립니다. 다른 단어나 물건으로도 만들 수 있지만, 저는 사람이 잘 외워지더라구요. 그리고 헷갈리지 않기 위해 외국인일 경우 풀네임만 사용합니다. 저는 대부분 한국 연예인이나 만화 캐릭터를 사용합니다. 인물의 글자수는 길어도 상관없고, 첫 2글자만 사용하면 됩니다.\n▽   \n제가 만든 인물 설명입니다. 이건 참고하시고, 다음으로 가서 여러분도 숫자를 인물로 바꿔봅시다.\n" +
                        "60 - 연예인 배철수는 가요무대에서 감전된 적이 있는데, 그 장면을 떠올립니다.\n"+
                        "61 - 롯데자이언트 치어리더 박기량이 제기 같이 생긴 치어리딩 도구를 쥐고 양손을 들고 응원하고 있습니다.\n"+
                        "62 - 만화 캐릭터 보노보노가 조개를 양손에 들고 있습니다.\n"+
                        "63 - (저는 3을 ㄷ,ㅌ으로 사용합니다) 배트맨이 박쥐가 그려진 검은 슈트를 입고 있습니다.\n"+
                        "64 - 텔레토비에 나오는 보라돌이입니다. 머리마크는 동그라미죠.\n"+
                        "65 - 무한도전에서 박명수가 우이쒸 하고 화를 냅니다.\n"+
                        "66 - 쇼미더 머니에 나왔던 바비가 랩을 하고 있습니다.\n"+
                        "67 - 박세리가 바지를 겆고 호수옆에 빠진 골프공을 쳐올립니다.\n"+
                        "68 - 바우와우는 제가 어릴때 보던 만화의 주인공 이름입니다. 바우와우가 침을 흘리고 있습니다.\n"+
                        "69 - 배지환은 제 사촌동생 이름 입니다. 이건 아무도 못써먹겠네요..\n",
                R.drawable.d4_3));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 10분 동안 60 ~ 79를 인물로 바꿔서 외우자.\n펜과 종이를 써도 되고, 기억의 궁전을 써서 외워도 됩니다. 시간이 되면 알려드릴께요.\n\n다 외우셨으면 다음으로 넘어가세요.\n",
                R.drawable.d4_4));
        Day_Activity.alarmTimeHM.put(Day_Activity.setArrayCount, 10 * 60);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, 0);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "손바닥치기하고 한 숨 쉬고 갑시다. 다음장에도 미션이 있습니다.",
                R.drawable.d2_16));
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 5분 동안 위의 숫자를 외우자.\n기억의궁전 할 줄 아시죠. 혹시 모른다면 day3부터 보고 오세요.\n기억의 궁전과 함께 외우시면 됩니다. day3에서 만들어 놓았던 방을 그대로 쓰셔도 됩니다. 기억의 궁전의 한 방에 2가지 이미지를 넣으면 오히려 더 기억을 잘 나게 해줍니다. 헷갈린다면 기억의 궁전을 하나 더 만들고 오세요!\n다 외우셨으면 다음으로 넘어가세요.",
                R.drawable.d4_5));
        Day_Activity.alarmTimeHM.put(Day_Activity.setArrayCount, 5 * 60);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, 0);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "잘 외우셨나요?? 저는 숫자를 인물로 변환할 때, 생각이 안나서 고생한 기억이 있네요. 다음 시간에 만나요~",
                R.drawable.d4_5));
        Static.setBundle();


    }
}
