package com.example.uczniowie;

public enum Obecnosc {
    OBECNY(0),
    NIEOBECNY(1),
    SPOZNIONY(2);

    private int numer;

    Obecnosc(int numer) {
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }
}
