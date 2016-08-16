package hungry.ex_frag.day1;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-08.
 */
public class day2_static {

    private static String w=" 눈을 감고 상상해봅시다. 15초 후에 알려드립니다.";

    //resource 할당  길이가 너무 기니까 젤 밑에 놔두자------------------------------------------------------------
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "두뇌는 숫자보다 이미지를 쉽게 기억합니다. 0~9까지 숫자를 이미지로 바꿔서 이용해보도록 하죠.",
                R.drawable.d1_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "영희는 비상사태를 대비해서 부모님의 폰번호를 외우려고 합니다. 일단 0~9의 숫자를 이미지로 바꿔봅시다. 다음으로 가봅시다.",
                R.drawable.d1_0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자 0을 터치해주세요",
                R.drawable.d1_4));
        Day_Activity.touchPage.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "축구공이 되었네요. 한번 더 터치해 볼까요?",
                R.drawable.d1_5));
        Day_Activity.touchPage.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "나이키 축구공이네요. 나이키 같은 세세한 특징을 만들어주면 기억에 도움이 됩니다.",
                R.drawable.d1_6a7));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "눈을 감고 자신만의 축구공을 상상해봅시다. 15초 후에 알람으로 알려드립니다.",
                0));
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_8_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "0은 축구공입니다. 다음으로 가볼까요",
                0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "3분만 집중해주세요. 1~9도 이미지로 바꿔 봅시다. 다음을 눌러주세요!",
                R.drawable.d1_9));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "혹시 올림픽 보셨어요?? 검이 1과 비슷하게 생겼네요." + w,
                R.drawable.d1_10_2));
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_10_ani);
        Static.setBundle();


        Day_Activity.tiArray.add(new TI(
                "1은 검입니다. 다음으로 가볼까요.",
                0));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자 2와 닮았나요? 눈을 감고 알람시간까지 상상해 보세요.",
                0));
        Day_Activity.firstPageAniDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_12_ani);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_13_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "2는 백조입니다. 다음으로 가볼까요.",
                0)); //13
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "갈매기를 옆으로 돌리면 3과 비슷합니다. 바다 냄새와 함께 상상해 보세요.",
                R.drawable.d1_14)); //14
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.seagull);
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_14_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "3은 갈매기입니다. 다음으로 가볼까요.",
                0)); //15
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "요트 타보셨나요? 눈을 감고 4를 떠올려보세요. 알람으로 알려드릴께요.",
                R.drawable.d1_16)); //16
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_16_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "4는 요트입니다. 다음으로 가볼까요.",
                0)); //17
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "5에 찔리면 엄청 아프겠네요. 알람시간까지 상상해볼까요.",
                R.drawable.d1_18)); //18
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_18_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "5는 낚시바늘 입니다. 베이거나 찔리는 것은 끔찍하지만 기억에 잘 남습니다. 다음으로 가볼까요.",
                0)); //19
        Static.setBundle();
//
        Day_Activity.tiArray.add(new TI(
                "빠알간 앵두입니다. 6이 보이시나요?? 눈을 감고 알람시간까지 상상해볼까요.",
                R.drawable.d1_20)); //20
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_20_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "6은 새빨간 앵두입니다. 거의 다 왔습니다. 다음으로 가볼까요.",
                0)); //21
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "꼬부랑 할머니의 지팡이가 7과 닮았네요." + w,
                R.drawable.d1_22)); //22
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_22_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "7은 꼬부랑 할머니의 지팡이 입니다.",
                0)); //23
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "눈사람, 8과 비슷한가요. 이름은 올라프입니다. 눈으로 만들어졌답니다.",
                R.drawable.d1_24)); //24
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_24_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "8은 눈사람입니다. 다음으로 가볼까요?",
                0)); //25
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "외알 안경입니다. 옛날 드라마에서 본 것 같네요. 알람시간까지 상상해봅시다.",
                R.drawable.d1_26)); //26
        Day_Activity.alarmDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_26_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "9는 외알안경입니다. 다음으로 가볼까요?",
                0)); //27
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "폰을 놓고 눈을 감은 뒤 0~9까지의 이미지를 떠올려보세요. 천천히 떠올려보세요. 다 떠올리셨다면 다음을 눌려주세요.",
                R.drawable.umm)); //28
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "영희 엄마의 전화번호입니다. 이 전화번호를 2개씩 묶을 것입니다.(계속 2개씩 중첩해서 묶습니다. 예제를 보시면 알꺼에요) 다음으로 가봅시다.",
                R.drawable.exam)); //29
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "2개씩 계속 연결하는 것을 '체인'이라고 합니다. 이미지들로 이야기를 만들 것입니다. 다음을 눌러 예시를 봅시다.",
                R.drawable.chain)); //30
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "머리속에서 상상해주세요! ()속 내용은 이유나 배경입니다.\n42:(날씨가 좋아서)요트에 백조를 태웠다.\n25:(바람이 심하게 불어서)백조가 갈고리에 찔렸다.\n56:(또 강풍이 불어요)갈고리는 앵두도 찔렀다.\n",
                R.drawable.phone)); //31
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "699:(상처를 치료하기 위해 앵두 안경을 만듦)앵두를 외알안경 2개에 안경알 대신 박았다.\n97:(상처를 치료하려고)외알안경과 마법의 지팡이를 착용했다.\n78:(전문의사인 눈사람이 왔다)지팡이를 눈사람에게 꽂아 팔을 만들어 줬다.",
                R.drawable.phone)); //32
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "이야기 만들기는 다소 어려울 수 있습니다. 이치에 맞지 않는 이야기도 체인과 이미지의 힘으로 보완할 수 있습니다. 상상은 당신의 몫입니다. 도전해봅시다. 5분이 지나면 알려드릴께요.",
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
                "맞추셨다면 아주 잘 하셨습니다. 다 기억나지 않더라도 괜찮습니다. 단계가 진행될수록 당신의 기억력은 성장할 것입니다. 사실 이 방법은 조금 어렵습니다. 다음 시간에는 그 한계를 뛰어 넘을 수 있는 기억법을 가르쳐 드리죠.",
                R.drawable.d0_3)); //33
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "오늘의 키워드 생생한 이미지와 스토리!! 기억하세요. 다음시간에 만나요. 바이바이",
                R.drawable.d1_2)); //35
        Static.setBundle();
    }

}
