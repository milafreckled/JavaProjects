/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zadanie2_1;

import java.awt.Color;

/**
 *
 * @author ludmilamalomuz
 */
public class Owoc {
    String nazwa;
    Color kolor;
    double masa;
    String krajPochodzenia;
    public Owoc() {
    }
public Owoc(String nazwa, String krajPochodzenia, double masa, Color kolor) { 
this.nazwa = nazwa;
this.krajPochodzenia = krajPochodzenia;
this.masa=masa;
this.kolor=kolor;
}
public String getNazwa(){
    return this.nazwa;
}
public double getMasa(){
    return this.masa;
}
public void getAll(){
    System.out.println("Nazwa: " + this.nazwa 
            + " Masa w kg: " + this.masa
    + " Kraj pochodzenia: " +this.krajPochodzenia +
            " Kolor: " + this.kolor.toString());
}
    public static void main(String[] args) {
        Owoc nieznany = new Owoc();
        Owoc pomarancz=new Owoc("Pomarancz", "Hiszpania", 0.45, Color.ORANGE);
        System.out.println(nieznany.getNazwa());
        System.out.println(pomarancz.getNazwa() +" "+ pomarancz.getMasa());
        pomarancz.getAll();
        
        
    }
}

