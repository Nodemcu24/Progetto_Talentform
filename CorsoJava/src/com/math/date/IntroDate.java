package com.math.date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class IntroDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate oggi = LocalDate.now();
		System.out.println("La data di oggi e': " + oggi);
	
	

		
		  
		        LocalDate data = LocalDate.of(2000, 1, 1);
		        LocalDate odierna = LocalDate.now();

		        if (data.isBefore(oggi)) {
		            System.out.println("È una data passata.");
		        } else {
		            System.out.println("Non è una data passata.");
		        }
		    
		   LocalDate.now();     
		        
		    System.out.println("Anno" +  oggi.getYear());
		    System.out.println( "Mese"+  oggi.getMonthValue());
		    System.out.println (" Giorno" + oggi.getDayOfMonth());
		 
		    LocalDate now = LocalDate.now();
	        boolean bisestile = oggi.isLeapYear();
	        System.out.println("L'anno " + oggi.getYear() + " è bisestile? " + bisestile);
          
	     
	        
	}

}
