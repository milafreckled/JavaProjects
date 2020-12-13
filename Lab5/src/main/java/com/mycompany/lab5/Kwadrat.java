/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.awt.Color;

/**
 *
 * @author ludmilamalomuz
 */
public class Kwadrat extends Prostokąt{
    private int x;
    public Kwadrat(int x, int a, int b, int wierzcholki, int boki, int sumaKątów, int pole, int obwód, Color kolor) {
        super(a, b, wierzcholki, boki, sumaKątów, pole, obwód, kolor);
        this.x = x;
    }
  

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    @Override
    public void obliczPole(){
        pole = x*x;
        System.out.println("Pole kwadratu wnosi: "+pole);
    }
    @Override
    protected void obliczObwód(){
        obwód = 4*x;
        System.out.println("Obwód kwadratu wynos: "+obwód);
    }
}
