/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class Sortowanie {
   
        public static void main(String[] args) { 
        Comparator myComparator;
        myComparator = (Comparator<Integer>) (Integer a, Integer b) -> b-a;
        Scanner sc = new Scanner(System.in);
         ArrayList<Integer> lista = new ArrayList<>(10000);
            //System.out.println(lista.size());
         int k = 0;
         int sum = 0;
         int product = 1;
         while (k!=-1){
             lista.add(sc.nextInt());
             sum += lista.get(k);
             product *= lista.get(k);
             if (sum >= 250 || product >= 3000000){
                 k = -1;
             }else{
                 k++;
             }
        }
         Collections.sort(lista, myComparator);
         lista.forEach(el -> {
             System.out.print(el + " ");
        });
    }
               
    
}
