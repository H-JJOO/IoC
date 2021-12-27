package com.koreait.spring.basic;

public class Factory {

    public Speaker getSpeaker(String company) {
        switch (company) {
            case "apple" :
                return new AppleSpeaker();
            case "haman" :
                return new HamanSpeaker();
        }
        return null;
    }

    public Tv getTv(String company, Speaker speaker) {
        switch (company) {
            case "samsung" :
                return new SamsungTv(speaker);
            case "lg" :
                return new LgTv(speaker);
        }
        return null;
    }
}
