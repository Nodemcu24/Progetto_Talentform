package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCaratteri {

    public static void main(String[] args) {
        
     
        ArrayList<Character> str = new ArrayList<>();
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
           
        }

       
        Collections.sort(str, Collections.reverseOrder());

       
        System.out.println("Lista ordinata in modo decrescente: " + str);

       
        System.out.println("Lunghezza della lista: " + str.size());

       
        System.out.println("La lista è vuota? " + str.isEmpty());
    }
}
