package com.collections;
import java.util.*;
import java.util.ArrayList;

public class NumeriInteri {

	public static void main(String[] args) {
		ArrayList< Integer> numeri = new ArrayList<>();

		numeri.add(1);
		numeri.add(23);
		numeri.add(3);
		numeri.add(15);
		numeri.add(10);
		numeri.add(15);
		
//		System.out.println(numeri.get(1));
//		
//		Rimuovi il numero 15 da un ArrayList di interi.
//		
//	 numeri.remove(3);
//	 numeri.remove(5);	
//	 
	 numeri.removeIf(n -> n == 15);

		 for( Integer num :numeri) {
			 
			 System.out.println(num);
		 }

		 
		 
		 
	}

}
