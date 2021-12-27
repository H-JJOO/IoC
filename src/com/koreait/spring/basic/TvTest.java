package com.koreait.spring.basic;

public class TvTest {
    public static void main(String[] args) {

        /*
        Speaker 클래스를 추가하고 AppleSpeaker, HamanSpeaker 를 상속으로
        구조화하면 LgTv 와 SamsungTv 에서 스피커를 교체할 때 타입은 변경할 필요없고
        클래스명만 바꿔주면 되기 때문에 수정을 한군대만 하면 된다.
        그래스 소스가 좀 더 발전되었다.
        * */

        //현재 LgTv는 AppleSpeaker 를 사용하고 있다.
        //그런데 HamanSpeaker 로 바꾸고 싶다면
        //결국 소스를 수정을 해야 한다.
        LgTv lgTv = new LgTv();
        SamsungTv samsungTv = new SamsungTv();

        /*
        for (int i = 0; i < 50; i++) {
            lgTv.volumeUp();
        }

        System.out.println("---------------------------");

        for (int i = 0; i < 50; i++) {
            lgTv.volumeDown();
        }
         */
    }
}
