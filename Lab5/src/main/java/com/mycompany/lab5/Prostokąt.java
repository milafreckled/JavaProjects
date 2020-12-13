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
public class Prostokąt extends Wielokąt{

    public Prostokąt(int a, int b, int wierzcholki, int boki, int sumaKątów, int pole, int obwód, Color kolor) {
        super(wierzcholki, boki, sumaKątów, pole, obwód, kolor);
        this.a = a;
        this.b = b;
    }
    private int a, b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    @Override
    public void setBoki(int boki) {
        this.boki = boki;
    }

    @Override
    public void setPole(int pole) {
        this.pole = pole;
    }

    @Override
    public void setObwód(int obwód) {
        this.obwód = obwód;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public int getBoki() {
        return boki;
    }

    @Override
    public int getPole() {
        return pole;
    }

    @Override
    public int getObwód() {
        return obwód;
    }
    protected void obliczObwód(){
        System.out.println("Obwód prostokąta wynosi: " + 2*(a+b));
    }
    protected void obliczPole(){
        System.out.println("Pole prostokąta wynosi: " + a*b);
    }
}
