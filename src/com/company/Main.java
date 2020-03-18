package com.company;

import com.company.butorgyar.Butor;
import com.company.butorgyar.Butorlap;

public class Main {

    public static void main(String[] args) {

        Butorlap bl1 = new Butorlap(300, 500, true);
        Butorlap bl2 = new Butorlap(100, 300, true);
        Butorlap bl3 = new Butorlap(120, 900, false);

        Butor b1 = new Butor();

        b1.lapHozzaAd(bl1);
        b1.lapHozzaAd(bl2);
        b1.lapHozzaAd(bl3);

        System.out.println(b1);
    }
}
