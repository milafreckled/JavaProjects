/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zadanie1;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ludmilamalomuz
 */
public class Statek {
    public static final int SPRAWNY=1;
    public static final int NIESPRAWNY=0;
    protected int stan;
    protected String nazwa;

    public void ustawStan(int stan) {
        this.stan = stan;
    }

    public Statek(int stan, String nazwa) {
        this.stan = stan;
        this.nazwa = nazwa;
    }
    public void bronSie (Statek atakujacy) throws InterruptedException{
        if (this.stan == SPRAWNY && atakujacy.stan == SPRAWNY) {
            System.out.println("Rozpoczynamy atake!");
            TimeUnit.SECONDS.sleep(3);
            double wynikPotyczki = Math.random() * (2 - 0 + 1) + 0;
            if (wynikPotyczki >= 0.5){
                System.out.println("Twoj statek wygral!");
                atakujacy.ustawStan(NIESPRAWNY);
            }else{
                System.out.println("Twoj statek przegral i jest uszkodzony.");
                this.ustawStan(NIESPRAWNY);
            }
        }else{
            System.out.println("Twoj statek jest niesprawny...");
        }
    }

    @Override
    public String toString() {
        return "Statek{ nazwa=" + nazwa  + ", stan=" + stan + "}";
    }
 
   
    
}
