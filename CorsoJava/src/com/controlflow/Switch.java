package com.controlflow;

public class Switch {

    public static void main(String[] args) {

//
//        int month = 4;
//
//
//        switch (month) {
//
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("April");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//
//            default:
//                System.out.println("default");
//
//                break;
//        }                
//                
////                Usa uno switch per stampare il giorno della settimana dato un numero da 1 a 7.  
//                
//                  int giorno =4;
//                  
//                switch ( giorno) {
//                case 1: 
//                	 System.out.println("Lunedi");
//                	 break;
//                case 2:
//                	 System.out.println("Martedi");
//                	 break;
//                case 3:
//                	 System.out.println("Mercoledi");
//                	 break;
//                case 4:
//                	 System.out.println("Giovedi");
//                	 break;
//                case 5:
//                	 System.out.println("Venerdi");
//                     break;
//                case 6:
//                	System.out.println("Sabato");
//                	break;
//                case 7:
//                	 System.out.println("Domenica");
//                	 break;
//                	 default:
//                		 System.out.println("Giorno non trovato");
//                		 
//
//                
//        
//    }
//                
////                Usa uno switch per stampare la stagione dato un mese (es. 1 = gennaio = inverno).           
//                
//                int mese =4;
//                 switch ( mese) {
//                 case 12: case 1: case 2:
//                    System.out.println(" inverno");
//                    break;
//                 case 3: case 4: case 5:
//                	 System.out.println(" primavera");
//                	 break;
//                 case 6: case 7: case 8:
//                	 System.out.println("estate");
//                	 break;
//                 case 9: case 10: case 11:
//                	 System.out.println("autunno");
//                	 break;
//                	   
//                 }
                
//                 Simula una calcolatrice base con switch (+, -, *, /).
//                
//                int a =20;
//                int b =30;
//                
//                String operazione = "+";
//                double risultato;
//                
//                switch( operazione) {
//                case"+":
//                	risultato = a + b;
//                	System.out.println(" il risulato dell'operazione è (+):" + risultato);
//                	break;
//                case"-":
//                	risultato = a - b;
//                	System.out.println(" il risulato dell'operazione è (-):" + risultato);
//                	break;
//                case"*":
//                	risultato = a * b;
//                	System.out.println(" il risulato dell'operazione è (*):" + risultato);
//                	break;
//                case"/":
//                	if( b != 0) {
//                	risultato = a / b;
//                	System.out.println(" il risulato dell'operazione è (/):" + risultato);
//                	} else {
//                		System.out.println(" il risulato dell'operazione è (/):" + risultato);
                	
    
//    	        String codiceProdotto = "A102"; // Puoi cambiare questo valore per testare altri codici
//
//    	        switch (codiceProdotto) {
//    	            case "A101":
//    	                System.out.println("Nome: Penna Blu");
//    	                System.out.println("Prezzo: €1.20");
//    	                break;
//    	            case "A102":
//    	                System.out.println("Nome: Quaderno A4");
//    	                System.out.println("Prezzo: €2.50");
//    	                break;
//    	            case "A103":
//    	                System.out.println("Nome: Calcolatrice");
//    	                System.out.println("Prezzo: €15.00");
//    	                break;
//    	            default:
//    	                System.out.println("Codice prodotto non valido.");
//    	        }
    	   
    
    int etaUtente =35;
     String tipoBiglietto ="";
     
      if( etaUtente <18) {
    	  tipoBiglietto= "junior";
      } else if ( etaUtente <60) {
    	  tipoBiglietto= "adulto";
      } else {
    	  tipoBiglietto= "senior";
      } 
    	  
      switch (tipoBiglietto) {
      case "junior":
          System.out.println("Il prezzo del biglietto è ridotto");
          break;
      case "adulto":
          System.out.println("Il prezzo del biglietto è 25 euro");
          break;
      case "senior":
          System.out.println("Il prezzo del biglietto è 35 euro");
          break;
      default:
          System.out.println("Tipo di biglietto non valido");
          break;
  }

      
//      Dato un voto in lettere (A, B, C, ecc.), stampa con switch il valore numerico equivalente.
    
    char voto = 'A';
    int punteggio =0;

    switch (voto) {
    
    case 'A': punteggio = 10; break;
    case 'B': punteggio = 8; break;
    case 'C': punteggio = 6; break;
    case 'D': punteggio = 5; break;
    case 'F': punteggio = 3; break;
    default: 
        System.out.println("Voto non valido");
        return; // esce dal metodo se il voto non è valido
}

System.out.println("Il tuo voto corrisponde al punteggio " + punteggio);
  

    
    	  
   }   
    } 
   
     
                
                
                
    

