package hungry.ex_frag.day1;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-08.
 */
public class day2_static {

    private static String w="\n   ▽\n눈을 감고 상상해봅시다. 15초 후에 알려드립니다.";

    //resource 할당  길이가 너무 기니까 젤 밑에 놔두자------------------------------------------------------------
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "두뇌는 숫자보다 이미지를 쉽게 기억합니다.\n   ▽\n오늘은 이미지를 활용해보겠습니다.",
                R.drawable.d1_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "영희는 비상사태를 대비해서 부모님의 폰번호를 외우려고 합니다.\n   ▽\n0~9의 숫자를 이미지로 바꿔보는 연습을 해보겠습니다.",
                R.drawable.d1_0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자 0을 터치해주세요",
                R.drawable.d1_4));
        Day_Activity.touchPage.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "저는 숫자 0을 보면 축구공을 떠올립니다. 다음을 눌러 여러분도 해봅시다.",
                R.drawable.d1_5));
        Day_Activity.touchPage.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "눈을 감고 숫자0을 자신만의 축구공으로 바꿔봅시다."+w,
                0));
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_8_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "0은 축구공입니다.",
                0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "3분만 집중해주세요.\n   ▽\n나머지 1~9도 이미지로 바꿔보는 연습을 해봅시다.\n   ▽\n각 숫자와 닮은 이미지를 떠올리시면 됩니다. 다음으로 갑시다.",
                R.drawable.d1_9));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자1을 바꿔 봅시다.\n   ▽\n이번 올림픽에서 멋지게 활약했던 박상영 선수네요.\n   ▽\n박상영 선수의 검이 1과 비슷하게 생겼네요." + w,
                R.drawable.d1_10_2));
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_10_ani);
        Static.setBundle();


        Day_Activity.tiArray.add(new TI(
                "1은 검입니다.\n   ▽\n아이고 똥꼬에 찔리면 아프겠어요.",
                0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자2를 바꿔 봅시다.\n   ▽\n호수위의 저 백조숫자 2와 닮았나요?"+w,
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
                "5는 낚시바늘 입니다.\n   ▽\n베이거나 찔리는 것은 끔찍하지만 기억에 잘 남습니다",
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
                "숫자9를 바꿔 봅시다.외알 안경입니다.\n   ▽\n옛날 드라마에서 본 것 같네요.",
                R.drawable.d1_26)); //26
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_26_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "9는 외알안경입니다.\n   ▽\n 다음으로 가볼까요?",
                0)); //27
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "눈을 감고 다음 미션을 수행하세요.\n   ▽\n폰을 놓고, 눈을 감은 뒤 0~9까지 숫자를 변환된 이미지로 떠올려본다.\n   ▽\n혹시 잘 떠오르지 않으면 다시 복습하시고 오세요.\n   ▽\n그리고 다음을 눌려주세요.",
                R.drawable.umm)); //28
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "영희 엄마의 전화번호입니다. 이 전화번호를 2개씩 묶을 것입니다. 다음으로 가봅시다.",
                R.drawable.exam)); //29
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "2개씩 연결한 체인들은 기억들을 단단하게 묶어줍니다.\n   ▽\n이미지들로 이야기를 만들 것입니다.\n다음을 눌러 방법을 봅시다.",
                R.drawable.chain)); //30
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "눈을 감고 다음 미션을 수행하세요\n   ▽\n1.(괄호) 속 내용은 이유나 배경입니다.\n   ▽\n2.밑의 예시를 보고 장면을 상상하세요\n   ▽\n42:(날씨가 좋아 놀러간다)요트에 백조를 태웠다.\n   ▽\n25:(갑자기 바람이 불어서)백조가 갈고리에 찔렸다.\n   ▽\n56:(또 강풍이 불어요)갈고리는 앵두도 찔렀다.",
                R.drawable.phone)); //31
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "699:(상처를 치료하기 위해 앵두 안경을 만듦)앵두를 외알안경 2개에 안경알 대신 박았다.\n   ▽\n97:(상처를 치료하려고)외알안경과 마법의 지팡이를 착용했다.\n   ▽\n78:(전문의사인 눈사람이 왔다)지팡이를 눈사람에게 꽂아 팔을 만들어 줬다.",
                R.drawable.phone)); //32
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "이야기 만들기는 다소 어려울 수 있습니다.\n   ▽\n하지만 이치에 맞지 않는 이야기도 체인과 이미지의 힘으로 보완할 수 있습니다.\n   ▽\n상상은 당신의 몫입니다. 5분이 지나면 알려드릴께요.",
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
                "맞추셨다면 아주 잘 하셨습니다.\n   ▽\n다 기억나지 않더라도 괜찮습니다.\n   ▽\n사실 이 방법은 조금 어렵습니다.\n   ▽\n다음 시간에는 그 한계를 뛰어 넘을 수 있는 기억법을 가르쳐 드리죠.",
                R.drawable.d0_3)); //33
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "오늘의 키워드 생생한 이미지와 스토리!!기억하세요.\n   ▽\n다음 시간에 만나요. 바이바이",
                R.drawable.d1_2)); //35
        Static.setBundle();
    }

}
