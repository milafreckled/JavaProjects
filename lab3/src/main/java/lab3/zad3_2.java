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
public class zad3_2 {

    public static void kodASCII(String lancuch) {
        String res = "";
        for (int i = 0; i < lancuch.length(); i++) {
            if ((lancuch.charAt(i) >= '0' && lancuch.charAt(i) <= '9') || (lancuch.charAt(i) >= 'a' && lancuch.charAt(i) <= 'z')) {
                res += lancuch.charAt(i);
            }

        }
        System.out.println("Koncowy lancuch: " + res);
    }
    public static void main(String[] args) {
        kodASCII("Iinformatyka_2020");
    }
}
