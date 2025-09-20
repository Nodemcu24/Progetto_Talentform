package com.array;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

//		int[] array = new int[5];
//
//		array[0] = 10;
//		array[1] = 20;
//		array[2] = 30;
//		array[3] = 40;
//		array[4] = 50;
//
//		System.out.println(array[2]);
//		System.out.println("-----------------");
//
//		int[] arr = { 1, 2, 3, 4, 5 };
//
//		for (int in : arr) {
//
//			System.out.println(in);
//
//		}
//   String[] nomi = new String[5];
//   
//   nomi[0] ="Alberto";
//   nomi[1] ="Federica";   
//   nomi[2] ="Giuseppe";   
//   nomi[3] ="Anna";   
//   nomi[4] ="Lucia";   
//   
//   for( int i=0; i< nomi.length; i++) {
//	   
//	   System.out.println(nomi[i]);
//   }
//   
//    int[] age = { 12, 25, 30, 45, 16};
//     System.out.println(age[2]);
//     
//     for(int i : age) {
//    	System.out.println(i); 
//     }
//   
//		Crea un array di interi e stampane ogni elemento
//		
//		int [] numeri = { 20, 25, 31, 40, 60};
//		 for(int i=0; i< numeri.length; i++) {
//		 System.out.println(numeri[i]);
//		 }
		 
//		int[] numeri = {3, 5, 6, 8};
//		int somma = 0;
//
//		for (int i = 0; i < numeri.length; i++) {
//		    somma += numeri[i];
//		}
//
//		System.out.println( somma);
		
//		  int[] array = {1, 3, 7, 9};
//	        int max = array[0];
//
//	        for (int i = 1; i < array.length; i++) {
//	            if (array[i] > max) {
//	                max = array[i];
//	            }
//	        }
//
//	        System.out.println( max);
//		
//		  int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//	        int contaPari = 0;
//
//	        for (int numero : numeri) {
//	            if (numero % 2 == 0) {
//	                contaPari++;
//	            }
//	        }
//
//	        System.out.println( contaPari);
		
//		Stampa gli elementi di un array in ordine inverso
		
//		 int[] numeri = {10, 20, 30, 40, 50};
//
//	        System.out.println("Elementi in ordine inverso:");
//	        for (int i = numeri.length - 1; i >= 0; i--) {
//	            System.out.println(numeri[i]);
//	        }
//		Controlla se un numero dato (es. 10) è presente nell’array.
		
//		 int[] numeri = {10, 20, 30, 40, 50};
//		 int daCercare = 10; 
//
//	        boolean trovato = false;
//
//	        for (int numero : numeri) {
//	            if (numero == daCercare) {
//	                trovato = true;
//	                break;
//	            }
//	        }
//		
//	        if (trovato) {
//	            System.out.println("Il numero " + daCercare + " è presente nell'array.");
//	        } else {
//	            System.out.println("Il numero " + daCercare + " NON è presente nell'array.");
//	        }
//		
//		Conta quanti elementi nell’array sono maggiori di 10.
		
//		int[] num = { 5, 6, 7, 25, 14};
//		int count = 0;
//		for (int i : num) {
//		if ( i>10) {
//			count ++;
//		}
//	}
//		System.out.println(count);
		
//		  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//	        System.out.println("Elementi dispari nell'array:");
//	        for (int numero : array) {
//	            if (numero % 2 != 0) {
//	                System.out.println(numero);
//	            }
//	        }
	
//	        int[] arr = {1, 3, 5, 7 }; 
//
//	        boolean ordinato = true;
//
//	        for (int i = 0; i < arr.length - 1; i++) {
//	            if (arr[i] > arr[i + 1]) {
//	                ordinato = false;
//	                break;
//	            }
//	        }
//
//	        if (ordinato) {
//	            System.out.println("L'array è ordinato in ordine crescente.");
//	        } else {
//	            System.out.println("L'array NON è ordinato in ordine crescente.");
//	        } 
		
//	        Calcola la somma dei numeri pari e quella dei numeri dispari separatamente.  
	        
