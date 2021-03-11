package com.docker.demo.demo.model;

public class Character {
    private String name;
    private int gear;
    private int zeta;

    public String getName() {
        return name;
    }

    public int getGear() {
        return gear;
    }

    public int getZeta() {
        return zeta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setZeta(int zeta) {
        this.zeta = zeta;
    }

    public Character(String name, int gear, int zeta) {
        this.name = name;
        this.gear = gear;
        this.zeta = zeta;
    }
}
