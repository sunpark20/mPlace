package hungry.ex_frag.day;

import hungry.ex_frag.R;

/**
 * Created by soy on 2016-08-22.
 */
public class day_statc_fc {
    public static void setTiArray() {
        Day_Activity.initAllArray();

        Day_Activity.tiArray.add(new TI(
                "오늘은 여러분들이 보내주신 기억의 궁전에 대한 질문들을 함께 살펴보겠습니다.",
                R.drawable.d5_1));
        Static.setBundle();

        Day_Activity.tiArray.add(new TI(
                "A)이 질문은.. 많이 해보라고 밖에 말씀 못 드리겠네요. 저도 시행착오가 많았습니다. 기억의 궁전을 만들기 위해서" +
                        " 사진을 찍으며 동내를 걸어다닌적도 있어요.. 미친놈처럼 사진을 찍었다는...."+
                        "또 여행을 다녀오면 꼭 그곳을 이용해서 기억의 궁전을 만들고 쓰잘때기 없는 것들을 외운답니다.",
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
                "두둥.. 첫번째 도전입니다.\n" +
                "기억의 궁전을 사용해서 00~99까지의 숫자를 인물로 바꿔서 외우시면 됩니다. 외울 때 중요한 점은" +
                " 인물의 특징을 같이 외워야합니다. 행동을 하거나 소품을 들고 있거나 신체적 특징이 있어야 합니다.(한가지 특징만 있으면 됩니다)" +
                "\n예)86, 이봉주, 쌍꺼풀 수술한 눈 / 97, 조수미, 밤의 여왕 아리아를 부르고 있다.\n" +
                "이 특징은 다음 챕터에서 쓸 재료가 될테니 꼭 같이 외워주세요!! 그럼 다 외우고 다음챕터에서 만나요!! 제법 걸릴 수도 있을 것 같군요..\n" +
                "메인에 보면 '인물-숫자 샘플'이 있습니다. 제가 00~99를 외우는 방식이니 참고하세요. 바바이",
                R.drawable.d5_8));
        Static.setBundle();

    }
}
