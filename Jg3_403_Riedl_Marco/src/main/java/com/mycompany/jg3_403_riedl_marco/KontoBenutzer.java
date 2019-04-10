package com.mycompany.jg3_403_riedl_marco;

import java.util.Random;

public class KontoBenutzer implements Runnable {

    private String name;
    private KontoModel konto;

    public KontoBenutzer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        try {
            Thread.sleep(rand.nextInt(1000));
        } catch (InterruptedException ex) {
        }

        int money = 10 + rand.nextInt((50 - 10) + 1);

        if (rand.nextBoolean()) {
            try {
                konto.removeMoney(money);
            } catch (InterruptedException ex) {
            }
        } else {
            konto.addMoney(money);
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
