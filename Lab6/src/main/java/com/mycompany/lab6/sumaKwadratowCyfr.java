/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class sumaKwadratowCyfr {
 
    public static int sum(int n) throws NotProperNumberException{
        if (n>=99 && n<=999){
        int sum = 0;
        while (n>0){
            int mod = n%10;
            n /= 10;
            sum += mod*mod;
        }
        return sum;}else{
            throw new NotProperNumberException("Liczba nie należy do zakresu");
        }
    }
    public static void main(String[] args) throws NotProperNumberException {
        int n;
        System.out.println("Podaj liczbę z zakresu [99, 999]:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Suma kwadratow cyfr liczby "+n+" = "+sum(n));
    }
}
