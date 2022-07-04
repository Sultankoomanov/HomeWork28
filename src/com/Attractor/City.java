package com.Attractor;

import java.util.Random;

public enum City {
    BISHKEK("Bishkek"),
    TALAS("Talas"),
    OSH("Osh"),
    NARYN("Naryn"),
    BATKEN("Batken"),
    ISSIKKUL("Issikkul"),
    CHUI("Chui");

    private String value;

    City(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static City getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
    public static int getRandom2() {
        Random random = new Random();
        int rnd = random.nextInt(130)+30;
        return rnd;
    }
}
