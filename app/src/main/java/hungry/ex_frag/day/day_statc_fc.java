package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-22.
 */
public class day_statc_fc {
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "오늘은 기억의 궁전에 관한 팁을 소개합니다. 마지막엔 숙제도 있습니다.",
                R.drawable.d5_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "A)하루에 10분 정도 꾸준히 연습하세요. 저도 시행착오가 많았습니다. 기억의 궁전을 만들기 위해서" +
                        " 사진을 찍으며 동내를 걸어다니고, 옛날 살던 곳을 찾아간 적도 있습니다."+
                        " 또 여행을 다녀오면 꼭 그곳을 이용해서 기억의 궁전을 만들고 이상한 것들을 외운답니다.",
                R.drawable.d5_2));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "제가 쓰는 팁을 몇개 더 알려드릴께요.\n" +
                        "'day2-상상하기' 에서 나왔던 체인입니다.\n" +
                        "저는 기억의 궁전을 만들 때 체인을 적극 활용합니다. 1번 방에 이미지를 결합하고 2번 방까지 이미지를 결합합니다. 그리고 뒤를 돌아봅니다." +
                        " 뒤돌아서 이전 방을 한번 더 확인하는 것입니다. 체인을 연결하며 끝방까지 진행합니다. 그리고 끝에서 처음으로 가며 한번 더 외웁니다. 이게 저의 한 세트입니다.",
                R.drawable.chain));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "에빙하우스의 <a href='https://ko.wikipedia.org/wiki/%EB%A7%9D%EA%B0%81_%EA%B3%A1%EC%84%A0'>망각곡선</a>입니다. \n\n" +
                        "사람마다 효과적인 복습주기는 다릅니다. 자신에게 맞는 복습주기를 찾는다면 학습에 도움이 될 것입니다. " +
                        "저는 학습 후 곧바로, 24시간, 1주, 1달, 3달 주기로 복습합니다. 공책을 만들어 제목과 복습날짜를 관리합니다.\n" +
                        "'다시는 안까먹어야지!! 라는 불꽃의지가 가장 중요합니다.",
                R.drawable.d5_3));
        Day_Activity.linkText.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "두번째 질문이네요. 방을 쪼개는 트릭이 있습니다. 다음 그림을 보며 이야기 합시다.",
                R.drawable.d5_4));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "방에 들어갔을 때, 정면에 보이는 것은 베란다 창문입니다. 이 곳을 기준으로 시계 방향으로 돕니다. 텔레비전, 책상, 침대를 거쳐 다시 베란다 창문으로 오게 되면"+
                " 방을 빠져 나갑니다. 이미지를 저장할 수 있는 공간이 늘어났죠~ 저는 한방을 쪼갤 때는 4개의 벽을 기준으로 가구를 하나씩 결합시킵니다.",
                R.drawable.d5_5));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "긴 궁전을 만드는 두번째 팁입니다. 머리속에선 뭐든지 가능합니다. 마지막 장소에 빛의 기둥을 만드세요. 그리고 그 옆엔 단서를 놔둡니다.\n" +
                        "예)우리집 뒷산 정상까지 올라갔다. 그곳에 빛의 기둥을 세우고 내가 좋아하는 도미를 놔뒀다. 빛의 기둥에 다가가니 슈우우우웅~ 도미를 파는 해운대 회센터로 왔다. 여기부터 방을 만들며 이어 간다.",
                R.drawable.d5_6));
        Day_Activity.firstPageSound.put(Day_Activity.setArrayCount, R.raw.shsh);
        Static.setBundle();


        Day_Activity.tiArray.add(new TI(
                "손바닥 한 번 칩시다!! 그냥..\n" +
                "꾸준히 기억의 궁전을 하시다 보면 자신만의 비법이 생길거에요. \"이렇게 하니까 잘 안외워지네. 아 이런건 잘 외워지네~\"\n" +
                "제가 가르쳐주는 팁들이 잘 맞으면 참고하시고 아니라면 버리면 됩니다.",
                R.drawable.d2_16));
        Day_Activity.touchSound.add(Day_Activity.setArrayCount);
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "두둥.. 첫번째 도전과제입니다. 0~99까지 숫자를 자음화->인물로 변환(day4)해서 기억의 궁전으로 외우시면 됩니다." +
                        "(0~9, 00~99)\n" +
                        "다음장으로 가서 자세한 설명을 봅시다.",
                R.drawable.d5_8));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "대한민국의 자랑스러운 마라토너 이봉주씨입니다. 이봉주씨는 숫자 86이 되겠죠. 중요한 점은 행동이나 특징을 같이 외워야 합니다." +
                        " 마라톤을 하는 행동. 선글라스와 스포츠 목걸이. 신체적 특징인 쌍거풀 수술한 눈. 등의 행동이나 특징을 함께 외울 수 있습니다." +
                        " 특징이나 행동은 상세한 정보로 이미지 기억에 도움이 될 것입니다. 그리고 다음 장에서 PAQ시스템에서 특징이나 행동을 사용하게 됩니다." +
                        " 비슷한 특징이나 행동을 가진 인물은 헷갈리겠죠. 최대한 다른 종류의 행동을 하는 사람들로 채워봅시다.",
                R.drawable.d5_9));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "100개가 넘는 기억의 궁전을 만들고 저것들을 외우고 나면, 숫자 외우기는 식은 죽 먹기가 될 것입니다. 또한 기억의 궁전 기본기가 탄탄해지게 될 것입니다." +
                        "화이팅~ 그럼 다 외우고, 만납시다 빠바이~\n제가 사용하는 인물-숫자 샘플 day5 오른쪽에 있습니다. 참고하세요.",
                R.drawable.d5_8));
        Static.setBundle();


    }
}
