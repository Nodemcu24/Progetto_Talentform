package com.collections;

import java.util.*;

public class ArrayListStudenti {
    
    String nome;
    int eta;

    public ArrayListStudenti(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return nome + " " + eta + " anni"; 
    }

    public static void main(String[] args) {
        
        ArrayList<ArrayListStudenti> stud = new ArrayList<>();
        
        stud.add(new ArrayListStudenti("Paolo", 25));  
        stud.add(new ArrayListStudenti("Giovanni", 32));              
        stud.add(new ArrayListStudenti("Mario", 17));  
        stud.add(new ArrayListStudenti("Giorgio", 21));  
        stud.add(new ArrayListStudenti("Luca", 24));  

        
        stud.removeIf(s -> s.eta < 20);

       
        for (ArrayListStudenti a : stud) {
            System.out.println(a);
        }
    }
}
