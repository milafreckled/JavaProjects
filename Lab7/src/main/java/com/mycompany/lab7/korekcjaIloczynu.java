/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class korekcjaIloczynu {
  
    public static void main(String[] args) {
         Comparator myComparator = (Comparator<Integer>)
        (Integer a, Integer b) -> (a - b);
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int il = 1;
        while (true){
   
            if (il > 256){
                lista.sort(myComparator);
                System.out.println(lista.get(0));
                if (lista.get(0) != 0){
                il /= lista.get(0);
                lista.remove(0);
                }else{
                    il /= lista.get(1);
                    lista.remove(0);
                    lista.remove(0);
                }
            } else if (il == 256){
                System.out.println("Iloczyn: "+ il);
                break;
            }
            Integer a = Integer.parseInt(sc.nextLine());
            lista.add(a);
            il *= a;
            if (il == 0){
                il = 1;
            }
        
        }
    }
    
}
