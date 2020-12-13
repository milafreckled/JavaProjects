/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author ludmilamalomuz
 */
public class CechaMantysa {
    public static double cechaMantysa(double num) throws BadSignException{
        if (num>0){
        int cecha = 1;
        double mant = num/2;
        int flag = 0;
        while (mant>=2){
            mant/=2;
            flag++;
        }
        cecha+=flag;
        double res = 0;
        res = cecha/mant;
        return res;}else{
            throw new BadSignException("Can't be applied to negative nubers");
        }
    }
    public static void main(String[] args) throws BadSignException {
        int n;
        System.out.println("Give non-negative number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(cechaMantysa(n));
    }
}
