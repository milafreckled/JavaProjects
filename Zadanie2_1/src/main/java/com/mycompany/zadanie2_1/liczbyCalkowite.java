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
public class liczbyCalkowite {
    public static void podzielnePrzez13(){
        for (int i=11; i<=111; ++i){
            if (i%13==0){
                System.out.printf("%d ", i);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Liczby z zakresu [11, 111] podzielne przez 13: ");
        liczbyCalkowite.podzielnePrzez13();
        // TODO code application logic here
    }
    
}
