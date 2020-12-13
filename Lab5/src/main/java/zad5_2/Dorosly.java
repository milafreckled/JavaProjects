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
public class Dorosly extends Czlowiek implements Podstawowy{

    public Dorosly(int wiek, String cechy) {
        super(wiek, cechy);
    }
    protected void obowiązki(){
        System.out.println("Moje obowiązki to praca, sprątanie, gotowanie jedzenia i troska o dziecku.");
    }
    protected void odpoczynek(){
        System.out.println("Odpoczywam po ciężkim dniu...");
    }

    @Override
    public void spij() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void wstan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
