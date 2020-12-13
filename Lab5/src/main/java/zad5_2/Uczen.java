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
public class Uczen extends Dziecko implements Podstawowy, Szkola{

    public Uczen(int wiek, String cechy) {
        super(wiek, cechy);
        System.out.print("Jestem uczniem i ");
    }

    @Override
    public void jedz() {//To change body of generated methods, choose Tools | Templates.
        super.jedz();
    }

    @Override
    public void pij() {
        super.pij(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void spij() {
         super.spij();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void wstan() {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void uczSie() {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void odroblekcje() {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void idzDoSzkoly() {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String odpowiadaj() {
        return "Odpowiadam na zajęciach."; //To change body of generated methods, choose Tools | Templates.
    }
    
}
