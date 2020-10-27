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
public class Product {              //zad 2.1
    String nazwa;
    int masa;
    char klasa;
    public static void licznik(){   //zad 2.2
        for (int i=0; i<=54; ++i){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Product.licznik();          //zad 2.2
        Product testProduct = new Product(); //zad 2.1
        System.out.printf("Wartosc int - %d, wartosc  string - %s, "
                + "wartosc char - %c", 
                testProduct.masa, testProduct.nazwa, testProduct.klasa);
    }
    
}
