/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.mycompany.lab5.Kwadrat;
import com.mycompany.lab5.Okrąg;
import com.mycompany.lab5.Trójkąt;
import java.awt.Color;

/**
 *
 * @author ludmilamalomuz
 */
public class TestingFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trójkąt tr = new Trójkąt(3, 180, 6, 4, 0, 0, Color.YELLOW);
        Kwadrat kw = new Kwadrat(4, 0, 0, 4, 4, 360, 0, 0, Color.RED);
        Okrąg ok = new Okrąg(5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Color.MAGENTA);
        System.out.println("a = " + tr.getA()+" h = "+tr.getH());
        tr.obliczPole();
        System.out.println("x = "+kw.getX());
        kw.obliczPole();
        System.out.println("r = " + ok.getR()+", x = "+ok.getX()+", y = "+ok.getY());
        ok.obliczPole();
        // TODO code application logic here
    }
    
}
