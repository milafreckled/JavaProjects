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
public class Student extends Dorosly implements Podstawowy, Studia, Praca{

    public Student(int wiek, String cechy) {
        super(wiek, cechy);
        System.out.print("Jestem studentem i ");
    }
  
    @Override
    public void studiuj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nieIdzNaZajecia() {
  
        System.out.println("dziś wagaruję...");
   
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void spaceruj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void idzDoStolowki() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pracuj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void placPodatki() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sprzataj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gotujObiad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
