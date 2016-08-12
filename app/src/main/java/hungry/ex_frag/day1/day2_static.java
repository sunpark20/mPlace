package hungry.ex_frag.day1;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-08.
 */
public class day2_static {
    static int setArrayCount=0;
    
    static void setBundle() {
        setArrayCount++;
    }

    //resource 할당  길이가 너무 기니까 젤 밑에 놔두자------------------------------------------------------------
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "두뇌는 숫자보다 이미지를 쉽게 기억합니다. 0~9까지 숫자를 이미지로 바꿔서 이용해보도록 하죠.",
                R.drawable.d1_2));
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "영희는 비상사태를 대비해서 부모님의 폰번호를 외우려고 합니다. 일단 0~9의 숫자를 이미지로 바꿔봅시다. 다음으로 가봅시다.",
                R.drawable.d1_0));
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자 0을 터치해주세요",
                R.drawable.d1_4));
        Day_Activity.touchPage.add(setArrayCount);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "축구공이 되었네요. 한번 더 터치해 볼까요?",
                R.drawable.d1_5));
        Day_Activity.touchPage.add(setArrayCount);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "나이키 축구공이네요. 그냥 축구공에 나이키를 달아 세세한 특징을 만들어주면 기억에 도움이 됩니다.",
                R.drawable.d1_6a7));
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "눈을 감고 0모양의 축구공을 상상해봅시다. 15초 후에 알려드립니다.",
                0));
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_8_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "0은 축구공입니다. 다음으로 가볼까요",
                0));
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "3분만 집중해주세요. 1~9도 이미지로 바꿔 볼까요.",
                R.drawable.d1_9));
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "이순신 장군의 장검, 1과 비슷하죠. 눈을 감고 알람시간까지 상상해 보세요.",
                R.drawable.d1_10_1));
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_10_ani);
        setBundle();


        Day_Activity.tiArray.add(new TI(
                "1은 이순신장군의 검 입니다. 다음으로 가볼까요.",
                0));
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "숫자 2와 닮았나요? 눈을 감고 알람시간까지 상상해 보세요. ",
                0));
        Day_Activity.firstPageAniDrawableHM.put(setArrayCount, R.drawable.d1_12_ani);
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_13_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "2는 백조입니다. 다음으로 가볼까요.",
                0)); //13
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "갈매기를 옆으로 돌리면 3과 비슷합니다. 눈을 감고 짠 바다내음도 함께 상상해보세요.",
                R.drawable.d1_14)); //14
        Day_Activity.firstPageSound.put(setArrayCount, R.raw.seagull);
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_14_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "3은 갈매기입니다. 다음으로 가볼까요.",
                0)); //15
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "요트 타보셨나요? 눈을 감고 4를 떠올려보세요. 알람으로 알려드릴께요.",
                R.drawable.d1_16)); //16
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_16_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "4는 요트입니다. 다음으로 가볼까요.",
                0)); //17
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "5에 찔리면 엄청 아프겠네요. 알람시간까지 상상해볼까요.",
                R.drawable.d1_18)); //18
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_18_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "5는 낚시바늘 입니다. 베이거나 찔리는 것은 끔찍하지만 기억에 잘 남습니다. 다음으로 가볼까요.",
                0)); //19
        setBundle();
//
        Day_Activity.tiArray.add(new TI(
                "빠알간 앵두입니다. 6이 보이시나요?? 눈을 감고 알람시간까지 상상해볼까요.",
                R.drawable.d1_20)); //20
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_20_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "6은 새빨간 앵두입니다. 거의 다 왔습니다. 다음으로 가볼까요.",
                0)); //21
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "7을 사용하면 정상까지 수월하게 갈 수 있겠네요. 눈을 감고 알람시간까지 상상해볼까요. (PPL 아님)",
                R.drawable.d1_22)); //22
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_22_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "7은 등산용 지팡이 입니다. 다음으로 가볼까요.",
                0)); //23
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "눈사람, 8과 비슷한가요. 이름은 올라프입니다. 눈으로 만들어졌답니다.",
                R.drawable.d1_24)); //24
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_24_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "8은 눈사람입니다. 다음으로 가볼까요?",
                0)); //25
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "외알 안경입니다. 옛날 드라마에서 본 것 같네요. 알람시간까지 상상해봅시다.",
                R.drawable.d1_26)); //26
        Day_Activity.alarmDrawableHM.put(setArrayCount, R.drawable.d1_26_ani);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "9는 외알안경입니다. 다음으로 가볼까요?",
                0)); //27
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "폰을 놓고 눈을 감은 뒤 0~9까지의 이미지를 떠올려보세요. 천천히 떠올려보세요. 급할 것 없습니다. 준비되면 다음을 눌려주세요.",
                0)); //28
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "4256-9978 는 전화번호입니다. 이 전화번호를 2개씩 묶을 것입니다. 다음으로 가봅시다.",
                R.drawable.exam)); //29
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "이것을 '체인기법'이라고 합니다. 하나의 체인은 순식간에 다음 체인을 생각나게 할 것입니다. 방금 만든 생생한 이미지들이 머리속에 있죠. 개들을 이용해서 이야기를 만들면 됩니다. 물론 눈을 감고 머리속에서요!!! 다음을 눌려 예시를 봅시다.",
                R.drawable.chain)); //30
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "42:요트에 백조를 태웠다. 25:백조가 갈고리에 찔렸다. 56:갈고리는 앵두도 찔렀다.",
                R.drawable.phone)); //31
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "699:앵두는 외알안경에 하나씩 박혔다. 97:외알안경을 등산용 지팡이에 매달았다. 78:지팡이를 눈사람 팔에 꽂아 줬다.",
                R.drawable.phone)); //32
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "이런식 입니다. 상상은 당신의 몫입니다. 친구나 가족의 전화번호 하나를 외워봅시다. your turn!! 5분이 지나면 알려드릴께요.",
                R.drawable.go)); //33
        Day_Activity.alarmTimeHM.put(setArrayCount, 5*60);
        Day_Activity.alarmDrawableHM.put(setArrayCount, 0);
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "맞추셨다면 아주 잘 하셨습니다. 다 기억나지 않더라도 괜찮습니다. 단계가 진행될수록 당신의 기억력은 성장할 것입니다.",
                0)); //33
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "내가 만든 생생한 이미지로 이야기를 만들어봤습니다. 사실 이것은 숫자외우기에 효율적인 방법이 아닙니다. 조금 복잡하죠. 효율적인 기억법은 나중에 가르쳐 드릴꼐요. 퐐로미",
                0)); //34
        setBundle();

        Day_Activity.tiArray.add(new TI(
                "오늘의 키워드 생생한 이미지!! 기억하세요. 다음시간에 만나요. 바이바이",
                0)); //35
        setBundle();
    }

}
