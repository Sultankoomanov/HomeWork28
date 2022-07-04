package com.Attractor;

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
}
