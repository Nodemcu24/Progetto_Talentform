package com.collections;

import java.util.*;

public class ExerciseArrayList {

	public static void main(String[] args) {
		
		
		List<String> tecnology = new ArrayList<String>();
		
		tecnology.add("java");
		tecnology.add("spring");
		tecnology.add("html");
		tecnology.add("javascript");
		tecnology.add("typescript");
		tecnology.add("css");
		
//		ORDINO LA LISTA CRESCENTE
		 Collections.sort(tecnology);
//		 ORDINO LA LISTA DECRESCENTE
		 Collections.reverse(tecnology);
		
		for ( String tech : tecnology) {
		
		System.out.println(tech);
		
		}	
		
		System.out.println(tecnology.size());
		System.out.println(tecnology.isEmpty());
		
		
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		age.add(25);
		age.add(35);
		age.add(45);
		age.add(55);
		age.add(65);
		age.add(75);
		
		age.remove(0);
		age.set(0, 5);
		
		for( int i: age) {
			
			System.out.println(i);
		}
		
		age.clear();
		System.out.println(age.size());
		
	}

}
