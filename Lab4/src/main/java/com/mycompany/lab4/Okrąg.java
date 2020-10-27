/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ludmilamalomuz
 */
public class Okrąg {

    private int a, b;
    private int r;

    public Okrąg() {
        Random rnd = new Random();
        a = rnd.nextInt(91)+5;
        b = rnd.nextInt(91)+5;
        r = rnd.nextInt(5) + 1;
    }

    public static Okrąg[] table() {
        Random rnd2 = new Random();
        int rozmiar = rnd2.nextInt(6) + 2;
        Okrąg tablica[] = new Okrąg[rozmiar];
        for (int i = 0; i < tablica.length; ++i) {
            tablica[i] = new Okrąg();
        }
        return tablica;
    }

    public static void wzajemnePolozenie(Okrąg o1, Okrąg o2) {
        double odleglosc = Math.sqrt((double) ((o2.a - o1.a) * (o2.a - o1.a)) + ((double) (o2.b - o1.b) * (o2.b - o1.b)));
        if ((odleglosc == (double)o1.r + o2.r) || (odleglosc == Math.abs(o2.r - o1.r))) {
            System.out.println("Okręgi są styczne.");
        } else if (odleglosc > o1.r + o2.r) {
            System.out.println("Okręgi są rozłączne.");
        } else {
            System.out.println("Okręgi przecinają się.");
        }
    }

    public static void pola(Okrąg[] o) {
        for (Okrąg el : o) {
            System.out.println("x = " + el.a + " y = " + el.b
                    + " r = " + el.r);
        }
    }

    public static void main(String[] args) {
        Okrąg tablica[] = table();
        pola(tablica);
        for (int i = 0; i < tablica.length-1; i++) {
            wzajemnePolozenie(tablica[i], tablica[i+1]);
        }
    }
}
