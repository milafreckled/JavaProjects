/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab8;

import java.util.ArrayList;


public class Main{

    /**
     * @param args the command line arguments
     */
    public void wypiszPrzedmioty(ArrayList<String> arr, wypisanieListy wl){
        for (String przedmiot:arr) {
            wl.drukuj(przedmiot);
        }
    }
    public static void main(String[] args) {
       ArrayList<String> spis = new ArrayList<>(10);
       spis.add("Metrologia");
       spis.add("WDSBD");
       spis.add("Matematyka dla informatyków II");
       spis.add("Programowanie w Java");
       spis.add("Algorytmika");
       spis.add("AKiPN");
       spis.add("elektritechnika");
       spis.add("English");
       wypisanieListy wl = new wypisanieListy() {
           @Override
        public void drukuj(String str) {
        System.out.println(str); //To change body of generated methods, choose Tools | Templates.
    }
       };
       spis.forEach((el)->wl.drukuj(el));
    }

   
    
}
