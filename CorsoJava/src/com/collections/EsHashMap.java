package com.collections;

import java.util.*;


public class EsHashMap {

	public static void main(String[] args) {
//		
////		Crea un HashMap che associa un nome a un'età. Inserisci tre coppie e stampale.
//		
//		HashMap<String,Integer> dati = new HashMap<>();
//		dati.put("Luca", 15);
//		dati.put("Marco", 12);
//		dati.put("Gianni", 10);
//		dati.put("Anna",22);
//		
////		 PER STAMPARE UN SOLO DATO
//		
//		System.out.println(dati.get("Anna"));
////		
////		Rimuovi "Luca" dal dizionario.
//		dati.remove("Luca");
//		System.out.println(dati);
//		
//    //	Verifica se una chiave esiste
//		
//   	System.out.println(dati.containsKey("Luca"));
//		
////		Controlla se c’è qualcuno con età 30.
//		
//	System.out.println(dati.containsValue(30));
////		
////		Stampa tutte le chiavi del HashMap.
//		
//     	System.out.println(dati.keySet());
//		
////		Stampa tutti i values della mappa
//	       
//       for(String chiave : dati.keySet()) {
//           System.out.println(chiave);
//        }
//		System.out.println(dati.values());
//		
////		Stampa ogni nome con la rispettiva età.
//		
//	for (String nome : dati.keySet()) {
//		    System.out.println(nome + " ha " + dati.get(nome) + " anni.");
//		}
//
////		Svuota la mappa e verifica se e vuota
////		
////		
//     	dati.clear();
//		System.out.println(dati.isEmpty());
//		
////		Crea una HashMap<Integer, Integer> dove la chiave è un numero da 1 a 5 e il valore è il suo quadrato.
//		
//		HashMap<Integer, Integer> map = new HashMap<>();
////		
//		for( int i =1; i<6; i++) 
//		    map.put(i, i*i);                             
//		System.out.println(map);
//		
//		
////		Trova la persona con l’età massima.
////		Trova la chiave con valore massimo
////		
//		
//		HashMap<String,Integer> persona = new HashMap<>();
//	    persona.put("Luca",   15);
//	    persona.put("Marco",  12);
//	    persona.put("Gianni", 10);
//	    persona.put("Anna",   22);
////		
//		String personaMax = null;
//		int EtaMax = -1;
////
//           for( String chiave : persona.keySet()) {
//        	   
//        	   if( persona.get(chiave) > EtaMax) {
////        		   
//        		   EtaMax = persona.get(chiave);
////        		   
//        		   personaMax = chiave;
////        		   
//       	   }
////        	   
//          }
////		
//		    System.out.println(EtaMax + personaMax);
//		    
////		    Aggiungi "Sara" solo se non è già presente. 
//		    
//		 persona.putIfAbsent("Sara", 22);
//		    	
////		 Dati due array, uno con nomi e uno con età, crea una mappa.
//		    	
////	    
//	    String[] nomi = {"Anna", "Marco", "Luca"};
//          Integer[] eta = {25, 22, 30};
//
//       HashMap<String, Integer> anagrafe = new HashMap<>();
//	    
//	      for( int i=0; i< nomi.length; i++) {
//	    	  anagrafe.put(nomi[i], eta[i]);
//	        }
//
//	        System.out.println(anagrafe); 
////	    	  
////	        Conta le occorrenze di parole in una frase
//	        
//	       
//        String frase = "Esempio di esempio frase di prova frase ";
////	        
//	        HashMap<String,Integer> conteggio = new HashMap<>();
////	        
//	         for ( String i : frase.split("")) {
////	        	 
//	        	 conteggio.put(i, conteggio.getOrDefault(i,0) +1);
////	        	 
////	         }
////	        
////	        System.out.println(conteggio);
//	        
////	        Inverti chiavi e valori
//	        
//	        HashMap<String,Integer> dati = new HashMap<>();
//        dati.put("Luca", 15);
//		    dati.put("Marco", 12);
//			dati.put("Gianni", 10);
////			
//	   HashMap<String,Integer> original = new HashMap<>(Map.of("Luca",16, "Andrea", 40, "Massimo", 35));
////	        
//		   HashMap<Integer,String> inverted = new HashMap<>();
////			
//  		for(Entry<String, Integer> i : original.entrySet() ){
//				inverted.put(i.getValue(),i.getKey());
////				
////				
//			}
//			
//	        System.out.println(inverted);
	        
//	        Trova la chiave con valore massimo
	        
//	    	HashMap<String, Integer> map = new HashMap<>(Map.of("A", 3, "B",6, "C",9));
//	        
//	        String maxKey = Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
//	        
//	        System.out.println("Chiave con valore massimo: " + maxKey);
//	        
////	        Trova la chiave con valore minimo
//	        
//	        String minKey = Collections.min(map.entrySet(),Map.Entry.comparingByValue()).getKey(); //trovare chiave minima mettendo a confronto i valori(Collections/Map)
//	        
//	        System.out.println("Ecco la chiave con valore minimo: " + minKey);
//	        
//	        
////	        Unisci due mappe sommando i valori
//	        
//	        
//	        HashMap<String,Integer> mappa1 = new HashMap<>();
//	        
//	        mappa1.put("A",10);
//	        mappa1.put("B", 30);
//	        
//	        
//	        HashMap<String,Integer> mappa2 = new HashMap<>();
//	        
//	        mappa2.put("D",21);
//	        mappa2.put("E",10);
//	        mappa2.put("F",4);
//	        
//	        HashMap<String,Integer> mappaTotale = new HashMap<>();
//	         
//	        for(Map.Entry<String, Integer> entry : mappa2.entrySet()) {
//	            mappaTotale.merge(entry.getKey(), entry.getValue(), Integer::sum);
//	        }
//	        
//	        System.out.println("La nuova mappa, mostra i seguenti valori: " + mappaTotale);
//	        
//	        
//	        
////	        Rimuovi le entry con valori inferiori a una soglia
////	        
//	        int soglia =20;
//	        HashMap<Integer,Integer> mappa = new HashMap<>(Map.of(1,10,2,20,3,30));
//	         
//	        mappa.values().removeIf(x-> x < soglia);
//	        
//	        System.out.println(mappa);
//	        
//	        
////	        Ordina la mappa per chiave
//	        
//	        
//	        HashMap<String, Integer> mappa3 = new HashMap<>(Map.of("B", 3, "A", 5, "C", 6));
//
//	        TreeMap<String, Integer> mappa4 = new TreeMap<>(mappa3);
//
//	        
//	        System.out.println(mappa4);
//
//	        
////	        Ordina la mappa per valore
//	        
//	        List<Map.Entry<String, Integer>> mappa5 = new ArrayList<>(map.entrySet());
//	        
//	        mappa5.sort(Map.Entry.comparingByValue());
//	        System.out.println(mappa5);
//	        
//	        
////	        Trova tutte le chiavi con un certo valore
////	        
//	        
//	        HashMap<String, Integer> m = new HashMap<>(Map.of("A", 1, "B", 2, "C", 1, "D", 3));
//	        
//	        int target =1;
//	        
//	        ArrayList<String> arr = new ArrayList<>();
//	        
//	        for ( var e : m.entrySet()) {
//	        	
//	        	if(e.getValue() == target)
//	        		arr.add(e.getKey());
//	        }
//	        
//	        System.out.println(arr);
//	        
//	        
////	        Conta le frequenze di caratteri in una stringa
//	        
//	        
//	        String frutta = "pesca";
//	        
//	        HashMap<Character, Integer> conto = new HashMap<>();
//	        
//	         for(char c : frutta.toCharArray()) {
//	        	 
//	        	 conto.put(c,conto.getOrDefault(c,0) +1);
//	         }
//	        
//	        
//	         System.out.println(conto);
//	         
//	         
////	         Rimuovi le chiavi se soddisfano una condizione
//	       
//	         
//             HashMap<String, Integer> mappa6 = new HashMap<>();
//
//                 mappa6.put("a", 1);
//                 mappa6.put("b", 2);
//                 mappa6.put("c", 3);
//                 mappa6.put("d", 4);
//
//                
//                 mappa6.entrySet().removeIf(entry -> entry.getValue() > 2);
//
//
//                 System.out.println(mappa6); 
//                 
//                 
//                 //Stringa più lunga
//                 
//                 HashMap<String, Integer> lunghezza = new HashMap<>(Map.of("alfa", 1, "betaGamma", 2, "pi",3));
//
//                 String maxL = Collections.max(lunghezza.keySet());
//                 
//                 Comparator.comparingInt(String :: length);
//                 
//                 System.out.println( maxL);
//                 
////                 Sostituisci tutti i valori con il loro quadrato
//                 
//                 HashMap<String, Integer> mappa7 = new HashMap<>(Map.of("A", 7, "B", 5, "C", 6));
//                 
//                 mappa.replaceAll((k, v) -> v * v);
//                 
//                 System.out.println("I valori al quadrato dentro l'HashMap ora sono: " + mappa7);
//             
////                 Incrementa un valore solo se la chiave esiste
//                 
//           

               

                 // Incrementa solo se la chiave esiste
                 
                 HashMap<String,Integer> contatori = new HashMap<>(Map.of("a",5,"b",2));
                 contatori.computeIfPresent("a",(k,v)->v+1);
                 System.out.println(contatori);
                 
//                 Converti HashMap in una lista di stringhe chiave=valore
                 
                 HashMap<Integer, String> map = new HashMap<>(Map.of(1,"a",2,"b",3,"c"));
                 List<String> lista = new ArrayList<>(map.values());                     
                 System.out.println(lista);
                 
                 
	   }      
         
	}
	         
	      

	         
	         
	         
	         
	         
	         
	        
	    
	
		    	
	
		    
		    





