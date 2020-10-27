/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.Random;

/**
 *
 * @author ludmilamalomuz
 */
public class Zad4_2 {
    public static int[][] tworzTablice(){
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis());
        int a = rnd.nextInt(11)+10;
        int b = a;
        int table2D[][] = new int[a][b];
        for (int i=0; i<b; i++){
            for (int j=0; j<a; j++){
                Random rnd2 = new Random();
                if (i==j){
                    if (rnd2.nextInt(21)-10>=0){
                        table2D[i][j] = 1;
                    }else{
                        table2D[i][j] = -1;
                    }
                }else{
                    table2D[i][j] = rnd2.nextInt(41)-20;
                }
                
            }
        }
        return table2D;
    }
        public static double stosunek(int[][] table2D){
            double parzyste=0;
            double nieparzyste=0;
            for (int i=0; i<table2D.length; i++){
                for (int j=0; j<table2D[i].length; j++){
                    if ((i%2 == 0) && (j%2 == 0)){
                        parzyste += table2D[i][j];
                    }
                    if ((i%2 != 0) && (j%2 != 0)){
                        nieparzyste += table2D[i][j];
                    }
                }
            }
            return parzyste/nieparzyste;
        }
    public static void main(String[] args) {
        int[][] A = tworzTablice();
        for (int el[] : A){
            for (int x : el){
            System.out.print(x+" ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("Stosunek liczb o parzystych indeksach "
                + "do liczb w nieparzystych wynosi: "+stosunek(A));
    }
}
