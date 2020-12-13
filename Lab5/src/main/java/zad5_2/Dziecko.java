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
public class Dziecko extends Czlowiek implements Podstawowy{

    public Dziecko(int wiek, String cechy) {
        super(wiek, cechy);
    }
    protected void zabawa(){
        System.out.println("Na razie zabawiam się.");
    }
    protected void placz(){
        System.out.println("Teraz placzę...");
    }

    @Override
    public void pij() {
        super.pij(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jedz() {
        super.jedz(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void spij() {
        System.out.println("Śpię sobie..."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void wstan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
