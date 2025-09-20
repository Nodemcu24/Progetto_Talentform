package com.collections;

import java.util.*;

public class ArrayListStringhe {

	public static void main(String[] args) {
		
		ArrayList< String> names = new ArrayList<>();
		
		names.add("Paolo");
		names.add("Luca");
		names.add("Fabio");
		
		for (String nome: names) {
		
			System.out.println(nome);
	}

//		Sostituisci il primo elemento di un ArrayList di stringhe con un altro valore.
		
		names.set(0,"Fabio");
		names.set(0, "Luca");
		for (String nome: names) {
			
			System.out.println(nome);
	}

		
//		 Stampa quanti elementi contiene un ArrayList
		
		 System.out.println(names.size());

		 }
		
   }