//	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//	         int somma = 0;
//	         int sum =0;
//	         for(int i=0; i< array.length; i++) {
//	        	if(array[i] % 2 ==0) {
//	        	somma +=array[i];
//	        	} else {
//	        		sum += array[i];
//	        		  	
//	        	}
//	         }
//	 System.out.println(" la somma dei numeri pari è" + somma) ;      
//	 System.out.println(" la somma dei numeri dispari è" + sum) ;      
//        
//	 
////	 Dato un array, crea un nuovo array con solo i numeri positivi.
//	
//	 int[] originali = {-2, 4, -1, 3, 0, 7};
//     int[] positivi = new int[originali.length];
//     int j = 0;
//
//     for (int i = 0; i < originali.length; i++) {
//         if (originali[i] > 0) {
//             positivi[j] = originali[i];
//             j++;
//		 }
//	 }
//     for (int i = 0; i < j; i++) {
//      System.out.println(positivi[i] + " ");
//     } 
//	 
////     Conta quante volte compare il numero 3 in un array.
//	 
//    
//    	        int[] numeri = {1, 3, 5, 3, 7, 3, 9, 3, 2};
//    	        int contatore = 0;
//
//    	        for (int numero : numeri) {
//    	            if (numero == 3) {
//    	                contatore++;
//    	            }
//    	        }
//
//    	        System.out.println("Il numero 3 compare " + contatore + " volte nell'array.");
    	    
	
//    	        Scambia tra loro il primo e l’ultimo elemento di un array.
    	
//    	        int[] arr = {10, 20, 30, 40, 50};
//    	        int temp = arr[0];
//    	        arr[0] = arr[arr.length - 1];
//    	        arr[arr.length - 1] = temp;
//
//    	        for (int i = 0; i < arr.length; i++) {
//    	            System.out.print(arr[i] + " ");
//    	        }
     
//    	      Dato un array, stampa i numeri duplicati presenti.
//    	        
//    	        int[] array = {10, 20, 20, 40, 50};
//    	        for (int i = 0; i < array.length; i++) {
//    	            for (int j = i + 1; j < array.length; j++) {
//    	                if (array[i] == array[j]) {
//    	                    System.out.println(array[i]);
//    	                    break;
//    	                }
//    	  
    	             
//		Conta quante volte due elementi consecutivi sono uguali.           
    	                		
//    	                	
//		int[] numeri = {5, 3, 3, 7, 7, 7, 2, 2, 9, 1};  
//        int conteggio = 0;
//
//        for (int i = 0; i < numeri.length - 1; i++) {
//            if (numeri[i] == numeri[i + 1]) {
//                conteggio++;
//            }
//        }
//
//        System.out.println("Numero di coppie consecutive uguali: " + conteggio);   
//    	                
//    	                
//		Inserisci 5 numeri interi e stampali con Scanner        	 
//    	    Scanner scanner = new Scanner ( System.in)  ;   
//    	        
//    	        int[] num= new int[5];
//    	        for( int i=0; i< num.length; i++) {
//    	        	System.out.println("Inserisci un numero");
//    	        	num[i]= scanner.nextInt();
//    	   
//    	        	
//    	        }
//    	        
//    	        System.out.println("numeri inseriti ");
//    	        for (int n: num) {
//    	        	System.out.println(n);
//    	        	
    	        	
    	        	
//    	        }
    	        
	   
//    	        String[] colori = new String [5];
//    	        Scanner scanner = new Scanner( System.in);  
//    
//    	        for( int i=0; i< colori.length; i++) {
//    	        	System.out.println("Inserisci un colore");
//    	        	colori[i]= scanner.nextLine();
//    	        }
//    	      System.out.println("colori inseriti");
//    	      for (String c: colori) {
//  	        	System.out.println(c);
//    	      
//    	      }	        
//    	   
//		Calcola la somma degli elementi
		
//		Scanner scanner = new Scanner( System.in);
//		 int[] array = new int [5];
//		 
//		
//		 int somma = 0;
//		  for( int i=0; i< array.length; i++) {
//			  System.out.println("Inserisci i valori");
//			 array[i]= scanner.nextInt();
//			 somma += array[i];
//		  }
//		  System.out.println("La somma degli elementi è: " + somma);
//	
//	
////		  Dato un array trova il massimo valore
//	
//			Scanner scanner = new Scanner( System.in);
//			 int[] numeri = new int [5];
//			 int massimoValore =0;
//			  for ( int i=0; i< numeri.length; i++) {
//				System.out.println("Inserisci un numero");
//				numeri[i] = scanner.nextInt();
//				if( numeri[i] > massimoValore) {
//					massimoValore = numeri[i];
//				}
				  
