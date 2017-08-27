package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-08.
 */
public class day2 {

    private static String w="\n   ▽\n눈을 감고 상상해봅시다\n15초 후에 알람이 울립니다.";

    //resource 할당
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "뇌가 잘 기억하지 못하는 것을 기억하기 쉬운 것으로 바꾸기!!\n   ▽\n" +
                        "(기억하기 어려운)숫자를 (기억하기 쉬운)이미지로 바꿔 봅시다.",
                R.drawable.d1_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "영희는 부모님의 폰번호를 외우려고 합니다.(영희==효녀)\n   ▽\n0~9의 숫자를 이미지로 상상하는 연습을 해보겠습니다.",
                R.drawable.d1_0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자 0을 터치해주세요",
                R.drawable.d1_4));
        Day_Activity.touchPage.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "저는 숫자 0을 보면 축구공을 떠올립니다.\n   ▽\n어제 하셨던 머리속으로 상상하기 잊지 않으셨겠죠??\n다음을 눌러 진행해 봅시다.",
                R.drawable.d1_5));
        Day_Activity.touchPage.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자0을 자신만의 축구공으로 바꿔봅시다."+w,
                0));
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_8_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "0은 축구공입니다.",
                0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "3분만 집중해주세요.\n   ▽\n나머지 숫자(1~9)도 이미지로 바꿔볼까요.\n   ▽\n각 숫자와 닮은 이미지를 떠올리시면 됩니다. 고고고",
                R.drawable.d1_9));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자1을 바꿔 봅시다.\n   ▽\n이번 올림픽에서 멋지게 활약했던 박상영 선수네요.\n   ▽\n검이 1과 비슷하게 생겼네요." + w,
                R.drawable.d1_10_2));
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_10_ani);
        Static.setBundle();


        Day_Activity.tiArray.add(new TI(
                "1은 검입니다.\n   ▽\n찔리면 엄청 아프겠어요.",
                0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자2를 바꿔 봅시다.\n   ▽\n호수위의 백조, 숫자 2와 닮았나요?"+w,
                0));
        Day_Activity.firstPageAniDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_12_ani);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_13_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "2는 백조입니다.",
                0)); //13
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자3 바꿔 봅시다.\n   ▽\n갈매기를 옆으로 돌리면 3과 비슷합니다. 어디서 바다짠내도 나지 않아요?"+w,
                R.drawable.d1_14)); //14
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.seagull);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_14_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "3은 갈매기입니다.",
                0)); //15
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자4를 바꿔 봅시다.\n   ▽\n요트 타보셨나요?"+w,
                R.drawable.d1_16)); //16
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_16_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "4는 요트입니다.",
                0)); //17
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자5를 바꿔 봅시다.\n   ▽\n5에 찔리면 엄청 아프겠네요."+w,
                R.drawable.d1_18)); //18
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_18_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "5는 낚시바늘 입니다.\n   ▽\n베이거나 찔리는 상상은 기억에 잘 남습니다",
                0)); //19
        Static.setBundle();
