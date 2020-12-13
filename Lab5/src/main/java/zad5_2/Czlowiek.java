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
public abstract class Czlowiek implements Podstawowy {
    private int wiek;

    public Czlowiek(int wiek, String cechy) {
        this.wiek = wiek;
        this.cechy = cechy;
    }
    private String cechy;
    public void jedz(){
        System.out.println("jem jedzonko");
    }
    public void pij(){
        System.out.println("pije");
    }
    protected int ileLat(){
        return wiek;
    }
    protected String cechy(){
        return cechy;
    }
    
}
