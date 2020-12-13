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
public class Trójkąt extends Wielokąt{
    private int h, a;

    public Trójkąt(int boki, int suma, int h, int a, int p, int obw, Color k) {
        super(3, boki, suma, p, obw, k);
        this.h = h;
        this.a = a;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setBoki(int boki) {
        this.boki = boki;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public void setObwód(int obwód) {
        this.obwód = obwód;
    }

    public int getH() {
        return h;
    }

    public int getA() {
        return a;
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
    public void obliczPole(){
        System.out.println("Pole trójkątu wynosi: "+0.5*h*a);
    }
}