//
        Day_Activity.tiArray.add(new TI(
                "숫자6을 바꿔 봅시다.\n   ▽\n빠알간 앵두네요. 숫자 6이 보이시나요??",
                R.drawable.d1_20)); //20
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_20_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "6은 새빨간 앵두입니다. 거의 다 왔습니다.",
                0)); //21
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자7을 바꿔 봅시다.\n   ▽\n꼬부랑 할머니의 지팡이가 7과 닮았네요.",
                R.drawable.d1_22)); //22
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_22_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "7은 꼬부랑 할머니의 지팡이 입니다.",
                0)); //23
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자8을 바꿔 봅시다.\n   ▽\n눈사람, 8과 비슷한가요.\n   ▽\n이름은 올라프구요, 우리집 냉장고에 삽니다.",
                R.drawable.d1_24)); //24
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_24_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "8은 눈사람입니다. 다음으로 가볼까요?",
                0)); //25
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자9를 바꿔 봅시다. 구구콘!! 9와 안닮았지만.. 그냥 하세요..\n   ▽\nppl 아닙니다ㅜㅜ",
                R.drawable.d1_26)); //26
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_26_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "9는 구구콘입니다.\n   ▽\n 다음으로 가볼까요?",
                0)); //27
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 0~9를 이미지로 변환하자.\n폰을 놓고, 눈을 감은 후, 0~9까지 숫자를 변환된 이미지로 떠올려본다.\n   ▽\n" +
                        "혹시 잘 떠오르지 않으면 다시 복습하시고 오세요.\n   ▽\n" +
                        "다 떠올렸다면 다음으로 고고!!",
                R.drawable.umm)); //28
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "영희 어머니의 전화번호입니다. 이 전화번호를 2개씩 묶을 것입니다. 다음으로 가봅시다.",
                R.drawable.exam)); //29
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "2개씩 연결한 체인들은 기억들을 단단하게 묶어줍니다.\n   ▽\n이미지들로 이야기를 만들어봅시다.\n다음을 눌러 방법을 봅시다.",
                R.drawable.chain)); //30
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션>\n   ▽\n(괄호)속 내용은 이유나 배경입니다.\n   ▽\n밑의 예시를 본 뒤, 눈을 감고 장면을 상상하세요. 한줄씩!! 상상!!\n   ▽\n42:바다로 가서 요트(4)에 백조(2)를 태웠다.\n   ▽\n25:(휘이잉~ 갑자기 바람이 분다)백조(2)가 휘청거리더니 갈고리(5)에 찔렸다. 백조아파아파..\n   ▽\n56:(휘이휘이~한번 더 강풍이 분다)갈고리(5)는 앵두(6)도 찔렀다. 앵두는 터져버렸다..",
                R.drawable.phone)); //31
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "699:터져버린 앵두(6)는 버리고 구구콘(9) 2개를 먹었다. 냠냠\n   ▽\n97:먹던 구구콘(9)을 흘렸는데 지팡이(7)에 묻었다.\n   ▽\n78:지팡이(7)를 눈사람(8)에 슥~꽂아 팔을 만들어 줬다.\n슥~~ 따라오셨죠. 그냥 슥~ 다음장으로 가봅시다.",
                R.drawable.phone)); //32
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<기억해보자!>\n처음 시작점인 요트가 떠있는 바다로 가볼까요?? 눈을 감고 이야기를 떠올려보세요.\n\n" +
                        "몇 개 틀렸다구요? 괜찮아요. 자신이 만들어낸 이야기가 훨씬 기억에 잘 남을거에요. 다음 페이지로 가서 자신만의 이야기를 만들어 봅시다.",
                R.drawable.d2_16)); //17
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 이야기 만들기는 조금 어려울 수 있습니다.\n   ▽\n상상은 당신의 몫입니다. 5분이 지나면 알려드릴께요.",
                R.drawable.go)); //33
        Day_Activity.alarmTimeHM.put(Day_Activity.setArrayCount, 5 * 60);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, 0);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "하이파이브 한 번 하고 다음으로 갑시다.",
                R.drawable.d2_16)); //17
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "맞추셨다면 아주 잘 하셨습니다.\n   ▽\n다 기억나지 않더라도 괜찮습니다.\n   ▽\n사실 이 방법은 조금 어렵습니다.\n   ▽\n다음 시간에는 그 한계를 뛰어 넘을 수 있는 기억법 드디어 기억을 궁전을 배워봅시다.",
                R.drawable.d0_3)); //33
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "오늘도 역시 생생한 이미지 상상하기!! 그리고 자신만의 스토리!! 기억하세요.\n   ▽\n다음 시간에 만나요. 바이바이",
                R.drawable.d1_2)); //35
        Static.setBundle();
    }

}
