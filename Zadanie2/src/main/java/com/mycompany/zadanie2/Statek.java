/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zadanie2;


/**
 *
 * @author ludmilamalomuz
 */
public abstract class Statek {
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
    public abstract void bronSie (Statek atakujacy) throws InterruptedException;
    @Override
    public String toString() {
        return "Statek{ nazwa=" + nazwa  + ", stan=" + stan + "}";
    }
 
   
    
}
