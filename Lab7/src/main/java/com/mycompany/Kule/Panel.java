/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Kule;

/**
 *
 * @author ludmilamalomuz
 */
import java.awt.Color;
import java.awt.Graphics;;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Panel extends JPanel {
    private ArrayList<Kula> listaKul;
    private final int size = 20;
    private final Timer timer;
    private final int DELAY = 33;
    private final int BUFOROWANYCH_KOLIZJI = 30;
    public Panel(){
        listaKul = new ArrayList<>();
        setBackground(Color.BLACK);
        addMouseListener(new Event());
        timer = new Timer(DELAY, new Event());
        timer.start();
    }
        @Override
        protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        listaKul.stream().map(k -> {
            g.setColor(k.color);
            return k;
        }).forEachOrdered(k -> {
            g.drawOval(k.x, k.y, k.size, k.size);
        });
        g.setColor(Color.YELLOW);
        g.drawString(Integer.toString(listaKul.size()),40,40);
        }
        /*public void odczyt(){
        BufferedReader br = null;
        String[] arr = null;
         try{
            JPanel newPanel = new JPanel();
            newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.X_AXIS));
            JLabel pole = new JLabel("");
            br = new BufferedReader(new FileReader("src/main/resources/zderzenia.txt"));
            ArrayList<Kula> kolizje = new ArrayList<>();
            int i = 0;
            String str="";
            while (br.readLine()!=null){
                str = br.readLine();
                arr = str.split(",");
                kolizje.add(new Kula(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
                //g.drawOval(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[2]));
                //g.drawOval(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[2])); 
                System.out.println("Zderzenie:");
                if(i%2==0){
                System.out.printf("Kula 1: %d %d, srednica: %d", kolizje.get(i).x, kolizje.get(i).y, kolizje.get(i).size);
                }else{
                System.out.printf("Kula 2: %d %d, srednica: %d", kolizje.get(i).x, kolizje.get(i).y, kolizje.get(i).size);
                }
                i++;
            }
        }catch(FileNotFoundException e){
            Logger.getLogger(e.getCause()+"Nie znaleziono pliku ");
        }catch(IOException e){
            Logger.getLogger(e.getCause()+" Nie mozna odczytac pliku");
        }finally{
        if (br!=null){
            try{
                br.close();
            }catch (IOException ex){
                Logger.getLogger(ex.getCause()+" Problem z zamknieciem strumienia");
            }
        }
        }
        }*/
         //dla 30fps -> 1s/30 = 0,033spublic Panel() {listaKul = new ArrayList<>();setBackground(Color.BLACK);addMouseListener(new Event());timer = new Timer(DELAY, new Event());timer.start();}@Overrideprotected void paintComponent(Graphics g) {super.paintComponent(g);for (Kula k : listaKul) {g.setColor(k.color);g.drawOval(k.x, k.y, k.size, k.size);}g.setColor(Color.YELLOW);g.drawString(Integer.toString(listaKul.size()),40,40);}
    private class Event implements MouseListener, ActionListener{
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        listaKul.add(new Kula(e.getX(), e.getY(), size));
        repaint();
    }

        @Override
        public void mouseReleased(MouseEvent e) {  
        listaKul.forEach(k -> {
            k.size *= 2;
        }); 
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
            listaKul.forEach(k -> {
            k.xspeed += Math.random() * 5;
            k.yspeed += Math.random() * 5;
        }); 
        }

        @Override
        public void mouseExited(MouseEvent e) {
            listaKul.forEach(k -> {
            k.xspeed = 0;
            k.yspeed = 0;
        });
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            listaKul.forEach(k -> {
                try {
                    k.update();
                } catch (IOException ex) {
                    Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
                
        });
repaint(); 
        }
       public void mouseWheelMoved(MouseWheelEvent e) {
            int notches = e.getWheelRotation();
            listaKul.forEach(k ->{
                if (e.getX() == k.x){
                k.size+=notches;
                }
        });             
        }    
    }
    private class Kula {
    public int x, y, size, xspeed, yspeed;
    public Color color;
    private final int MAX_SPEED = 5;
    public Kula(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    color = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
    xspeed = (int) (Math.random() * MAX_SPEED * 2 - MAX_SPEED);
    yspeed = (int) (Math.random() * MAX_SPEED * 2 - MAX_SPEED);
    if (xspeed == 0){
         xspeed= (int) (Math.random() * MAX_SPEED);
    }
    if (yspeed == 0){
         yspeed= (int) (Math.random() * MAX_SPEED);
    }
    }
    public void zapis(Kula kula1, Kula kula2){
        FileWriter fr = null;
        try{
            fr = new FileWriter("src/main/resources/zderzenia.txt", true);
            String k1 = String.format("%d, %d, %d\n", kula1.x, kula1.y, kula1.size);
            String k2 = String.format("%d, %d, %d\n", kula2.x, kula2.y, kula2.size);
            fr.append(k1);
            fr.append(k2);
    }catch(IOException e){
        e.printStackTrace();
    }finally{
            if (fr!=null){
                try{
                    fr.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void update() throws IOException {
        x += xspeed;y += yspeed;
        if (x <= 0 || x >= getWidth()) {
            xspeed = -xspeed;
        }if (y <= 0 || y >= getHeight()) {
            yspeed = -yspeed;
        }
        int licznikKolizji = 0;
        while (licznikKolizji <= BUFOROWANYCH_KOLIZJI){
            for (int i = 0; i < listaKul.size(); i++){
                for (int j = i+1; j<listaKul.size(); j++){
                    Kula kula1 = listaKul.get(i);
                    Kula kula2 = listaKul.get(j);
                    double dist = (kula1.x*kula2.x)- (kula1.y - kula2.y);
                    if (dist <= ((kula1.size+kula1.size)/4.0) + ((kula2.size*kula2.size)/4.0)){
                        zapis(kula1, kula2);
                        licznikKolizji++;
                        int xrob = kula1.xspeed;
                        int yrob = kula1.yspeed;
                        kula1.xspeed = kula2.xspeed;
                        kula1.yspeed = kula2.yspeed;
                        kula2.xspeed = xrob;
                        kula2.yspeed = yrob;
                    }
                }
            }      
        }
        }
    }
}
    
