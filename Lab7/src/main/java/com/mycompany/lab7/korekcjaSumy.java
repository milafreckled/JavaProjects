/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class korekcjaSumy {
    public static void main(String[] args) {
        Comparator myComparator;
        myComparator = (Comparator<Integer>) (Integer a, Integer b) -> b-a;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int sum = 0;
        while (true){
            Integer a = Integer.parseInt(sc.nextLine());
            lista.add(a);
            sum += a;
            if (sum > 64){
                lista.sort(myComparator);
                sum -= lista.get(0);
                lista.remove(0);
            } else if (sum == 64){
                System.out.println("Suma: "+sum);
                break;
            }
        }
        
    }
}
