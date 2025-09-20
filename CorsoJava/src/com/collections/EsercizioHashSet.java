package com.collections;
import java.util.*;
public class EsercizioHashSet {

	public static void main(String[] args) {
	
	
//		
//		colori.add("blu");
//		colori.add("rosso");
//        colori.add("nero");
//		
//        
//       
//        System.out.println(colori);
//        
//		HashSet<String> citta = new HashSet<>();
//		
//		citta.add("Milano");
//		citta.add("Torino");
//		citta.add("Roma");
//		citta.add("Genova");
//		
//		HashSet<String> regioni = new HashSet<>();
//		
//		regioni.add("Pisa");
//		regioni.add("Lucca");
//		regioni.add("Firenze");
//		regioni.add("Bologna");
//		
//		citta.addAll(regioni);
//		
//		for( String l: citta) {
//			System.out.println(l);
//		}
		
//		citta.clear();
//		System.out.println(citta.isEmpty());
//		
//		for ( String r: citta) {
//			
//			System.out.println(r);
//			
//		}
		
//		for ( String r : regioni) {
//			
//			System.out.println(r);
//		}
//		
//		if (regioni.contains("Milano")) {
//		    System.out.println("Il valore 'Milano' è presente nel HashSet.");
//		} else {
//		    System.out.println("Il valore 'Milano' NON è presente nel HashSet.");
//		}
//
//		
//		HashSet<String> citta = new HashSet<>(List.of("Milano", "Torino","Bari","Napoli"));
//		HashSet<String> citta1 = new HashSet<>(List.of("Milano", "Genova","Bari","Lucca"));
//		
//	
//		citta.removeAll(citta1);
//		   
//		System.out.println(citta);
//		
		
//		 HashSet<String> comuni = new HashSet<>(citta);
//	        comuni.retainAll(citta1);
//
//	        System.out.println("Elementi comuni: " + comuni);
	  
//        colori.add("Rosso");
//        colori.add("Verde");
//        colori.add("Blu");
//
//        ArrayList<String> listaColori = new ArrayList<>(colori);
//
//        System.out.println("ArrayList: " + listaColori);
//		
//		
	
//		  
//				HashSet<Integer> numeri = new HashSet<>(Set.of(1,2,3,4,5));
//				HashSet<Integer> numeri1 = new HashSet<>(Set.of(6,7,8,9,10));
//		
//				HashSet<Integer> unione = new HashSet<>(numeri);
//				
//		      unione.addAll(numeri);
//				
//		      System.out.println( unione);
//				
				
//		    Crea un Intersezione di due insiemi
//		
//		HashSet<Integer> numeri = new HashSet<>(Set.of(1,2,3,4,5));
//		HashSet<Integer> numeri1 = new HashSet<>(Set.of(6,7,4,9,10));
//		HashSet<Integer> intersezione = new HashSet<>(numeri) ;
//
//		 intersezione.retainAll(numeri1);
//		 
//		 System.out.println(intersezione);
//		
//		 Crea la differenza tra due insiemi
		 
//		 HashSet<Integer> numeri = new HashSet<>(Set.of(1,2,3,4,5));
//	     HashSet<Integer> numeri1 = new HashSet<>(Set.of(6,7,8,9,10));
//		
//	     HashSet<Integer> differenza = new HashSet<>(numeri);
//	        differenza.removeAll(numeri1);
//
//	        System.out.println( differenza);
		
//		Rimuovi tutti gli elementi pari di un HashSet
		
//		 HashSet<Integer> numeri = new HashSet<>(Set.of(1,2,3,4,5));
//		
//		 numeri.removeIf(x -> x % 2 ==0);
//		  System.out.println(numeri);
		
//		Verifica se due set sono disgiunti
		
//		 HashSet<Integer> a = new HashSet<>(Set.of(1,2,3,4,5));
//		 HashSet<Integer> b = new HashSet<>(Set.of(1,2,3,4,5));
//		 
//		 System.out.println(a.equals(b));
//		 
//		Trova elemento minimo e massimo di un HashSet
		
//		   HashSet<Integer> numeri = new HashSet<>(Set.of(42,17,88,5,33));  
//	        
//	        int minimo = Collections.min(numeri);
//	        int massimo = Collections.max(numeri);
//
//	        System.out.println("Minimo: " + minimo);
//	        System.out.println("Massimo: " + massimo);
//		
//		   Convertire HashSet in array
//		
		
		 HashSet<Integer> numeri = new HashSet<>(Set.of(42,17,88,5,33));  
         
		 Integer[] b = numeri.toArray(new Integer[3]);             
		 System.out.println(Arrays.toString(b));
		
		
		
		
		
		
	    }
		 
	}	
	    
	

