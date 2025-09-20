package com.controlflow;


public class DoWhile {

    public static void main(String[] args) {


//        int number = 10;
//
//        do {
//            System.out.println(number);
//            number = number + 3;
//        } while (number <= 31);
//        
//        int num = 20;
//        
//        while(num < 60) {
//        	System.out.print(num);
//        	num = num +2;
//        }
//        
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);
//    }
//    Scrivi un programma che stampa i numeri da 1 a 10 usando do-while.
    
    int i = 10;
    do {
        System.out.println(i);
        i--;
    } while (i >= 0);


//    Scrivi un programma che somma i numeri da 1 a 100 usando do-while.
    










    int somma = 0;
    int a = 1;

    do {
        somma += a;
        a++;
    } while (a <= 100);

    System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
 


       int tab = 1;
       int numero = 5;

      do {
     System.out.println(tab + " × " + numero + " = " + (tab * numero));
    tab++;
  } while (tab <= 10);
 

//      Scrivi un programma che conta quante cifre ha un numero intero positivo, ad esempio n = 12345 ha 5 cifre.

      
      int n = 12345; 
      int cifre = 0;

      do {
          n /= 10;
          cifre++;
      } while (n > 0);

      System.out.println("Numero delle cifre: " + cifre);
  }
      
      
      
      
      
      
}





    