package com.Attractor;

import java.util.Random;

public class Dealer {
    private int loadCapacity;
    private int speed;
    private int money;

    public Dealer(int loadCapacity, int speed, int money) {
        this.loadCapacity = loadCapacity;
        this.speed = speed;
        this.money = money;
    }

    public void TakeMoney () {
        Random random = new Random();
        int rndMoney = random.nextInt(15000)+7000;
        setMoney(rndMoney);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
