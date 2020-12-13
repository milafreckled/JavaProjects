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
public class Elipsa extends Figura{
    private double a;
    private double b;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double F1;
    private double F2;

    public Elipsa(double a, double b, int x1, int y1, int x2, int y2, double F1, double F2, int pole, int obwód, Color kolor) {
        super(pole, obwód, kolor);
        this.a = a;
        this.b = b;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.F1 = F1;
        this.F2 = F2;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public double getF1() {
        return F1;
    }

    public double getF2() {
        return F2;
    }

    @Override
    public int getPole() {
        return pole;
    }

    @Override
    public int getObwód() {
        return obwód;
    }
    
    protected double odlegloscC(){
        return Math.sqrt((a*a) - (b*b));
    }
}

