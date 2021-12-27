package com.koreait.spring.basic;

public class SamsungTv {
    private HamanSpeaker speaker;

    public SamsungTv() {
        System.out.println(" -- SamsungTv Created --");
        speaker = new HamanSpeaker();
    }

    public void volumeUp() {
        speaker.speakUp();
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }

    public void volumeDown() {
        speaker.speakDown();
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }
}
