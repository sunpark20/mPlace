package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-22.
 */
public class day3 {
    final static String w="눈을 감고, 장소의 적절한 곳에 이미지를 배치시켜주세요.(장소의 물건을 사용한다던지 연관시키면 좋아요!)";
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "모든 사람은 장소에 관한 특별한 기억력을 갖고 있습니다. 이 장소를 활용하는 기억법이 바로 기억의 궁전입니다.\n" +
                        "지금 눈을 감고 자신의집이나 사무실을 생각해 보세요.\n   ▽\n아마 큰 어려움 없이 어디 내 방이 있었고, 부엌엔 어떤 식탁이 있었는지등의" +
                        " 방 구조가 눈에 선하게 떠오를 것입니다. 그럼 한번 시작해봅시다",
                R.drawable.d0_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "저의 기억의 궁전입니다. 엘리베이터에서 나와 집에 들어가고 방들이 반시계 방향으로 이어져있습니다.\n   ▽\n 이제 여러분도 기억의 궁전을 만들 볼 것입니다. 다음으로 갑시다.",
                R.drawable.d3_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 10개의 방으로 된 기억의 궁전을 만들자.\n눈을 감고 다음 지시 사항을 수행하세요.\n1.집으로 오는 길이나 집의 방들을 떠올립니다.\n\n2.실제로 그곳을 걷는다고 생각하면서 10개의 장소를 돌아보세요.\n\n3.집 앞 슈퍼를 지나 경비실을 거쳐~~~ 이런식으로 하시면 됩니다.\n\n중요한 점은 경로의 순서가 헷갈리지 않는 것입니다.\n\n첫 지점부터 끝지점까지 걸어갔다가, 다시 끝에서 첫지점까지 걸어올 수 있다면 준비가 됐습니다.고고 ",
                R.drawable.d3_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "우리 머리속엔 10개의 방으로 이루어진 기억의궁전이 있습니다.\n   ▽\n1991~2000년 아카데미상 수상작을 외워보겠습니다.\n   ▽\n간단합니다.\n   ▽\n눈을 감고 장소를 떠올린다\n   ▽\n그 장소에 <영화제목에 적합한 이미지> 넣는다\n   ▽\n다음으로 가봅시다.",
                R.drawable.d3_3));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1991년 수상작 - 늑대와 춤을\n   ▽\n저의 첫번째 장소는 '엘리베이터'입니다.\n<<예시-엘리베이터에 늑대가 춤을 추고 있습니다. 저는 무서워서 구석에 붙어 떨고 있습니다.>>\n눈을 감고 여러분의 첫번째 공간에 이미지를 집어넣으세요. 무서운 늑대가 춤을 추고 있는 장면입니다. 끝나면 다음으로 가세요.",
                R.drawable.d3_4));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1992년 수상작 - 양들의 침묵\n   ▽\n제 다음 장소는' 현관문'입니다.\n<<예시-현관문은 활짝 열려 있고 양떼들이 엄청 많아요. 저는 양에게 안녕이라고 인사하지만 양들은 침묵합니다.>>\n" + w,
                R.drawable.d3_5));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1993년 수상작 - 용서받지 못한자\n   ▽\n제 다음 장소는 '나의 방'입니다.\n<<예시-여러분은 저 제목을 보면 뭐가 제일 먼저 떠오르시나요?? 저는 하정우 주연의 '용서받지 못한자'가 생각납니다. 그래서 제 방 침대에 하정우가 누워 있는 것을 상상합니다. 가장 먼저 생각나는 것이 가장 강력한 기억입니다. 자신이 가장 용서할 수 없는 사람을 집어 넣는 것도 좋겠죠??>>\n" + w,
                R.drawable.d3_6));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1994년 수상작 - 쉰들러 리스트\n   ▽\n제 다음 장소는 '거실'입니다.\n<<예시-거실 쇼파에 앉은 쉰 살의 할머니들이 종이에 적힌 리스트를 보고 있습니다. 저는 쉰들러를 쉰살의 할머니로 바꿨습니다.>>\n" + w,
                R.drawable.d3_7));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1995년 수상작 - 포레스트 검프\n   ▽\n제 다음 장소는 '부모님 방'입니다.\n<<예시-검프가 부모님 방을 요리조리 뛰어다니고 있다. 저는 영화를 봤기 때문에 바로 주인공이 생각나는군요. 영화를 안보셨다면 어떤 이미지를 만들어야 할까요. 포레스트(숲속)에서 검을 피하는 장면을 상상해보는건 어때요?? 여러분의 상상력으로 공간을 채워보세요.>>\n" + w,
                R.drawable.d3_8));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1996년 수상작 - 브레이브 하트\n   ▽\n제 다음 장소는 '화장실'입니다.\n<<예시-귀여운 하트 모양의 캐릭터가 화장실에서 변을 보고 있네요. 그 하트는 아주 용감해서 '스파르타'라고 소리치고 있네요. 브레이브는 영어로 용감하다는 뜻입니다. >>\n" + w,
                R.drawable.d3_9));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1997년 수상작 - 잉글리쉬 페이션트\n   ▽\n제 다음 장소는 '옷 방'입니다.\n<<예시-저는 잉글리쉬 페이션트를 영국인의 열정이라고 해석하니 축구선수 루니가 떠오르더군요. 그래서 루니가 제 옷방에서 유니폼을 찾고 있는 장면을 상상했습니다.>>\n" + w,
                R.drawable.d3_10));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1998년 수상작 - 타이타닉\n   ▽\n제 다음 장소는 '부엌'입니다.\n<<예시-부엌은 싱크대에서 흘러넘친 물로 가득하고 빙하가 떠다닙니다. 타이타닉호가 침몰하고 있습니다. 엄청 춥고 끔찍합니다.>>\n" + w,
                R.drawable.d3_11));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1999년 수상작 - 셰익스피어 인 러브\n   ▽\n제 다음 장소는 '창고'입니다.\n<<깃털 달린 만년필을 든 세익스피어가 창고 잡동사니 사이에서 저를 바라보고 있네요. 저를 사랑하는 것 같아요.. 빨리 창고에서 도망쳐야겠어요.>>\n" + w,
                R.drawable.d3_12));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "2000년 수상작 - 아메리칸 뷰티\n   ▽\n제 다음 장소는 '컴퓨터 방'입니다.\n<<저는 미국 화장품이 생각납니다. 컴퓨터방의 컴퓨터를 이용해 미국화장품을 검색하는 모습을 상상했습니다.>>\n" + w,
                R.drawable.d3_13));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "이제 눈을 감고 첫장소를 떠올리세요. 걸어가며 영화의 이미지를 봅시다. 고고!",
                R.drawable.d3_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "잘 외워지시나요?? 혹시 아직 못외우셨다면, 다시 한번 기억의 궁전을 채우고 오세요. 다음으로 가봅시다.",
                R.drawable.d2_16));
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "다시 눈을 감고 마지막 장소로 가서 거꾸로 여행해봅시다.\n!! 잘 되나요?\n거꾸로 또는 중간에서부터도 어디든지 갈 수 있습니다.",
                R.drawable.d3_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "우리는 10개의 수상작을 기억하게 됐습니다!! 짝짝\n   ▽\n이것이 얼마나 머리속에 있을까요..? 내일 일어나 다시 기억의궁전을 거닐어봅시다.\n   ▽\n자세한건 나중에 설명드리겠습니다.",
                R.drawable.d2_16));
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();


    }
}
