package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-22.
 */
public class day3_static {
    final static String w="눈을 감고 여러분의 공간에 상상한 뒤 끝나면 다음으로 갑시다.";
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "모든 사람은 장소에 관한 특별한 기억력을 갖고 있습니다. 이 장소를 활용하는 기억법이 바로 기억의 궁전입니다. 시작해봅시다",
                R.drawable.d0_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "저의 기억의 궁전입니다. 엘리베이터에서 나와 집에 들어가고 방들이 반시계 방향으로 이어져있습니다.\n   ▽\n 이제 여러분도 기억의 궁전을 만들 볼 것입니다. 다음으로 갑시다.",
                R.drawable.d3_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "<미션> 10개의 방으로 된 기억의 궁전을 만들자.\n눈을 감고 다음 지시 사항을 수행하세요.\n1.집으로 오는 길이나 집의 방들을 떠올립니다.\n\n2.실제로 그곳을 걷는다고 생각하면서 10개의 장소를 돌아보세요.\n\n3.집 앞 슈퍼를 지나 경비실을 거쳐~~~ 이런식으로 하시면 됩니다.\n\n완벽하게 걸어다닐 수 있을 때까지 외운 뒤 다음으로 가봅시다.",
                R.drawable.d3_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "잘하셨어요. 여러분들은 10개의 방으로 이루어진 기억의 궁전을 만들었습니다.\n   ▽\n1991~2000년 아카데미 수상작을 외워보겠습니다.\n   ▽\n장소를 떠올리고 영화제목에 맞는 이미지를 넣으면 됩니다. 년도는 외울 필요없어요. 다음으로 가봅시다.",
                R.drawable.d3_3));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1991 - 늑대와 춤을\n   ▽\n저의 첫번째 장소는 '엘리베이터'입니다.\n<<예시-엘리베이터에 늑대가 춤을 추고 있습니다. 저는 무서워서 구석에 붙어 떨고 있습니다.>>\n눈을 감고 여러분의 첫번째 공간에 이미지를 집어넣으세요. 무서운 늑대가 춤을 추고 있는 장면입니다. 끝나면 다음으로 가세요.",
                R.drawable.d3_4));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1992 - 양들의 침묵\n   ▽\n제 다음 장소는' 현관문'입니다.\n<<예시-현관문은 활짝 열려 있고 양떼들이 엄청 많아요. 저는 양에게 안녕이라고 인사하지만 양들은 침묵합니다.>>\n" + w,
                R.drawable.d3_5));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1993 - 용서받지 못한자\n   ▽\n제 다음 장소는 '나의 방'입니다.\n<<예시-여러분은 저 제목을 보면 뭐가 제일 먼저 떠오르시나요?? 저는 하정우 주연의 '용서받지 못한자'가 생각납니다. 그래서 제 방 침대에 하정우가 누워 있는 것을 상상합니다. 가장 먼저 생각나는 것이 가장 강력한 기억입니다. 자신이 가장 용서할 수 없는 사람을 집어 넣는 것도 좋겠죠??>>\n" + w,
                R.drawable.d3_6));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1994 - 쉰들러 리스트\n   ▽\n제 다음 장소는 '거실'입니다.\n<<예시-거실 쇼파에 앉은 쉰 살의 할머니들이 종이에 적힌 리스트를 보고 있습니다. 저는 쉰들러를 쉰살의 할머니로 바꿨습니다.>>\n" + w,
                R.drawable.d3_7));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1995 - 포레스트 검프\n   ▽\n제 다음 장소는 '부모님 방'입니다.\n<<예시-검프가 부모님 방을 요리조리 뛰어다니고 있다. 저는 영화를 봤기 때문에 바로 주인공이 생각나는군요. 영화를 안보셨다면 어떤 이미지를 만들어야 할까요. 포레스트(숲속)에서 검을 피하는 장면을 상상해보는건 어때요?? 여러분의 상상력으로 공간을 채워보세요.>>\n" + w,
                R.drawable.d3_8));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1996 - 브레이브 하트\n   ▽\n제 다음 장소는 '화장실'입니다.\n<<예시-귀여운 하트 모양의 캐릭터가 화장실에서 변을 보고 있네요. 그 하트는 아주 용감해서 '스파르타'라고 소리치고 있네요. 브레이브는 영어로 용감하다는 뜻입니다. >>\n" + w,
                R.drawable.d3_9));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1997 - 잉글리쉬 페이션트\n   ▽\n제 다음 장소는 '옷 방'입니다.\n<<예시-저는 잉글리쉬 페이션트를 영국인의 열정이라고 해석하니 축구선수 루니가 떠오르더군요. 그래서 루니가 제 옷방에서 유니폼을 찾고 있는 장면을 상상했습니다.>>\n" + w,
                R.drawable.d3_10));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1998 - 타이타닉\n   ▽\n제 다음 장소는 '부엌'입니다.\n<<예시-부엌은 빙하가 둘러쌓인 물로 가득하고 타이타닉호가 침몰하고 있습니다. 엄청 춥고 끔찍합니다.>>\n" + w,
                R.drawable.d3_11));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "1999 - 셰익스피어 인 러브\n   ▽\n제 다음 장소는 '창고'입니다.\n<<세익스피어가 저한테 반했습니다.빨리 창고에서 도망쳐야겠어요.>>\n" + w,
                R.drawable.d3_12));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "2000 - 아메리칸 뷰티\n   ▽\n제 다음 장소는 '컴퓨터 방'입니다.\n<<저는 미국 화장품이 생각납니다. 컴퓨터방의 컴퓨터를 이용해 미국화장품을 검색하는 모습을 상상했습니다.>>\n" + w,
                R.drawable.d3_13));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "이제 눈을 감고 첫 장소로 돌아간 뒤, 걸어가봅시다. 끝나면 다음을 눌려주세요.",
                R.drawable.d3_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "잘 외워지시나요?? 혹시 아직 못외우셨다면, 다시 한번 기억의 궁전을 채우고 오세요. 다음으로 가봅시다.",
                R.drawable.d2_16));
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "다시 눈을 감고 마지막 장소로 가서 거꾸로 여행해봅시다.\n거꾸로도, 중간으로 기억의 궁전을 이용하면 어디든지 갈 수 있습니다.",
                R.drawable.d3_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "우리는 이제 년도별 아카데미상을 기억하게 됐습니다!! 짝짝\n   ▽\n기억의 궁전을 몇번 거닐다 보면 절대 잊혀지지 않는 장기기억으로 뇌에 저장될 것입니다.\n   ▽\n특정한 것을 기억하기 위한 궁전을 따로 만들어 놓는다면 평생 기억할 수 있을거에요. 그럼 다음 시간에 만나요!",
                R.drawable.d2_16));
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();


    }
}
