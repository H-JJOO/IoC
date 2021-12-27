package com.koreait.spring.basic;

public class TvTest {
    public static void main(String[] args) {

        /*
        1. Speaker 클래스를 추가하고 AppleSpeaker, HamanSpeaker 를 상속으로
        구조화하면 LgTv 와 SamsungTv 에서 스피커를 교체할 때 타입은 변경할 필요없고
        클래스명만 바꿔주면 되기 때문에 수정을 한군대만 하면 된다.
        그래스 소스가 좀 더 발전되었다.

        2. 소스를 구조적으로 많이 바꿨음에도 불구하고, 여전히 Tv의 Speaker 를 바꿀려면
        소스 수정이 불가피한 상태이다.

        3. 소스의 수정 없이!!!
        main 메소드의 파라미터인 args 를 사용하여 아래 TV 객체에 담기는 객체를
        변경을 할 수 있다.

        4. 외부에서 값을 가져오는 방법 3가지
        - args 이용
        - Scanner 이용
        - File(xml 같은거) 이용 (Spring 은 파일을 이용)

        여기까지 IoC, DI 를 이해하기 위한 프로젝트!
        * */

        // Null 체크도 해야하고 해야할거 많긴함, 감만 잡는 프로젝트
        System.out.println("len : " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        String speakerCompany = args[0];
        String tvCompany = args[1];

        Factory factory = new Factory();
        Speaker speaker = factory.getSpeaker(speakerCompany);

        Tv tv = factory.getTv(tvCompany, speaker);

    }
}
