/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zadanie2;

import java.util.ArrayList;

/**
 *
 * @author Liudmyla Mamalomuzh;
 */
public class Main2 {
    public static void main(String[] args) throws NieMaUzbrojeniaException{
        USAArizona st = new USAArizona(Statek.SPRAWNY, "Arizona");
        Uzbrojenie u1 = new Uzbrojenie("armata", 5);
        Uzbrojenie u2 = new Uzbrojenie("torpeda", 2);
        Uzbrojenie u3 = new Uzbrojenie("pistolet", 10);
        ArrayList tablica = null;
        //tablica.add(0, u1);
        //tablica.add(1, u2);
        //tablica.add(2, u3);
        st.ustawUzbrojenie(tablica);
        System.out.println(st.toString());
        
    }
}
