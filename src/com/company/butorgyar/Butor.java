package com.company.butorgyar;

public class Butor{
    private int counter;
    private Butorlap[] butorlapok;

    public Butor() {
        this.counter = 0;
        this.butorlapok = new Butorlap[100];
    }

    public void lapHozzaAd(Butorlap bl){
        this.butorlapok[counter] = bl;
        counter++;
    }

    public int arSzamol(){
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += this.butorlapok[i].arSzamol();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Butor{" +
                "darabszám: " + counter + "\n ár: " + this.arSzamol() +
                '}';
    }
}
