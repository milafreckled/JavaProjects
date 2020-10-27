/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class zad3_3 {
    public static void odczyt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe z zakresu 33-126: ");
        int a = sc.nextInt();
        System.out.println("Znak przypisany do danej liczby: "+String.valueOf(a));
    }
    public static void main(String[] args) {
        odczyt();
    }
    
}
