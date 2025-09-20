package com.collections;

import java.util.*;

public class ArrayListSomma {

	public static void main(String[] args) {

		ArrayList<Integer> interi = new ArrayList<>();
		
		int somma= 0;
		for( int intero: interi)
		  somma += intero;
		System.out.println(somma);
		
		  ArrayList<Integer> copia = new ArrayList<>();
	        copia.addAll(interi);

	        System.out.println("Elementi copiati nella seconda lista: " + copia);
	    }
	

	}


