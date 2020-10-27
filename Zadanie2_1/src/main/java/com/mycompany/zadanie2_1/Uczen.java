/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zadanie2_1;

/**
 *
 * @author ludmilamalomuz
 */
public class Uczen {
    String imie, nazwisko;
    int wiek;
    double srednia;
    public Uczen(){
        this.imie="unknown";
        this.nazwisko="unknown";
    }
    public Uczen(String im, String nazw, int w, double sr){
        this.imie=im;
        this.nazwisko=nazw;
        this.wiek=w;
        this.srednia=sr;
    }
    public static void main(String[] args) {
        Uczen nieznany=new Uczen();
        Uczen Liudmyla=new Uczen("Liudmyla", "Malomuzh", 18, 3.8);
        System.out.printf("Obiekt 1 dane:" 
                + " %s, %s, %d, %.2f\n", nieznany.imie, nieznany.nazwisko, nieznany.wiek, nieznany.srednia);
        System.out.printf("Obiekt 2 dane:" 
                + " %s, %s, %d, %.2f", Liudmyla.imie, Liudmyla.nazwisko,
                Liudmyla.wiek, Liudmyla.srednia);
    }
}
