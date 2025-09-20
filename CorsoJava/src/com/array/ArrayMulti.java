package com.array;
import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in);
		
//        int[][] matrice = {
//                {1, 2, 3},
//                {4, 5, 6}
//            };

         

//            Crea una matrice 2x2 e stampa tutti i suoi elementi.

            
//		   int[][]matrice = {
//				   {2, 5,},
//				   {6, 7,}
//		   };
//      
//		     for ( int i=0; i< matrice.length; i++) {
//		     for ( int j=0; j< matrice.length; j++) {
//		    	 System.out.println( matrice[i][j]);
//		     }
//	
//		     }

	
		     
//		  int[][]matrice = {
//			   {24, 5, 65},
//			    {6, 7, 41},
//			 
//	   };
//   		     for ( int i=0; i< matrice.length; i++) {
//		     for ( int j=0; j< matrice[i].length; j++) {
//		    	 System.out.println( matrice[i][j]);
//	     }
//
//	     }

	
//		Somma tutti gli elementi di una matrice 3x3.
//	
//		        int[][] matrice = {
//		            {1, 2, 3},
//		            {4, 5, 6},
//		            {7, 8, 9}
//		        };
//
//		        int somma = 0;
//		        for (int i = 0; i < matrice.length; i++) {
//		            for (int j = 0; j < matrice[i].length; j++) {
//		                somma += matrice[i][j];
//		            }
//		        }
//
//		        System.out.println("La somma della matrice è " + somma);
//		        
//		        
		        
//		Stampa la seconda riga di una matrice 3x3.     
//		        
		        // Creazione della matrice 3x3
//		        int[][] matrice = {
//		            {1, 2, 3},
//		            {4, 5, 6}, 
//		            {7, 8, 9}
//		        };
//
//		        // Stampa della seconda riga 
//		        System.out.println("Seconda riga della matrice:");
//		        for (int i = 0; i < matrice[1].length; i++) {
//		            System.out.print(matrice[1][i] + " ");
//		        }
//		        
//		        
//		Calcola la somma di ogni riga in una matrice 3x3.
		
		
//		
//		int[][] matrice = {
//	            {1, 2, 3},
//	            {4, 5, 6},
//	            {7, 8, 9}
//	        };
//
//	        for (int i = 0; i < matrice.length; i++) {
//	            int sommaRiga = 0;
//	            for (int j = 0; j < matrice[i].length; j++) {
//	                sommaRiga += matrice[i][j];
//	            }
//	            System.out.println("Somma della riga " + (i + 1) + ": " + sommaRiga);
//		
		
//	        }	
				        
//	    	int[][] matrice = {
//		            {1, 2, 3},
//		            {4, 5, 6},
//		            {7, 8, 9}
//		        };
//
//		        for (int j = 0; j < matrice[0].length; j++) {
//		            int sommaColonna = 0;
//		            for (int i = 0; i < matrice.length; i++) {
//		                sommaColonna += matrice[i][j];
//		            }
//		            System.out.println("Somma della colonna " + (j + 1) + ": " + sommaColonna);
//		        } 
//	
//		: Chiedi all'utente di inserire i valori di una matrice 2x2 e stampala.
		
		
	
		
//		int[][] matrice = new int [2][2];
//        System.out.println("Inserisci valori matrice 2x2: ");
//        for (int i=0; i<2; i++) {
//        for (int j=0; j<2; j++)	{
//        	matrice [i][j]= scanner.nextInt();
//        	
//       }
//     }
//		
//	System.out.println(" Matrice inserita");	
//	  for (int i = 0; i < 2; i++) {
//          for (int j = 0; j < 2; j++) {
//              System.out.print(matrice[i][j] );
//          }
//          System.out.println();
//      }
//
//      scanner.close();
 
//		Somma di tutti gli elementi di una matrice 3x3
//		
		
//		   int[][] matrice = new int[3][3];
//	        int somma = 0;
//
//	        System.out.println("Inserisci gli elementi della matrice 3x3:");
//
//	        // Inserimento degli elementi e calcolo della somma
//	        for (int i = 0; i < 3; i++) {
//	            for (int j = 0; j < 3; j++) {
//	                System.out.print("Elemento [" + i + "][" + j + "]: ");
//	                matrice[i][j] = scanner.nextInt();
//	                somma += matrice[i][j];
//	            }
//	        }
//
//	        System.out.println("La somma di tutti gli elementi è: " + somma);
//	        scanner.close();
//		
//		
		
//		Somma di una colonna scelta
		
//		int [][] matrice = new int [3][3];
//		 for (int i = 0; i < 3; i++) {
//	      for (int j = 0; j < 3; j++) {
//	    	  System.out.print("Elemento [" + i + "][" + j + "]: ");
//	      }	
//		
//	 }	
//		
//		
//	int somma = 0;
//	 for (int i = 0; i < 3; i++) {
//		somma += matrice [i][2] ;
//	 }
//		
//		System.out.println(" La somma della colonna è " + somma);
//		
//		
//		        int[][] matrice = new int[3][3];
//		        int pari = 0;
//
//		        for (int i = 0; i < matrice.length; i++) {
//		            for (int j = 0; j < matrice[i].length; j++) {
//		                System.out.print("Elemento [" + i + "][" + j + "]: ");
//		                matrice[i][j] = scanner.nextInt();
//
//		                if (matrice[i][j] % 2 == 0) {
//		                    pari++;
//		                }
//		            }
//		        }
//
//		        System.out.println("Numeri pari: " + pari);
//		    }
//		
//}
//		
////		           Conta numeri > 10
//		   int count = 0;
//
//	        System.out.println("Quanti numeri vuoi inserire?");
//	        int n = scanner.nextInt();
//
//	        System.out.println("Inserisci " + n + " numeri:");
//	        for (int i = 0; i < n; i++) {
//	            int numero = scanner.nextInt();
//	            if (numero > 10) {
//	                count++;
//	            }
//	        }
//
//	        System.out.println("Hai inserito " + count + " numeri maggiori di 10.");
//	       
//	    }
//	}
//	 	     
    
 
		        
		        
		        
		        
		        
		        
		        