//				  
//			  }
//			 
//	 System.out.println(" il valore max dell array è " + massimoValore);
//	
	

///	  Dato un array trova il minimo valore

//		Scanner scanner = new Scanner( System.in);
//		 int[] numeri = new int [5];
//		 System.out.print("Inserisci un numero: ");
//	        numeri[0] = scanner.nextInt();
//		 int minimoValore = numeri[0];
//				 
//		  for ( int i=1; i< numeri.length; i++) {
//		System.out.println("Inserisci un numero");
//			numeri[i] = scanner.nextInt();
//			if( numeri[i] < minimoValore) {
//			minimoValore = numeri[i];
//			}

			  
//		  }
//		 
//System.out.println(" il valore min dell array è " + minimoValore);
	
    //Calcola la media 
//	
//		  Scanner scanner = new Scanner(System.in);
//	        int[] numeri = new int[5];
//	        int somma = 0;
//
//	        System.out.println("Inserisci i numeri interi");
//
//	        for (int i = 0; i < numeri.length; i++) {
//	            System.out.print("Numero " + (i + 1) + ": ");
//	            numeri[i] = scanner.nextInt();
//	            somma += numeri[i];
//	        }
//
//	        double media = (double) somma / numeri.length;
//	        System.out.println("La media è: " + media);
		
//		Copia l’array in un nuovo array
		
		
//		Scanner scanner = new Scanner(System.in);
//        int[] original = new int[5];
//
//        for (int i = 0; i < original.length; i++) {
//            System.out.print("Inserisci un numero: ");
//            original[i] = scanner.nextInt();
//        }
//
//        int[] copia = new int[5];
//        for (int i = 0; i < original.length; i++) {
//            copia[i] = original[i];
//        }
//
//        System.out.println("Array copiato:");
//        for (int num : copia) {
//            System.out.println(num);
//	}
//
//  
//		Inserisci 5 nomi e stampali
//        
//	    String[] nomi = new String [5];
//        Scanner scanner = new Scanner( System.in);  
//
//        for( int i=0; i< nomi.length; i++) {
//        	System.out.println("Inserisci un nome");
//        	nomi[i]= scanner.nextLine();
//        }
//      System.out.println("colori inseriti");
//      for (String n: nomi) {
//    	System.out.println(n);
//     
//	}
		
//		Scambia primo e ultimo elemento
		
//		   Scanner scanner = new Scanner(System.in);
//
//	        int[] numeri = new int[5];
//
//	       
//	        for (int i = 0; i < numeri.length; i++) {
//	            System.out.print("Inserisci un numero: ");
//	            numeri[i] = scanner.nextInt();
//	        }
//
//	        // Scambio del primo e dell'ultimo elemento
//	        int temp = numeri[0];
//	        numeri[0] = numeri[numeri.length - 1];
//	        numeri[numeri.length - 1] = temp;
//
//	        // Stampa dell'array modificato
//	        System.out.println("Array dopo lo scambio:");
//	        for (int num : numeri) {
//	            System.out.println(num);
//		
//	        }		
//		
//		Conta le occorrenze di un numero
		
		  Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Quanti numeri vuoi inserire? ");
	        int dimensione = scanner.nextInt();

	        int[] numeri = new int[dimensione];

	        // Inserisci i numeri
	        System.out.println("Inserisci " + dimensione + " numeri:");
	        for (int i = 0; i < dimensione; i++) {
	            numeri[i] = scanner.nextInt();
	        }

	        // Chiedi il numero da contare
	        System.out.print("Quale numero vuoi contare? ");
	        int numeroDaContare = scanner.nextInt();

	        // Conta le occorrenze
	        int conteggio = 0;
	        for (int numero : numeri) {
	            if (numero == numeroDaContare) {
	                conteggio++;
	            }
	        }

	        System.out.println("Il numero " + numeroDaContare + " appare " + conteggio + " volte.");
		
		
		
		
		
		
		
		
		
		
		
		
		
 }
}
