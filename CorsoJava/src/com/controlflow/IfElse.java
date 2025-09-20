package com.controlflow;

import java.time.LocalDate;

public class IfElse {


    public static void main(String[] args) {

        int a = 50;
        int b = 30;
        int c = 10;
        int s = 20;
        boolean m = a < b ? true : false;

        if (a < b && c == s) {

            System.out.println("OK");
            String nome = LocalDate.now().toString();

        } else if (a > b || s < c) {

            System.out.println("Failed");

        } else if (c > s) {

            System.out.println("OK");
        } else if (s > a) {

            System.out.println("OK");
        }
        
        
        
          if (a>b&&c<s) {
        	  
        	    System.out.println(true);
        	  
          } else {
        	  
        	  
        	    System.out.println(false);
        	  
          }
          
          
          int x = 35;
          int v = 22;
          int y = 10;
          int f = 15;
          
          
          
          if (x<v||y>f) {
        	  
        	  System.out.println("OK");
        	  
        	  
          } else {
        	  
        	  System.out.println("ERRATO");
        	  
        	  
        	   
        	  
          }
          
         int numero1 =8;
         if( numero1 % 2== 0) {
        	 System.out.println("il numero è pari");
        	 } else {
        		 System.out.println("il numero è dispari");
        	 }
//         Controlla se un utente è maggiorenne (>=18 anni)
         
         int eta = 17;
         if (eta <18) {
        	 System.out.println("La persona è minorenne");
         }else {
        		 System.out.println("La persona è maggiorenne");
        	 }
        
        	        char lettera = 'e'; // Puoi cambiare questo carattere per testare altri

        	        // Convertiamo il carattere in minuscolo per semplificare il confronto
        	        c = Character.toLowerCase(c);

        	        if (Character.isLetter(c)) {
        	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        	                System.out.println(c + " è una vocale.");
        	            } else {
        	                System.out.println(c + " è una consonante.");
        	            }
        	        } else {
        	            System.out.println(c + " non è una lettera.");
        	        
        int voto = 8;
        if ( voto >=6) {
        	System.out.println("Lo studente è promosso");
        } else { 
        	System.out.println ("Lo studente è bocciato");
        	       }
        	 
         int g  = 32;
         int h  = 25;
          if( g > h) {
        	  System.out.println(" il numero g è maggiore di h");
          } else if ( g==h) {
        	  System.out.println(" il numero g è uguale ad h");
          }else {
        	  System.out.println(" il numero g è minore di h");
          }
        	        
        	    double numero = 6.5;
        	    if ( numero >0) {
        	    	System.out.println(" Il numero è positivo");
        	    } else if ( numero ==0) {
        	    	System.out.println(" il numero è uguale a 0");
        	    }else {
        	    	System.out.println(" il numero è negativo");
        	    }
        	        
        	        
        	        
        	        
        	        }
        	        
        	        
        	    }
        	

    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
         
         
          
          
          
          
          
          
        
        

    




