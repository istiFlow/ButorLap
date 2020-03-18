package com.company.butorgyar;

public class Butorlap {

    private static final int TARTOLAP = 5000;
    private static final int HATLAP = 500;
    private int hossz;
    private int szelesseg;
    private boolean istartolap;

    public Butorlap(int hossz, int szelesseg, boolean istartolap) {
        this.hossz = hossz / 100;
        this.szelesseg = szelesseg;
        this.istartolap = istartolap;
    }

    public int arSzamol(){
        int ar;
        if(istartolap){
            ar = (this.hossz * this.szelesseg) * TARTOLAP;
        } else {
            ar = (this.hossz*this.szelesseg) * HATLAP;
        }
        return ar;
    }
}

