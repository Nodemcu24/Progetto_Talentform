package com.collections;

import java.util.*;

public class ArrayListOrdina {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeri= new ArrayList<>();
		
		numeri.add(6);
		numeri.add(12);
		numeri.add(5);
		numeri.add(3);
		numeri.add(8);
		
		
		
		System.out.println (numeri);
		
		Collections.sort(numeri);
		System.out.println(numeri);
		
		Collections.sort(numeri, Collections.reverseOrder());
		
		System.out.println(numeri);
	}
         
		
		
	}


