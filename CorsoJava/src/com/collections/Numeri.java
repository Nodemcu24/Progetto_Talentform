package com.collections;

import java.util.*;
public class Numeri {

	public static void main(String[] args) {
		
//		Crea un ArrayList<ArrayList<Integer>> contenente 3 liste di interi. Stampale.

		ArrayList<ArrayList<Integer>> num = new ArrayList<>();
				
		
		
		
		
		ArrayList<Integer> numeri = new ArrayList<>(List.of(50, 20, 30));
		
        ArrayList<Integer> z = new ArrayList<>(List.of(0, 2, 5));
		
		ArrayList<Integer> n = new ArrayList<>(List.of(4, 10, 20));
		
		num.add(numeri);
		num.add(n);
		num.add(z);
		 
		for( ArrayList<Integer> t : num ) {
			
			System.out.println(t);
		}
		
		
	}

}
