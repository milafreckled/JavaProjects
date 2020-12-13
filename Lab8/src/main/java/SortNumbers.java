
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
//import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class SortNumbers{
    public static void main(String[] args) {
        Comparator<Integer> compare = (Integer o1, Integer o2) -> o1 - o2;
        LinkedList<Integer> lista = new LinkedList<>();
        for (int i = 0; i<10; i++){
            lista.add((int) (Math.random() * 10));
        }
        lista.forEach((el) -> System.out.print(el+" "));
         System.out.println();
        Collections.sort(lista, compare);
        lista.forEach((el) -> System.out.print(el+" "));
        
    }
}
