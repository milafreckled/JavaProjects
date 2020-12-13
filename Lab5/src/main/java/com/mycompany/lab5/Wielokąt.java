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
public class Wielokąt extends Figura{
    private int wierzcholki;
    int boki;
    private int sumaKątów;

    public Wielokąt(int wierzcholki, int boki, int sumaKątów, int pole, int obwód, Color kolor) {
        super(pole, obwód, kolor);
        this.wierzcholki = wierzcholki;
        this.boki = boki;
        this.sumaKątów = sumaKątów;
    }
    @Override
    public int getPole() {
        return pole;
    }

    @Override
    public int getObwód() {
        return obwód;
    }

    public void setWierzcholki(int wierzcholki) {
        this.wierzcholki = wierzcholki;
    }

    public void setBoki(int boki) {
        this.boki = boki;
    }

    public void setSumaKątów(int sumaKątów) {
        this.sumaKątów = sumaKątów;
    }

    @Override
    public void setPole(int pole) {
        this.pole = pole;
    }

    @Override
    public void setObwód(int obwód) {
        this.obwód = obwód;
    }

    public int getWierzcholki() {
        return wierzcholki;
    }

    public int getBoki() {
        return boki;
    }

    public int getSumaKątów() {
        return sumaKątów;
    }
    
    protected int sumaKątów(){
        return (boki - 2)/180;
    }
    
}
