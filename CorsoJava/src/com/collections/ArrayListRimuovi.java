package com.collections;

import java.util.*;

public class ArrayListRimuovi {

	public static void main(String[] args) {
		
//		Rimuovi il numero 15 da un ArrayList di interi.	
		
		List<Integer> num = new ArrayList<>();
		
		 num.add(20);
		 num.add(15);
		 num.add(12);
		 num.add(14);
		 num.add(0);
		 
		 num.remove(1);
		 
		 for(Integer i:num) {
			 
			 System.out.println(i);
		 }
		

		 
		 

	}

}
