package hungry.ex_frag.day;

import java.util.ArrayList;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-08.
 */
public class day1_static {
    private static String w="\n   ▽\n반드시 눈을 감고 머리속으로 상상한 뒤 넘어갑시다.";

    //resource 할당  길이가 너무 기니까 젤 밑에 놔두자------------------------------------------------------------
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray=new ArrayList<>();
        Day_Activity.tiArray.add(new TI(
                "안녕하세요. 오늘은 몸을 이용한 기억법을 배워볼께요.",
                R.drawable.d2_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "철수: \"내일은 첫 등교하는 날.\n준비물을 확실히 챙겨야해!!\"\n   ▽\n여러분은 철수를 위해 준비물을 외울거에요.",
                R.drawable.d2_4));
        Static.setBundle();
		
		Day_Activity.tiArray.add(new TI(
                "머리부터 발까지 내려가며 각 신체부위에 외울 것을 결합 할 것입니다.",
                R.drawable.d2_3));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "다음 페이지부터 지시를 따르시면 됩니다.\n   ▽\n 1.먼저 준비물이 뭔지 확인 한다.\n   ▽\n2.몸의 어디다 물건을 붙일 것인지 확인한다.\n    ▽\n3.눈을 감고 준비물을 몸에 붙이는 상상을 한다.\n   ▽\n다음을 눌려 시작해 봅시다!",
                0));
        Day_Activity.firstPageAniDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d1_3_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물1. 8절 스케치북 - 머리\n   ▽\n스케치북을 8모양으로 잘라 내 머리에 붙였네요. 어허허허 이쁘죠.\n   ▽\n팔랑팔랑 거려요 펄렁 펄렁..."+w,
                R.drawable.d2_6));
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.paper);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물2. 드로잉 재료 - 눈\n   ▽\n드로잉재료를 이용해 눈을 크게 그렸군요. 눈썹도 찐하게 만들구요. 여자분들은 알아서 그리세요.." + w,
                0));
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.pencil);
        Day_Activity.firstPageAniDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d2_6_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물3. U모양 자석 - 콧구멍\n   ▽\n자석을 콧구멍에 꽂았더니 크허엏어어어크킁 정건기가꾸아아악. 팁 - 콧구멍에 손가락도 넣어보고, 감전된 것처럼 몸도 떨면 잘 외워집니다.(진짜)" + w,
                0));
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.lightning);
        Day_Activity.firstPageAniDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d2_7_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물4. 아주 가는 철사 - 입\n   ▽\n철사를 이용해서 입을 사이보그로 DIY했군요. 이빨모양- lllll. 윙~ 치킨 ~~ 윙윙치킨!! 냠냠냠 치킨" + w,
                0));
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.robot);
        Day_Activity.firstPageAniDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d2_8_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물5. 탬버린 - 목\n   ▽\n목에 걸다니..우와 왕년에 노래방가서 좀 흔드셨나봐요." + w,
                0));
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.tambourine);
        Day_Activity.firstPageAniDrawableHM.put(Day_Activity.setArrayCount, R.drawable.d2_9_ani);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물6. 등산용 양말 - 가슴\n   ▽\n양말을 연결해서 브라자를 만들어봐요.그런데 꼬락내가 엄청 나네요. 안빨았나봐요. 이번엔 후각을 활용해 봅시다."+ w,
                R.drawable.d2_10));
        Static.setBundle();


        Day_Activity.tiArray.add(new TI(
                "준비물7. 점토 - 손\n   ▽\n점토를 손에 발라 왕주먹이 되었습니다. 루피랑 비슷하네요."+ w,
                R.drawable.d2_11));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물8. 마이크 - 배\n   ▽\n배에 마이크를 붙였더니 꼬르륵 소리가 잘들리네요."+ w,
                R.drawable.d2_12));
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.stomachgrowl);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물9. 해바라기 - 무릎\n   ▽\n무릎에 예쁜 해바라기를 달았네요. 해바라기들이 해를 바라보고 있네요.\n+9 해바라기 각반 장착!!"+ w,
                R.drawable.d2_13)); //13
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "준비물10. 돋보기 - 발\n   ▽\n띠오잉~ 발이 크게 보여요.\n   ▽\n입으로 띠오잉 하고 효과음을 내세요. 잘 외워집니다....",
                R.drawable.d2_14)); //14
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 눈을 감고 머리부터 쭉 내려오며 준비물을 맞춰봅시다.\n\n(다음 페이지에는 정답이 있습니다.) ",
                R.drawable.d2_15)); //15
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1.8절 스케치북 2.드로잉 재료 3.자석 4.아주 가는 철사 5.탬버린\n6.등산용 양말 7.점토 8.마이크 9.해바라기 10.돋보기\n   ▽\n여러분들 덕분에 철수가 상을 받았다고 합니다.",
                R.drawable.d1_30)); //16
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "하이파이브 한 번 하고 다음으로 갑시다.",
                R.drawable.d2_16)); //17
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "혹시 다 못마추셨어도 실망하지 마세요. 우리는 점점 똑똑해지고 있습니다.\n\n그리고 여러분은 지금 준비물의 순서까지 외우고 있습니다. 천재네요.\n다음 단계에서 만나요!" ,
                R.drawable.d0_3)); //18
        Static.setBundle();
    }

}
