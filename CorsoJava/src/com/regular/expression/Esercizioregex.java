package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizioregex {

	public static void main(String[] args) {
//		
////		Scrivi un'espressione regolare per verificare se una stringa contiene solo lettere (maiuscole e minuscole).
//
//		 String nome = "Paolo";
//		 boolean match = nome.matches("^[a-zA-Z]+$");
//		 System.out.println(match);
//		
//		 Controlla se una stringa contiene solo cifre numeriche.
		 
		 String nome1 = "123";
		 boolean b = nome1.matches("^\\d+$");
		 System.out.println(b);
		 
//		 Verifica se una stringa è un'email valida del tipo nome@dominio.com.
		 
		 String email = " luca@outlook.com ";
		 boolean contr = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
		 System.out.println(contr);
		 
////		 Verifica se un numero di telefono inizia con +39 e contiene 9-10 cifre.
//		 
//		 String telefono = "+3955663481";
//		 boolean.ch = telefono.matches("^\\+39\\d{9,10}$");
//		 System.out.println(ch);
		
		 
//		 Verifica se una password contiene almeno una maiuscola, una minuscola, un numero e almeno 8 caratteri.
//		 
		 
		 String password = "Landeron90";
		 boolean h = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
		 System.out.println(h);
		 
////		 Estrai tutte le parole di una stringa
//		 
//		 String parole = "prima seconda terza";
//		 Matcher matcher = Pattern.compile("\\b\\w+\\b").matcher(parole);
//		 while(matcher.find())                                    
//		     System.out.println(matcher.group());
//		 
//		 Sostituisci tutte le cifre in una stringa con l'asterisco *.
		 
		 String Input = "123455ABc";
		   String output = Input.replaceAll("\\d", "*");
	        System.out.println(output);
		 
//	        Estrai tutti gli indirizzi email da un testo.
		 
		    String testo = "Contatti: a@b.com, info@site.it"; 
	        
	        Matcher matcher1 = Pattern.compile("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}").matcher(testo);
	      
	        while (matcher1.find()){
	        	
	        	System.out.println(matcher1.group());
	        }
	        
//	        Verifica se una stringa è un CAP italiano valido (5 cifre).
	        
	        String cap = "16010";
	        boolean ver = cap.matches("\\d{5}");
	        System.out.println(ver);
	        
	        
//	        Conta il numero di parole in una stringa.
	        
	        String frase = "Regex è molto potente";
	        
	        Matcher m = Pattern.compile("\\b\\w+\\b").matcher(frase);
	        
	         int c = 0;
	        while( m.find()) {
	        	c++;
	        	System.out.println(c);
	        }
	        
//	        Controlla se una stringa è un codice fiscale italiano (16 caratteri alfanumerici).
	        
	        
	        String codice = "BMBFNC90D24D969Z";
	        boolean ck = codice.matches("^[A-Z0-9]{16}$");
	        System.out.println(ck);
	        
	        
//	        Estrai date in formato gg/mm/aaaa
	        
	        String data = " 18/09/2025";
	        
	        Matcher matcher = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(data);
	        
	        while( matcher.find()) {
	        	
	        	System.out.println(matcher.group());
	        }
	        
	        
	        
	        
	        
	        
	        
//	        Controlla se una stringa è una targa italiana del tipo AB123CD.
	        
	        
	        
	     
	        
	        
	        String targa = "AB123CD";
	        boolean ve = targa.matches("^[A-Z]{2}\\d{3}[A-Z]{2}$");
	        System.out.println(ve);
	        
	        
	        
	        
//	        Rimuovi spazi doppi o multipli in una frase, lasciando solo uno spazio tra le parole.
	        
	        String frase1 = "Questo    è   un    test";
	        String pulita = frase1.replaceAll("\\s+", " ");
	        System.out.println(pulita); 
	        
//	        Dividi una stringa usando virgole, punti e punti e virgola come separatori.
	        
	        String parole = "parola1, parola2,parola3";
	        String[] paroleA = parole.split("[,;.]");
	        for ( String parola : paroleA) {
	        	
	        	  System.out.println(parole);
	        }
	        
//	        Verificare se una stringa è un’email valida con lettere, numeri, underscore e dominio con minimo 2 caratteri.
		
	        
	        String email1 = " questa email123@gmail.com";
	        
	        boolean j = email1.matches("^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$");
	        System.out.println(j);
	        
	        
//	        Valida un numero di telefono internazionali
//	        Formato: +39 345 123 4567 o +1-202-555-0173
	        
	        String number = "+1-202-555-0173";
	        boolean x = number.matches("^\\+\\d{1,3}[- ]?\\d{1,4}[- ]?\\d{3}[- ]?\\d{4}$");
	        System.out.println(x);
	        
	        
//	        Estrarre tutti gli hashtag da un testo
	        
	        String test = "Test#java #regex #esercizio";
	        Matcher mat = Pattern.compile("#\\w+").matcher(test);
	        
	        while(mat.find()) {
	        	System.out.println(mat.group());
	        	
	        }
	        
//	        Verifica se il codice fiscale è italiano
	        
	        String CF = "RSSMRA85M01H501Z";
	        boolean w = CF.matches("^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$");
	        
	        System.out.println(w);
	        
//	        Validare una password sicura
//	        Regole: Minimo 8 caratteri, almeno una maiuscola, una minuscola, un numero e un simbolo.
//	        
	        
	        String pasw = "Sampdoria9!";
	        
	        boolean p = pasw.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$");
	        System.out.println(p);
//	        
//	        Controllare codice IBAN
//	        
	        String iban ="IT60X0542811101000000123456\r\n";
	        boolean s = iban.matches("^[A-Z]{2}\\d{2}[A-Z0-9]{1,30}$");
	        System.out.println(s);
//	        	
	        
	}

}
