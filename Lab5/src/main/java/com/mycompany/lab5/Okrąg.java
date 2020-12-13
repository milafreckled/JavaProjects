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
public class Okrąg extends Elipsa {

    public Okrąg(int r, int x, int y, double a, double b, int x1, int y1, int x2, int y2, double F1, double F2, int pole, int obwód, Color kolor) {
        super(a, b, x1, y1, x2, y2, F1, F2, pole, obwód, kolor);
        this.r = r;
        this.x = x;
        this.y = y;
    }
    private int r;
    private int x, y;
    public void setR(int r) {
        this.r = r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setPole(int pole) {
        this.pole = pole;
    }

    @Override
    public void setObwód(int obwód) {
        this.obwód = obwód;
    }

    public int getR() {
        return r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
        this.pole = (int)Math.PI*r*r;
        System.out.println("Pole okrągu wynosi: "+this.pole);
    }
    protected void obliczObwód(){
        this.obwód = (int)(2*Math.PI*r);
        System.out.println("Obwód okrągu wynosi: "+this.obwód);
    }
}
