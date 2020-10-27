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
public class Trojkat {
    int a, b, c;
    public Trojkat(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void analiza(int a, int b, int c){
        if ((a+b > c) && (a+c > b) && (b+c > a)){
           if (a==b && a==c && b==c){
               System.out.println("Trojkat mozliwy. Jest to trojkat rownoboczny.");
               
           } 
           else if (a==b || a==c || b==c){
               System.out.println("Trojkat mozliwy. Jest to trojkat rownoramienny.");  
           } 
           else {
               System.out.println("Trojkat mozliwy. Jest to trojkat roznoboczny.");
           } 
        }else{
            System.out.println("Trojkat niemozliwy.");
        }
    }
    public static void main(String[] args) {
        Trojkat.analiza(5, 5, 5);
        Trojkat.analiza(6, 6, 7);
        Trojkat.analiza(3, 4, 5);
        Trojkat.analiza(3, 2, 6);
    }
}
