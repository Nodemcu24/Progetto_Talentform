package com.oop.classes.wrapper;

public class ClassWrapper {

	public static void main(String[] args) {
	
		// BOXING 
		
		
		Integer number = new Integer(5);
		System.out.println(number);
		
		
		Double db= new Double(25.30d);
		
		
		// AUTOBOXING 
		
		Integer numbers = 35;
		
		
		
		System.out.println(numbers);
		Double dbl = 22.5d;
		
		// UNBOXING 
		
		
		
		int nb = number;

		
		System.out.println(nb);
		
		double bl= db;
		System.out.println(bl);
		
		
	     Double num = 5.5;
		  double n = num;
		
		System.out.println(n);
		

//		
//		String str = "123";
//		 
//	     int m = Integer.parseInt(str);
//		
//		System.out.println(m);
//		
//		
//		String str1 = "45";
//		Integer k = Integer.valueOf(str1);
//		System.out.println(k);
//		
		
//		Crea due oggetti Integer con valore 1000 e verifica se sono uguali usando == e .equals().
		
		 Integer a1 = Integer.valueOf(1000);
		 Integer a2 = Integer.valueOf(1000);
		 
		
	     System.out.println("a1.equals(a2): " + a1.equals(a2));
	     
	     
//	             Converte la stringa "true" in un valore boolean.
	 
	    	        String str = "true";
	    	        boolean value = Boolean.parseBoolean(str);

	    	        System.out.println("Il valore booleano è: " + value);
	    	

	     
//	    	        Converti la stringa "127" in un oggetto Byte.
	     
	      String str2 = "127";
	      byte bt = Byte.parseByte(str2);
	      System.out.println(bt);
	     
	     
	         
	      
//	      Verifica se il carattere '9' è una cifra numerica.
	      
	     
	      char a ='9';
	      boolean b = Character.isDigit(a);
	      
	     System.out.println(b);
	     
	     
	     
//	     Converti la stringa "3.14" in un valore float.
	     
	     String e4_a =" 3.14";
	     Float e4_b = Float.valueOf(e4_a);
	     
	     System.out.println(e4_b);
	     
//	     Confronta due valori Double usando Double.compare.
	     
	     
	     Double valore1 = Double.valueOf(3.14);
	        Double valore2 = Double.valueOf(2.71);

	      
	        int risultato = Double.compare(valore1, valore2);

	        
	        if (risultato > 0) {
	            System.out.println(valore1 + " è maggiore di " + valore2);
	        } else if (risultato < 0) {
	            System.out.println(valore1 + " è minore di " + valore2);
	        } else {
	            System.out.println(valore1 + " è uguale a " + valore2);
	        }
	     
	     
	        
//	        Converte la stringa "12345" in un oggetto Short.
	        
	        String str3 = "12345";
	        Short h = Short.valueOf(str3);
	        System.out.println(h);
	        
//	        Converti un oggetto Integer in una stringa tramite concatenazione.
	     
	        Integer s =10;
	        String str4 = "" + s;
	        
	        System.out.println(str4);
	        
//	        Crea un array di oggetti Integer con i valori da 1 a 5 e itera con un foreach
	        
	     
	        Integer[] numeri = {1, 2, 3, 4, 5};
	        
	        for (Integer numero : numeri) {
	            System.out.println( + numero);
	        }
	        
	        
	    }
		
	}


