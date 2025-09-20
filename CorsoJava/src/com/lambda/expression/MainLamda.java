package com.lambda.expression;
import java.util.*;
import java.util.function.BiFunction ;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.function.BiConsumer;




public class MainLamda {
private static int count;
private static HashMap<String, Integer> map;

//
	public static void main(String[] args) {
//		
//		List<String> names= List.of("Anna", "Luca", "Marta");
//		names.forEach(n -> System.out.println(n));
//	

//		Lista di nomi
//		
//		List<Integer> interi = List.of(1,2,3,4,5);
//		interi.forEach(n -> System.out.println(n) );
//		
//		  //Lista di città
//		
//		List<String> citta = List.of("Lucca", "Roma", "Bologna");
//		citta.forEach(c -> System.out.println(c));
//		
//		
//		// Somma di due numeri con Bifuction
//		
//	       BiFunction<Integer, Integer, Integer> somma = (a, b) -> a + b;
//	        
//	        System.out.println("La somma e': " + somma.apply(15, 25));
//	    
//		
////	        Verifica se un numero è pari con Predicate
//	        
//	        Predicate<Integer> check = (x) -> x % 2== 0;
//	        System.out.println(check.test(6));
//	        System.out.println(check.test(5));
	        
//	        
////	        Verifica se un numero è dispari con Predicate
//		
//	        
//	        Predicate<Integer> check = (x) -> x % 2!= 0;
//	        System.out.println(check.test(6));
//	        System.out.println(check.test(5));
//		
////	        Convertire stringhe in maiuscolo con Function
//	        
//	        Function<String, String> converti = (a) -> a.toUpperCase();
//	        System.out.println(converti.apply("ciao"));
//	        
////	        Stampare messaggio usando Consumer
//	        
//	        Consumer<String> messaggio = b -> System.out.println(b);
//	        messaggio.accept("Buongiorno");
//	    
////	        Fornire valori con Supplier
//	        
//		Supplier<Double> f = () -> Math.random();
//	      System.out.println(f.get());  
//	      
////	      Filtrare lista con stream e lambda
//	      
//	      List<Integer> lista = new ArrayList(List.of(1,2,3));
//	      lista
//	      .stream().filter(a -> a>1)                                         
//	      .forEach(elementoFiltrato -> System.out.println(elementoFiltrato));
//	      
	      
////	      Incrementare valori in una lista con map
//	      
//	      
//	      List<Integer> numeri = new ArrayList( List.of(1,2,3));
//	      List<Integer> numeriPlus = numeri.stream().map(n ->   n+1).collect(Collectors.toList());
//	      
//	      System.out.println(numeriPlus);
//	      
////	      Stampare elementi con forEach e lambda
////	      
//	      
//	      List<String> nomi = List.of("Andrea", "Fabio", "Luca");
//	      nomi.forEach( b -> System.out.println(b));
//	      
////	      Ordinare lista di stringhe con lambda
//	      
//	      List<String> names = new ArrayList<>(Arrays.asList("Nicola", "Giulia", "Andrea"));
//	      
//	     names.sort((a,b) -> a.compareTo(b)) ;
//	      System.out.println(names);
//	      
//	      // Moltiplicare tutti gli elementi con Map
//	      
//	      List<Integer> numeri1 = Arrays.asList(1,2,3,4);
//	      
//	      List<Integer> numeriMoltiplicati = numeri1.stream().map(n -> n * 2).toList();
//          
//          System.out.println("I numeri di partenza sono: " + numeri1);
//          System.out.println("I numeri moltiplicati sono: " + numeriMoltiplicati);
//      
//          Filtrare parole lunghe
          
          List<String> parole = Arrays.asList("Ciao","Filtrare", " Prova");
          
           List<String> paroleFiltrate = parole.stream().filter( z -> z.length()>2).collect(Collectors.toList());
	      System.out.println(paroleFiltrate);
	      
	      
//	      Usare BiConsumer per stampare chiave e valore
	      
	      
	      HashMap<String, Integer> mappa = new HashMap<>(Map.of("Anna", 20, "Paolo", 31, "Francesca",15));
	      BiConsumer<String, Integer> stampa = (x, y) -> System.out.println("Chiave " + x + ", valore " + y);
	      mappa.forEach(stampa);
	      
//	      Contare elementi con filter
	      
	      List<Integer> lista1 = new ArrayList<>(List.of(1,2,3,4));
	     
		  lista1.stream().filter( a -> a != null) .forEach(b ->  count++);
		  System.out.println(count);
	      
	      
	     
	      
////	      Somma di numeri con reduce
//	      
//	      
//	      
//	      List<Integer> nums = List.of(1,2,3,4);
//	   // reduce parte da 0 e somma ogni elemento della lista
//	        int sum = nums.stream().reduce(0, (a,b) -> a+b);
//	        System.out.println(sum); 
	      
	      
//	        Trovare il massimo con lambda
	        
	        List<Integer> num = Arrays.asList(1,2,3,4,5);
	         int max = num.stream().max((a,b)-> a.compareTo(b)).get();
	        
	         System.out.println(max);
	         
	         
//	         Verificare se almeno un elemento soddisfa condizione
	         
	         List<Integer> num1 = Arrays.asList(1,2,3,4,5);
	          boolean verifica = num1.stream().anyMatch( (a) -> a %2 ==0);
	         
	         System.out.println(verifica);
	         

//	         Creare un Supplier di valori casuali
	         
	         Supplier<Double> RandomSupplier = () -> Math.random();
	         
	         System.out.println(RandomSupplier.get());
	         System.out.println(RandomSupplier.get());
	         System.out.println(RandomSupplier.get());
//	         
////	         Concatenare stringhe con reduce
//	         
//	         List<String> nomi1 = List.of("Andrea",   "Fabio"  ,"Paolo");
//	         
//	         String frase =  nomi1.stream().reduce("", ( a, b) -> a+"" +b.trim());
//	       
//	         System.out.println(frase);
//	         
//	         
//	         Filtrare numeri dispari e sommarli
	         
	         List<Integer> n = new ArrayList<>( List.of( 1,2,5,6,7,8));
	         
	         int sum = n.stream().filter( z ->  z%2 !=0 ).mapToInt(Integer::intValue).sum();
	         
	        System.out.println( sum);
	         
	        
////	        Ottenere lista di stringhe maiuscole
//	        
//	        
        ArrayList<String> parole1 =  new ArrayList<>(List.of("ciao", "mondo", "java"));
	        
	        List<String> upperCase = parole1.stream().map(String:: toUpperCase).collect(Collectors.toList());
	         System.out.println(upperCase);
	        
	        
//	        		Contare numeri maggiori di 10	
	        		
	        		
	    ArrayList<Integer>  numeri3 = new ArrayList<>(List.of(6,8,14,11,5,10,20 )) ;  		
	        		
	       	long count = numeri3.stream().filter( s ->  s >10    ).count();	
	        		
	        System.out.println(count);		
	        		
//	        Filtrare parole lunghe e ordinarle
	        		
	        List<String> order = parole.stream().filter(word -> word.length() > 3).sorted().collect(Collectors.toList());
	        
	        System.out.println(order);
	    
//	        Trova il numero massimo usando reduce
	        
	        
	        
	        List<Integer> numA = List.of(10, 20, 30, 40, 50);
	        int massimo = numA.stream().reduce(Integer::max).get();
	        System.out.println(massimo);
	        
//	        Rimuovi i duplicati e ordinali
	        
	        ArrayList<Integer> r = new ArrayList<>(List.of(20,3,60,3,1));
	        ArrayList<Integer> v = r.stream().distinct().sorted().collect(Collectors.toCollection(ArrayList::new));
	        
	        System.out.println(v);
	        
//	        Filtrare numeri pari e moltiplicarli per 2
	        
	        List<Integer> numeri = List.of(1,2,3,4); 
	        numeri                                   
	            .stream()                            
	            .filter(a -> a % 2 == 0)             
	            .map(b -> b*2)                       
	            .forEach(c -> System.out.println(c));
	        
	        
//	        Creare mappa parola -> lunghezza
	        
	        HashMap<String, Integer> map = new HashMap<>();           
	        String str1 = new String("prova");                        
	        map.put(str1, str1.length());                             
	        String str2 = new String(" provaaaa");                    
	        map.put(str2, str2.length());                             
	        System.out.println(map);          
	        
	        
	        
            
//            //Concatenare parole usando reduce 
//	        
//            List<String> parole2 = new ArrayList<>();                  
//            for (Map.Entry<String, Integer> entry : map.entrySet()) { 
//            String parola = entry.getKey();                       
//            parole.add(parola);                                   
//            }                                                         
//            
//           System.out.println(parole2);                               
//           String frase = parole                                     
//           .stream()                                 
//           .reduce("", (m,w) -> m.concat(w));        
//            System.out.println(frase);
//	        
	        
	        
//	        Ordinare lista di stringhe per lunghezza
	        List<String> words = new ArrayList<>(List.of("apple","cat","banana","dog"));
	        words.sort((a,b) -> a.length() - b.length());
	        System.out.println(words);
	        
//	        Trovare la parola più lunga
	        
	        List<String> words1 = List.of("Java","Stream","Lambda");
	        String longest = words1.stream().max((a,b) -> a.length() - b.length()).get();
	        System.out.println(longest); 
	        
//	        Verificare se tutti i numeri sono positivi
	        
	        List<Integer> numbers = Arrays.asList(2,5,6,12);
	        boolean numeriPositivi = numbers.stream().allMatch(p -> p >0);
	        
	        System.out.println("I numeri sono tutti positivi? " + numeriPositivi);
	    
//	        
////	        Verificare se almeno un numero è multiplo di 5
//	        
//	        List<Integer> numbers1 = Arrays.asList(2,5,6,12);
//	        
//	        boolean check2 = numbers1.stream().anyMatch(j -> j% 5==0);
//	        System.out.println(check2);
	        
////	        Stampare tutti i numeri con forEach e lambda
//	        
//	        List<Integer> numbers2 = Arrays.asList(2,5,6,12);
//	        numbers2.forEach(k -> System.out.println(k));
	        
//	         Trovare la somma usando reduce
	        
	        List<Integer> numbers3 = Arrays.asList(2,5,6,12);
	        int somma = numbers3.stream()
                    .reduce(0, (a, b) -> a + b);

              System.out.println("Somma: " + somma);
	        
              
//              Filtrare stringhe che contengono "a"
              
              List<String> lista20 = new ArrayList<>(List.of("Ciao", "questa", "mattina", "ho", "poca", "voglia"));
              List<String> listaFilter = lista20.stream().filter(d -> d.contains("a")).collect(Collectors.toList());
              
              System.out.println(listaFilter);
              
//              Convertire lista di numeri in lista di stringhe
              
              
              List<Integer> num5 = List.of(1,-2,3,4,25);
              List<String> convert =num5.stream().map(x -> " "+ x ).collect(Collectors.toList());
              System.out.println(convert);
              
              
//              Ordinare mappe per valore
              
              HashMap<String, Integer> map1 = new HashMap<>(Map.of("A", 3, "B", 2, "C", 1));
              map1.entrySet().stream().sorted(Map.Entry.comparingByValue())
                      .forEach(a -> System.out.println("CHIAVE: " + a.getKey() + " VALORE: " + a.getValue()));
              
             
//              Ottenere lista di quadrati dei numeri
              
              List<Integer> numer = List.of(1,2,3,4,25);
              List<Integer> nM = numer.stream().map( g -> g*g).collect(Collectors.toList());
              System.out.println(numer);
              System.out.println(nM);
              
//              Raggruppare parole per lunghezza
              
              List<String> parole16 = List.of("d","fg","sg","zzz");
              
              Map<Integer,List<String>>grouped = parole16.stream().collect(Collectors.groupingBy(String:: length));
              System.out.println(grouped);
              
	}

}
