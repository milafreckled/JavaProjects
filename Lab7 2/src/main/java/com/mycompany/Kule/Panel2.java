/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.mycompany.Kule;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JPanel;
/**
 *
 * @author ludmilamalomuz
 */
 public class Panel2 extends JPanel{
 private ArrayList<Kula> kolizje;
 public Panel2(){
        setBackground(Color.WHITE);
        kolizje = new ArrayList<>();{
        };
        BufferedReader br = null;
         try{
            br = new BufferedReader(new FileReader("src/main/resources/zderzenia.txt"));
            int i = 0;
            br.readLine();
            String str;
            while ((str = br.readLine())!=null){
                String[] arr = str.split(",");
                kolizje.add(new Kula(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
                System.out.println("Zderzenie nr "+i);
                Kula k = kolizje.get(i);
                if(i%2==0){
                System.out.println("Kula 1: "+k.x +" "+ k.y+" "+ k.size);
                }else{
                System.out.println("Kula 2: "+k.x+" "+k.y+" " + k.size);
                }
                i++;  
            }  
        }catch(FileNotFoundException e){
            Logger.getLogger(e.getCause().getLocalizedMessage()+"Nie znaleziono pliku ");
        }catch(IOException e){
            Logger.getLogger(e.getCause().getLocalizedMessage()+" Nie mozna odczytac pliku");
        }finally{
        if (br!=null){
            try{
                br.close();
            }catch (IOException ex){
                Logger.getLogger(ex.getCause()+" Problem z zamknieciem strumienia");
            }
        }
        }
 }

  @Override
        protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        for (Kula k:kolizje){
         g.setColor(Color.MAGENTA);
         g.drawOval(k.x, k.y, k.size, k.size);
        
        };
        g.setColor(Color.YELLOW);
        g.drawString(Integer.toString(kolizje.size()), 40, 40) ;
        }
        private class Event implements MouseListener, MouseWheelListener, ActionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
            
        }
     /*public void rysujZderzenia(){
         if (kolizje!=null){
                kolizje.forEach((k) -> { this.getGraphics().drawOval(k.x, k.y, k.size, k.size);});
        }
     }*/
    /* private ArrayList<Kula> odczyt(){
        kolizje = new ArrayList<>();
        BufferedReader br = null;
         try{
            br = new BufferedReader(new FileReader("src/main/resources/zderzenia.txt"));
            int i = 0;
            br.readLine();
            String str;
            while ((str = br.readLine())!=null){
                String[] arr = str.split(",");
                kolizje.add(new Kula(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
                System.out.println("Zderzenie nr "+i);
                if(i%2==0){
                System.out.println("Kula 1: "+kolizje.get(i).x +" "+ kolizje.get(i).y+" "+ kolizje.get(i).size);
                }else{
                System.out.println("Kula 2: "+kolizje.get(i).x+" "+kolizje.get(i).y+" " + kolizje.get(i).size);
                }
                i++;  
            }  
        }catch(FileNotFoundException e){
            Logger.getLogger(e.getCause().getLocalizedMessage()+"Nie znaleziono pliku ");
        }catch(IOException e){
            Logger.getLogger(e.getCause().getLocalizedMessage()+" Nie mozna odczytac pliku");
        }finally{
        if (br!=null){
            try{
                br.close();
            }catch (IOException ex){
                Logger.getLogger(ex.getCause()+" Problem z zamknieciem strumienia");
            }
        }
        }
         return kolizje;
    }*/
        private class Kula{
            private int x;
            private int y;
            private int size;
            public Kula(int x, int y, int size){
                this.x = x;
                this.y = y;
                this.size = size;
            }
        }
}

