package com.koreait.spring.basic;

public class HamanSpeaker {
    private int volume;
    private int MAX_VOLUME;

    public HamanSpeaker() {//객체화
        System.out.println(" ---- Haman Created ----");
        MAX_VOLUME = 50;
    }

    public void speakUp() {//volume 1 올리고, maxVolume 값 보다 커지면 안된다.
        if (volume < MAX_VOLUME) {
            volume ++;
        }
    }

    public void speakDown() {//volume 1 내리고 0 보다 작아지면 안된다.
        if (volume > 0) {
            volume --;
        }

    }

    //Getter
    //외부에 줘야하니까 return 값이 있다, return 타입은 int
    public int getVolume() {//파라미터로 받을건 없다.
        return volume;
    }

}