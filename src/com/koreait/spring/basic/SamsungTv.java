package com.koreait.spring.basic;

public class SamsungTv extends Tv{

    public SamsungTv(Speaker speaker) {
        super(speaker);
        System.out.println(" -- SamsungTv Created --");
    }
}
