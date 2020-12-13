/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class Figura {
   protected int pole;
   protected int obwód;
   private Color kolor;
   public Figura(int pole, int obwód, Color kolor) {
        this.pole = pole;
        this.obwód = obwód;
        this.kolor = kolor;
    }
    public void setPole(int pole) {
        this.pole = pole;
    }

    public void setObwód(int obwód) {
        this.obwód = obwód;
    }

    public void setKolor(Color kolor) {
        this.kolor = kolor;
    }

    public int getPole() {
        return pole;
    }

    public int getObwód() {
        return obwód;
    }

    public Color getKolor() {
        return kolor;
    }
   
   protected void rysuj(){
       System.out.println("Rysuję figurę...");
   }
   protected void usuń(){
       System.out.println("Usuwam figurę...");
   }
   protected void przesuń(){
       System.out.println("Przesuwam figurę...");
   }
   protected String podajParametry(){
       Scanner sc = new Scanner("System.in");
       pole = sc.nextInt();
       this.obwód = sc.nextInt();
       this.kolor = Color.getColor(sc.next());
       sc.close();
       return sc.toString();
   }
   
}
