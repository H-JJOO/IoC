package com.koreait.spring.basic;

public class Speaker {
    private int volume;
    private final int MAX_VOLUME;

    public Speaker(int max_volume) {//객체화
        MAX_VOLUME = max_volume;
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

    //외부에 줘야하니까 return 값이 있다, return 타입은 int
    public int getVolume() {//파라미터로 받을건 없다.
        return volume;
    }
}
