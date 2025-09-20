package com.math.date;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;

public class LocalDateIntro {
	
	 public static void main(String[] args) {

//	        Locale.setDefault(Locale.US);
//	        System.out.println("Default Locale = " + Locale.getDefault());
//
//	        Locale en = new Locale("en");
//	        Locale enAU = new Locale("en", "AU");
//	        Locale enCA = new Locale("en", "CA");
//
//	        Locale enIN = new Locale.Builder().setLanguage("en").setRegion("IN").build();
//	        Locale enNZ = new Locale.Builder().setLanguage("en").setRegion("NZ").build();
//
//	        var dtf =
//	                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
//
//	        for (var locale : List.of(
//	                Locale.getDefault(), Locale.US, en, enAU, enCA,
//	                Locale.UK, enNZ, enIN)) {
//	            System.out.println(locale.getDisplayName() + "= "
//	                    + LocalDateTime.now().format(dtf.withLocale(locale).withZone(ZoneId.systemDefault())));
//	        }
	   
//		 LocalDate oggi = LocalDate.now();
//		   System.out.println(oggi);
//	 
//		 Crea e stampa una data: 3 settembre 2025.
		 
//		 LocalDate data = LocalDate.of(2025, 9, 03);
//		 System.out.println(data);
//		 
//		 Aggiungi 30 giorni alla data corrente e stampa la nuova data.
		 
//		 LocalDate oggi = LocalDate.now();
//		 LocalDate aggiornato = oggi.plusDays(30);
//		 System.out.println(aggiornato);
//		 
//		 
//		 LocalDate oggi = LocalDate.now();
//		 LocalDate dic = LocalDate.of(2025, 12, 31);
//		 
//	  long giorni = ChronoUnit.DAYS.between( oggi, dic)	; 
//	    System.out.println( giorni);
//	    
//		 System.out.println("Anno: " + LocalDate.now().getYear());
//	        System.out.println("Mese: " + LocalDate.now().getMonthValue());
//	        System.out.println("Giorno: " + LocalDate.now().getDayOfMonth());
//	    
//	    LocalDate annoCorr = LocalDate.now();
//	     boolean bisestile = annoCorr.isLeapYear();
//	      System.out.println(" L'anno corrente "+ annoCorr.getYear() + " è bisestile? " + bisestile );
//	    
	 
//	 LocalDate data = LocalDate.of(2025, 9, 4);
//     DayOfWeek giorno = data.getDayOfWeek();
//     System.out.println( giorno);
	 
//     
//		 LocalDate today = LocalDate.now();
//
//	        System.out.println(" Date da oggi per i prossimi 4 giorni:");
//	        for (int i = 0; i < 5; i++) {
//	            LocalDate futureDate = today.plusDays(i);
//	            System.out.println(futureDate);
//	        }
//     

            //Calcola i minuti tra 14:15 e 16:45.
		 
//		   long min = ChronoUnit.MINUTES.between(LocalTime.of(14, 15), LocalTime.of(16, 45));
//		   System.out.println(min);
//     
     
//		 Formatta la data 2025-03-10 nel formato 10/03/2025.
     
//		    // Crea la data
//	        LocalDate data = LocalDate.of(2025, 3, 10);
//
//	        // Definisci il formato desiderato
//	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//	       
//	        String dataFormattata = data.format(formatter);
//	        System.out.println(dataFormattata); 
     

      
     
     
     
     
     
	 }
}
