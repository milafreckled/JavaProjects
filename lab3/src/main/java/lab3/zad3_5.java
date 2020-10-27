/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author ludmilamalomuz
 */
public class zad3_5 {
    public static String toBinary(int i){
        /*String res = "";
        while (i>0){
            char zn = (char)(i%2);
            i=i/2;
            res+=zn;
        }
        var res2 = "";
        for (int j=res.length() -1; j>=0; j--){
            res2+=res.charAt(j);
        }*/
        return Integer.toBinaryString(i);
    }
    public static void sekwencjaZer(String str){
        //Integer liczba = Integer.parseInt(str);
      
        int max=0;
        for (int i=0; i<=str.length()-1; i++){
            if (str.charAt(i)=='1'){
                int k=0;
                int j=i;
                j++;
                if (j!=str.length()-1){
                    while (str.charAt(j)!='1' && j!=str.length()-1){
                        k++;
                        j++;
                    }
                    if (k>=max){
                        max=k;
                    }
                }   
            }
        }
        System.out.println("Najwieksza sekwencja zer wynosi: "+max);
    }
    public static void main(String[] args) {
        String str = toBinary(556);
        System.out.println("Binarna postac: "+str);
        sekwencjaZer(str);
    }
}

