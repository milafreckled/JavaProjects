/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zadanie1;

import static com.mycompany.zadanie1.Statek.NIESPRAWNY;
import static com.mycompany.zadanie1.Statek.SPRAWNY;

/**
 *
 * @author ludmilamalomuz
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        Statek a = new Statek(SPRAWNY, "Victory");
        Statek b = new Statek(NIESPRAWNY, "Titanic");
        Statek c = new Statek(SPRAWNY, "Bismarck");
        Statek d = new Statek(NIESPRAWNY, "Santa Maria");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        a.bronSie(c);
        a.bronSie(b);
        d.bronSie(b);
    }
    
}
