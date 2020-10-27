/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zadanie2_1;

/**
 *
 * @author ludmilamalomuz
 */
public class ciagFibbonacciego {
   public static void Fibbonacciego(int n){
        int l1=0;
        int l2=1;
        while (l2<=n){
            
            System.out.printf("%d ", l2);
            int sum=l1+l2;
            l1=l2;
            l2=sum;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ciagFibbonacciego.Fibbonacciego(5);
        // TODO code application logic here
    }
    
}
