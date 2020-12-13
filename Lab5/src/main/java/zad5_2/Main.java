/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5_2;

/**
 *
 * @author ludmilamalomuz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uczen u = new Uczen(15, "Uczy się w liceum");
        u.jedz();
        u.spij();
        Student st = new Student(18, "Studiuje na Politechnice");
        st.nieIdzNaZajecia();
        Emeryt em = new Emeryt(65, "Babcia");
        em.odbierzEmeryture();
        // TODO code application logic here
    }
    
}
