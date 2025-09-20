package com.collections;

import java.util.*;

public class ArrayListUltimoEelemento {

	public static void main(String[] args) {
	
		
	

	
		        List<String> lista = new ArrayList<>();
		        lista.add("Roma");
		        lista.add("Milano");
		        lista.add("Napoli");

		        String ultimo = null;
		        for (String elemento : lista) {
		            ultimo = elemento;
		        }

		        System.out.println(  ultimo);
		    }
		}

		
		
		
	


