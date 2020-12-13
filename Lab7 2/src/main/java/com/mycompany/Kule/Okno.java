/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ludmilamalomuz
 */
package com.mycompany.Kule;
import java.awt.Dimension;
import java.awt.Event;
import javax.swing.JFrame;
import javax.swing.Timer;
    public class Okno {
        public static void zad1(){
        Panel p = new Panel();
        JFrame frame = new JFrame("Moje okno!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(p);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
        }
         public static void zad2(){
        JFrame frame = new JFrame("ZDERZENIA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Panel2());
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
        }
        public static void main(String[] args) {
        zad2();
        }
                
    }
