package com.collections;
import java.util.*;

public class ExampleIterator {

	public static void main(String[] args) {
		
//		  List<String> names = new ArrayList<String>();
//
//	        names.add("luca");
//	        names.add("paolo");
//	        names.add("marco");
//	        names.add("anna");
//	        names.remove("luca");
//
//
//	        Iterator<String> it = names.iterator();
//
//
//	        while (it.hasNext()) {
//
//	            String students = it.next();
//
//	            System.out.println(students);
//

//	        }
//	        
////	        Stampa tutti gli elementi di una lista utilizzando Iterator
////	        
//	        
//	        List<String> persona = Arrays.asList("Paolo", "Giovanni", "Luca");
//	        
//	        Iterator<String> ti = persona.iterator();
//	        
//	        while ( ti.hasNext()) {
//	        	
//	        	System.out.println(ti.next());
	        	
//	        }        	
	        	
	        	
//	        Conta il numero di elementi integer
//	        
//	        ArrayList<Integer> num = new ArrayList<>( Arrays.asList(1,2,3,4,5));
//	        
//	        Iterator<Integer> cont = num.iterator();
//	        
//	        int count =0;
//	        
//	        while( cont.hasNext()) {
//	        	
//	        	cont.next();
//	            count++;
//	        }
//	        
	        
//	        
//	        System.out.println(count);
	        	
////	        Somma tutti gli elementi
	        	
//	        
//	        List<Integer> numeri = Arrays.asList(5,10,15,20);
//	        
//	        Iterator<Integer> it3 = numeri.iterator();
//	        int somma =0;
//	        
//	        while (it3.hasNext()) {
//	            somma = somma + it3.next();
//	        }
//	        System.out.println(somma);
	        	
////	        Trova il numero massimo con Iterator
//	        
//	        
//	        List<Integer> nums = Arrays.asList(4,10,1,7);
//	        
//	        Iterator<Integer> itg = nums.iterator();
//	        
//	        if(! itg.hasNext()) {
//	        	
//	        	System.out.println("Array vuoto");
//	        	
//	        }
//	        
//	        int max = itg.next();
//	        
//	        while( itg.hasNext()) {
//	        	  int n = itg.next(); 
//	              if (n > max) max = n;
//	          }
	        	
	        	
	        	
//	        	System.out.println("Massimo: " + max);
	        	
	        
	        	
////	        	Verifica se un elemento è presente
	        
//	        
//	        	List<String> colori = Arrays.asList("blu", "verde", "nero");
//	        	
//	        	 Iterator<String> itn = colori.iterator();
//	        	 boolean isln = false;
//	        	 
//	        	 while( itn.hasNext()) {
//	        		if( itn.next().equals("verde")) {
//	        			
//	        			isln= true;
//	        			
//	        			break;
//	        			
//	        		}
//	        		 
//	        	 }
//	        	
//	        	 System.out.println(isln);
//	        	 
	        	 
////	        	 Copia tutti gli elementi in una nuova lista
//	        	 
//	        	 
//	        	  List<Integer> numeri1 = Arrays.asList(1, 2, 3, 4, 5);
//	              List<Integer> copiaNumeri = new ArrayList<>();
//
//	              Iterator<Integer> ir = numeri1.iterator();
//
//	              if (!ir.hasNext()) {
//	                  System.out.println("La lista è vuota");
//	              }
//
//	              while (ir.hasNext()) {
//	                  copiaNumeri.add(ir.next());
//	              }
//
//	              System.out.println(copiaNumeri);
//	              
	              
//	              
////	              Conta quanti numeri sono pari
//	              
//	              List<Integer> num1 = new ArrayList<>(List.of(1,2,3,4,5,6));
//	              int numeriInteri=0;
//	              int elemento=0;
//	              
//	              Iterator<Integer> n =num1.iterator();
//	              while (n.hasNext()) {
//	                  elemento=n.next();
//	                  if(elemento % 2 ==0)
//	                      numeriInteri++;
//	              }
//	              
//	              System.out.println("I numeri interi presenti sono: " + numeriInteri);
//	              
	              
////	              Rimuovi tutti gli elementi minori di 10 da un set
//	              
//	              Set<Integer> interi = new HashSet<> (Arrays.asList(5,9,8,7,6));
//	              
//	              Iterator<Integer> Itr = interi.iterator();
//	              
//	               while( Itr.hasNext()) {
//	            	   
//	            	  if(Itr.next() < 10    ) {
//	            		  
//	            		  Itr.remove();
//	            	  }
//	               }
//	              
//	               System.out.println( interi);
	               
	              
//	              
////	               Concatena tutte le stringhe in una frase
//	              
//	              
//	               List<String> stringhe = Arrays.asList("hello", " ", "world");  
//	               Iterator it = stringhe.listIterator();                         
//	               String frase = "";                                             
//	               while (it.hasNext()) {                                         
//	                   String e = (String)it.next();                              
//	                   frase = frase.concat(e);                                   
//	               }                                                              
//	               System.out.println(frase);
//	               
//	               
////	               Moltiplica ogni numero per 2 e salva in nuova lista
//	               
//	               List v = Arrays.asList(50, 40, 80);  
//	               List<Integer> t = new ArrayList<>(); 
//	               Iterator i = v.listIterator();       
//	               while(i.hasNext()) {                 
//	                   t.add((int)i.next()*2);          
//	               }                                    
//	               System.out.println(v);               
//	               System.out.println(t);
//	               
//	               
////	               Conta quante parole iniziano con "a"
//	               
//	               Set<String> parole = new HashSet<>(Arrays.asList("Scarpa", "Cavallo", "Astuccio", "Botte", "Ancora"));
//	               Iterator<String> str = parole.iterator();
//	               int count = 0;
//	               while (str.hasNext()) {
//
//	                   if (str.next().startsWith("A")) {
//	                       count++;
//	                   }
//	               }
//	               
//	               System.out.println(count + " Parole che iniziano con a");
//	              
	              
//	               Scorri una lista con Iterator e stampa solo i numeri pari
	               
	               
	               
	             Set<Integer>  nums = new HashSet<>(List.of( 1,2,3,4,5,6,7,8,9,10));
	               
	               Iterator<Integer> pari = nums.iterator();
	               
	             
	               while( pari.hasNext()) {
	            	 int posPari= pari.next();
	            	 
	            	  if ( posPari %2 ==0) {
	            		  
	            		  System.out.println( posPari);
	            	  }
	            	   
	               }
	               
	         	
	             
//	           Iterator su entrySet()
//	           	Stampa chiavi e valori di una mappa
//	               
	            Map<String, String>  capitali = new HashMap<>();
	              
	            capitali.put("Italia",  "Roma");
	            capitali.put("Spagna",  "Madrid");   
	            capitali.put("Francia",  "Parigi");  
	               
	            Iterator<Map.Entry<String, String>> itr = capitali.entrySet().iterator();
	               
	               while( itr.hasNext()) {
	            	   
	            	   Map.Entry<String, String> entry = itr.next();
	            	   
	            	   System.out.println(entry.getKey()+    " "    + entry.getValue());
	            	   
	               }
	            
	               
	               
	               
//	               Trova una chiave specifica in una mappa
	               
//	               
//	             HashMap<String,Integer>  anagrafe = new HashMap<>();
//	             
//	             anagrafe.put("Riccardo", 30);
//	             anagrafe.put("Ramona", 32);
//	             anagrafe.put("Renato", 35);
//	              
//	             Iterator<Map.Entry<String, Integer>> iter= anagrafe.entrySet().iterator();
//	               
//	               boolean chiave = false;
//	               
//	               while( iter.hasNext()) {
//	            	   
//	            	   if( iter.next().getKey().equals("Ramona")) {
//	            		   
//	            		   chiave = true;
//	            		   break;
//	            	   }
//	               }
//	            
//	              System.out.println(chiave);
//	              
//	              
//	              
////	              Rimuovi tutte le entry con valore sotto 50
//	              
//	              
//	              Map<String, Integer> voti = new HashMap<>();
//	              
//	              voti.put("A", 100);
//	              voti.put("B", 80);
//	              voti.put("C", 60);
//	              voti.put("D", 40);
//	              voti.put("F", 10);
//	              
//	       System.out.println(voti) ;
//	       
//	       Iterator<Map.Entry<String, Integer>> tt = voti.entrySet().iterator();
//	             
//	       while(tt.hasNext()) {
//	            Map.Entry<String, Integer> entry = tt.next();
//	            if(entry.getValue() < 50) {
//	                tt.remove();
//	            }
//	        }
//	        
//	        System.out.println("I voti attuali all'interno del Map sono: " + voti);
//	       
//	       
////	        Rimuovere tutti gli elementi dispari da una lista
//	       
//	        
//	        
//	       List<Integer>  nums1 = new ArrayList<>(List.of( 1,2,3,4,5,6)) ;
//	        
//	        Iterator<Integer> tr = nums1.listIterator();
//	        
//	        while( tr.hasNext()) {
//	        	
//	        	if (tr.next() %2 !=0) {
//	        		tr.remove();
//	        		
//	        	}
//	        }
//	        
//	        System.out.println(nums1);
//	        
	        
//	        Usare ListIterator per scorrere una lista al contrario
	        
	        
//	        List<Integer>  lista = new ArrayList<>(List.of( 10,4,3,0,5,6)) ;
//	        
//	        ListIterator<Integer> itrr= lista.listIterator(lista.size());
//	        
//	        while ( itrr.hasPrevious()) {
//	        	
//	        	System.out.println(itrr.previous());
//	        }
//	        
	        
	        
////	        Usare un Iterator per invertire una stringa (da lista di caratteri)
//	        
////	        Primo modo
//	        
//	        
//	        List<Character> lista1 = new ArrayList<>(List.of('0', 'a','i','c'));
//	        ListIterator<Character> ttl = lista1.listIterator(lista1.size());
//	        String stringa = "";
//	        while(ttl.hasPrevious()) {
//	        	
//        	Character c = ttl.previous();
//	        	   stringa = stringa.concat(String.valueOf(c));                   
//	}                                                                  
//	System.out.println(stringa);
//
//	      // Secondo metodo
//	
//	
//	        String s = "iterator";
//	        List<Character> chars = new ArrayList<>();
//	        for(char c : s.toCharArray()) chars.add(c);
//	        ListIterator<Character> ttt = chars.listIterator(chars.size());
//	        StringBuilder sb = new StringBuilder();
//	        while(ttt.hasPrevious()) sb.append(ttt.previous());
//	        System.out.println(sb);
//	        
//	        
////	        Usare remove() per eliminare stringhe vuote
////	        
//	        
//	        
//	        List<String> lista2 = new ArrayList<>(List.of("a", "", "b", "", "c"));
//	 	        Iterator<String> itl = lista2.iterator();
//	        
//	        while(itl.hasNext()) {
//            
//	            if(itl.next().isEmpty()) {
//	                
//	                itl.remove();
//	            }
//	        }
//        
//	        System.out.println(lista2);
//	        
//	        
//	        
////	        Contare elementi unici con Set e Iterator
//	        
//	        
//	        List<Integer> nums1 = List.of(1,2,2,3,4,4,5);
//	        Set<Integer> unique = new HashSet<>();
//	             
//	        Iterator<Integer> itt = nums1.iterator();
//	        
//	        while(it.hasNext()) unique.add(itt.next());
//	        System.out.println("Unici: " + unique.size()); // 5
//	        
	        
	        // Secondo metodo
	        
	        
	        
	        List<Integer> numeri = Arrays.asList(1, 2, 2, 3, 4);
	        
	        Set<Integer> unici = new HashSet<>();
	        
	        Iterator<Integer> itz = numeri.iterator();
	        int contatore = 0;
	        
	        while(itz.hasNext()) unici.add(itz.next());
	        
	        System.out.println("Gli elementi unici con Set e Iterator sono: " + unici.size());
	        System.out.println("Gli elementi unici sono: " + unici);
	        
	       
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	       
	       
	              
	          }
	      }
	        




