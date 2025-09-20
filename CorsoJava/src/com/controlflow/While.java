package com.controlflow;

public class While {

    public static void main(String[] args) { 

//
//    int number = 0;
//    int numbers = 30;
//
//while(number<=numbers) {
//
//        System.out.println(number);
//        number = number+2;
//
//    }
//
//   int t = 50;
//   int z = 10;
//    while (t>z) {
//    	System.out.println(t);
//    	t= t-2;
//    }
//		   
////    Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando while.
//            int i = 1;
//            int somma = 0;
//
//            while (i <= 100) {
//                somma += i;
//                i++;
//            }
//
//            System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
//          
////           Scrivi un programma che stampa tutti i numeri pari da 2 a 20 usando while.  
//           
//            int numero = 2;
//            while (numero <= 20) {
//                System.out.println(numero);
//                numero += 2;
//            }
//    
////            Scrivi un programma che calcola quante cifre ha un numero intero positivo (es. numero = 3456 ha 4 cifre).
//    
//    
//    
//        
//                    int num = 3456;
//                    int cifre = 0;
//
//                    while (num > 0) {
//                        num /= 10;
//                        cifre++;
//                    }
//
//                    System.out.println("Il numero intero ha " + cifre);
//               
//    
////                    Scrivi un programma che calcola la somma delle cifre di un numero intero positivo.
////                    Esempio: 123 → 1 + 2 + 3 = 6.
//    
//
//                    int sum = 0;
//                    while (numero > 0) {
//                        int cifra = numero % 10;  // Prende l'ultima cifra
//                        sum += cifra;           // Aggiunge la cifra alla somma
//                        numero /= 10;             // Rimuove l'ultima cifra
//                    }
//
//                    System.out.println("La somma delle cifre è: " + sum);
//                }
//   
    
    
            

        int Num = 1234;
        int invertito = 0;

       while (Num > 0) {
           int cifra = Num % 10;
           invertito = invertito * 10 + cifra;
           Num /= 10;
       }

       System.out.println("Numero invertito: " + invertito);
   }
}
   

   



