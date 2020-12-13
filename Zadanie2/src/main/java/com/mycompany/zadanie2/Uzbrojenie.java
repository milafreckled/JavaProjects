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
public class Uzbrojenie{
        public String rodzajUzbrojenia;
        public int iloscUzbrojenia;
        public Uzbrojenie(String rodzajUzbrojenia, int iloscUzbrojenia) {
            this.rodzajUzbrojenia = rodzajUzbrojenia;
            this.iloscUzbrojenia = iloscUzbrojenia;
        }

        @Override
        public String toString() {
            return "Uzbrojenie{" + "rodzajUzbrojenia=" + rodzajUzbrojenia + ", iloscUzbrojenia=" + iloscUzbrojenia + '}';
        }
 }