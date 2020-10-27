/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author ludmilamalomuz
 */

public class zad3_1 {
    public static int obecnoscWLancuchu(char znak, String lancuch){
        int k=0;
        if (lancuch.isBlank()==false){
            for (int i=0; i<lancuch.length(); i++){
                if (lancuch.charAt(i)==znak){
                    k++;
                }
            }
            return k;
        }else{
           return -1;
        }
    }
    public static void main(String[] args) {
        char zn = 'a';
        String lancuch = "Ala ma kota";
        if (obecnoscWLancuchu(zn, lancuch)!=0){    
            System.out.println("Lancuch "+lancuch+" zawiera "+obecnoscWLancuchu(zn, lancuch)+" wystapien znaku "+"'"+zn+"'.");
        }else{
            System.out.println("Lancuch "+lancuch+"nie zawiera znaku"+zn);
        }
            
    }
    
}
