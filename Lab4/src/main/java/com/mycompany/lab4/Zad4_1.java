/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class Zad4_1 {
    public static int[] wczytajTablice(int[] table){
    for (int i=0; i<100; i++){
        table[i]=i;
    }
    return table;
}
   public static void transform(int[] table){
       for (int i=0; i<table.length; i++){
           System.out.print("0"+table[i]+", ");
           if (table[i]%9==0 && table[1]!=0){
               System.out.println("\n");
           }
       }
       double sr=0;
       for (int i=0; i<10; i++){
           for (int j=i; j<i+90; j+=10){
               sr+=table[j];
           }
           sr/=10;
           System.out.print(sr+", ");
           sr=0;
       }
   }
       public static void main(String args[]){
           int A[]=new int[100];
           A=wczytajTablice(A);
           transform(A);
       }
  } 

