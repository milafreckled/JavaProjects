/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;


import java.util.Scanner;
import java.util.*;
/**
 *
 * @author ludmilamalomuz
 */
public class Kalkulator {
    
    public static double add(double x, double y){
        return x+y;
    }
    public static double sub(double x, double y){
        return x-y;
    }
    public static double mul(double x, double y){
        return x*y;
    }
    public static double div(double x, double y){
        double res=0;
        try{
            int a = (int)x;
            int b = (int)y;
            System.out.println(a +" "+b);
            res=a/b;
        }catch(ArithmeticException err){
             err.printStackTrace();
        }
            return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do the operations or press `q` to finish");
            try{
                
               while(sc.hasNext()){
           double x = sc.nextDouble();
           char zn = sc.next().charAt(0);
           double y = sc.nextDouble();
           switch (zn){
               case('+'): System.out.println(add(x, y));
               break;
               case('-'): System.out.println(sub(x, y));
               break;
               case('*'): System.out.println(mul(x, y));
               break;
               case('/'): System.out.println(div(x, y));
               break;
               case('q'): System.out.println("The end of the program...");
               break;
               default:
                   System.out.println("Smth went wrong...");
                   break;
           }
               }
        }catch(InputMismatchException e){
                System.out.println("Bad format...");
        }
            sc.close();
        
}
 }

    
