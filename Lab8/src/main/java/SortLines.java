
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class SortLines {
    public static void main(String[] args) {
    Comparator<String> compare = (String o1, String o2) -> o1.length() - o2.length();
    ArrayList<String> lista = new ArrayList<>();
    lista.add("Ala");
    lista.add("ma");
    lista.add("kota");
    lista.forEach((el) -> System.out.print(el + " "));
    Collections.sort(lista, compare);
    lista.forEach((el) -> System.out.print(el+" "));
    }
}
