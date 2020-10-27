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
public class zad3_4 {

    public static String odczyt() {
        Scanner sc = new Scanner(System.in);
        String res = new String();
        System.out.println("Podaj lancuch:");
        //while (sc.next()!="\n"){
        res += sc.nextLine();
        //}
        return res;
    }

    public static String szyfrCezara(String lancuch) {
        //char[] toCharArray = lancuch.toCharArray();
        String str = "";
        for (int i = 0; i < lancuch.length(); i++) {
            if (lancuch.charAt(i) >= 'A' && lancuch.charAt(i) <= 'z') {
                int a = lancuch.charAt(i);
                if (Character.isUpperCase(a)) {
                    char zn = (char) (((int) a - 65)%13 + 65);
                    str += zn;
                } else {
                    char zn = (char) (((int) a - 97)%13 + 97);
                    str += zn;
                }
            }

        }
        return str;
    }

    public static String deszyfrCezara(String lancuch) {
        String str = "";
        for (int i = 0; i < lancuch.length(); i++) {
            if (lancuch.charAt(i) >= 'A' && lancuch.charAt(i) <= 'z') {
                int a = lancuch.charAt(i);
                if (Character.isUpperCase(a)) {
                    char zn = (char) (((int) a - 65)%26 + 65);
                    str += zn;
                } else {
                    char zn = (char) (((int) a - 97)%26 + 97);
                    str += zn;
                }
            }
        }
        return str;
    }

    public static boolean palindrom(String lancuch) {
        String reversed = "";
        for (int i = lancuch.length() - 1; i >= 0; i--) {
            reversed += lancuch.charAt(i);
        }
        return lancuch.equals(reversed);
    }

    public static void main(String[] args) {
        String lancuch = odczyt();
        System.out.println("Zaszyfrowany lancuch: " + szyfrCezara(lancuch));
        System.out.println("Deszyfrowany lancuch: " + deszyfrCezara(lancuch));
        if (palindrom(lancuch)) {
            System.out.println("Podany lancuch jest palindromem");
        } else {
            System.out.println("Podany lancuch nie jest palindromem");
        }

    }

}
