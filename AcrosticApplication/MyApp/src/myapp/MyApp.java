/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;
import org.me.mylib.LibClass;
/**
 *
 * @author ludmilamalomuz
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String result = LibClass.acrostic(args);
         System.out.println("Result = "+result);
    }
    
}
