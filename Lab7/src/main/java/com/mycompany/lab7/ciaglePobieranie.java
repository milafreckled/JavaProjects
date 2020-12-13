/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class ciaglePobieranie {
    public static void main(String[] args) {
        
    ArrayList<Integer> liczby = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int sum = 0;
    int input = 0;
    int product = 1;
    while ((input=sc.nextInt())!=0){
        liczby.add(input);
        if (input != 0 ){
        sum += liczby.get(i);
        product *= liczby.get(i);
        i++;
        }else{
            sc.close();
            break;
        }
    }
    System.out.println("Podano " + liczby.size() +" liczb.");
    System.out.println("Suma: " + sum);
    System.out.println("Iloczyn: " + product); 
    }
    
}
