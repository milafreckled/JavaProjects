/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author ludmilamalomuz
 */
public class Snake extends JFrame{
    public Snake(){
        initUI();
        
    }
    private void initUI(){
        add(new Board());
        setResizable(false);
       
        pack();
        setTitle("Zmejka");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });
       
    }
}

    