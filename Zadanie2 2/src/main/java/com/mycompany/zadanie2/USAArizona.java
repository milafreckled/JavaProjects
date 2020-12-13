package com.mycompany.zadanie2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ludmilamalomuz
 */
    public class USAArizona extends Statek{
    private ArrayList<Uzbrojenie> uzbrojenie;
    public USAArizona(int stan, String nazwa) {
        super(stan, nazwa);
    }
    public void ustawUzbrojenie(ArrayList<Uzbrojenie> uzb) throws NieMaUzbrojeniaException{
        System.out.println("Ladujemy uzbrojenie!");
        if (uzb!=null){
        this.uzbrojenie = new ArrayList<>(uzb.size());
        for (int i=0; i<uzb.size(); i++){
            this.uzbrojenie.add(uzb.get(i));
        }
        System.out.println("Uzbrojenie zaladowano.");
        }else{
            throw new NieMaUzbrojeniaException("Nie ma uzbrojenia...");
        }
    }

    @Override
    public void bronSie(Statek atakujacy) throws InterruptedException{
           if (this.stan == SPRAWNY && atakujacy.stan == SPRAWNY) {
            System.out.println("Rozpoczynamy atake!");
            TimeUnit.SECONDS.sleep(3);
            double wynikPotyczki = Math.random() * (2 - 0 + 1) + 0;
            if (wynikPotyczki >= 0.5){
                System.out.println("Twoj statek wygral!");
                atakujacy.ustawStan(NIESPRAWNY);
            }else{
                System.out.println("Twoj statek przegral i jest uszkodzony.");
                this.ustawStan(NIESPRAWNY);
            }
        }else{
            System.out.println("Twoj statek jest niesprawny...");
        } 
    }

    @Override
    public String toString() {
        return "USAArizona{" + "nazwa = " + nazwa + ", stan = " + stan +
                ", uzbrojenie =" + uzbrojenie.toString() + '}';
    }
    
}