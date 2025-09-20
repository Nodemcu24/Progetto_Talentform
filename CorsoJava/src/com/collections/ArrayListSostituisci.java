package com.collections;

import java.util.*;

public class ArrayListSostituisci {

	public static void main(String[] args) {
		
		ArrayList<String> colori= new ArrayList<>();
		
		colori.add("rosso" );
		colori.add("blu");
		colori.add("verde");
		colori.add("bianco");
		colori.add("nero");
		
		
		 colori.set(0, "nero");
		
		 for(String c :colori) {
			 
			 System.out.println(c);
			 
		 }
		
		
	}

}
