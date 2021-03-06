/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad9;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ludmilamalomuz
 */
public class Zad9_3 {
    public static String szyfrCezara(String message, int shift) {
    
        String result = "";
for (char character : message.toCharArray()) {
    if (character != ' ') {
        int originalAlphabetPosition = character - 'a';
        int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
        char newCharacter = (char) (65 + newAlphabetPosition);
        result += newCharacter;
    } else {
        result += character;
    }
}
return result;
 }

    public static String deszyfrCezara(String message, int shift) {
        return szyfrCezara(message, 26-shift);
 }
    public static void main(String[] args) {
                FileWriter fileWriter = null;
         String wiersz = "Jan Brzechwa"
                 + "Entliczek-pentliczek" +
"Entliczek-pentliczek, czerwony stoliczek,"
                 + "A na tym stoliczku pleciony koszyczek,"
                 + "W koszyczku jabłuszko, w jabłuszku robaczek,"
                 + "A na tym robaczku zielony kubraczek.Powiada robaczek: "
                 + "I dziadek, i babka,I ojciec, i matka jadali wciąż jabłka,"
                 + "A ja już nie mogę! Już dosyć! Już basta!Mam chęć na befsztyczek!\""
                 + " I poszedł do miasta.Szedł tydzień, a jednak nie zmienił zamiaru,"
                 + "Gdy znalazł się w mieście, poleciał do baru."
                 + "Są w barach -wiadomo -zwyczaje utarte:"
                 + "Podchodzi doń kelner, podaje mu kartę,"
                 + "A w karcie -okropność! -przyznacie to sami:"
                 + "Jest zupa jabłkowa i knedle z jabłkami,"
                 + "Duszone są jabłka, pieczone są jabłkaI z jabłek szarlotka, i komput [placek], i babka!"
                 + "No, widzisz, robaczku! "
                 + "I gdzie twój befsztyczek?"
                 + "Entliczek-pentliczek, czerwony stoliczek";
        try{
           fileWriter = new FileWriter("src/main/resources/szyfr.txt");
           System.out.println("Zaszyfrowany lancuch: " + szyfrCezara(wiersz, 3));
           System.out.println("Deszyfrowany lancuch: " + deszyfrCezara(wiersz, 3));
           fileWriter.append("Zaszyfrowany lancuch: "+szyfrCezara(wiersz, 3));
           fileWriter.append("Deszyfrowany lancuch: "+deszyfrCezara(wiersz, 3));
        }
        catch(IOException e){
            System.out.println("Blad zapisu do pliku "+e.getCause());
        }finally{
            if (fileWriter!=null){
                try{
                    fileWriter.close();
                }catch(IOException e){
                    System.out.println("Nie udalo sie zamknac pliku "+e.getCause());
                }
            }      
        }
    }
}
