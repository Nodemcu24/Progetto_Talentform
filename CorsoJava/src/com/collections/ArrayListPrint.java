package com.collections;

import java.util.*;

public class ArrayListPrint {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("primo");
		arr.add("secondo");
		arr.add("terzo");
		arr.add("quarto");
		arr.add("quinto");
		
		   for (int i = 0; i < arr.size(); i++) {
	            System.out.println("Elemento " + (i + 1) + ": " + arr.get(i));
	    }
	    
	}
		
		

	}


