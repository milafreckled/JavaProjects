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
public class Petla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=5; i<=80; i+=15){
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
        int table[]=new int[]{5, 20, 35, 50, 65, 80};
        for (int liczba:table){
            System.out.printf("%d ", liczba);
        }
        System.out.println("\n");
        int i=5;
        while (i<=80){
            System.out.printf("%d ", i);
            i+=15;
        }
         System.out.println("\n");
        int y=5;
        do {
            System.out.printf("%d ", y);
            y+=15;
        }while(y<=80);
        
// TODO code application logic here
    }
    
}
