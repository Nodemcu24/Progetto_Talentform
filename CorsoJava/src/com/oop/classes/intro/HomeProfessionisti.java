package com.oop.classes.intro;

public class HomeProfessionisti {
		
		
		
		    public static void main(String[] args) {
		        // Creazione dell'oggetto
		        LiberoProfessionista professionista = new LiberoProfessionista();

		        
		        professionista.setCoefRedd(78);           
		        professionista.setRedditoAnnuoLordo(40000); 

		        
		        System.out.println("Utile tasse: €" + professionista.getUtileTasse());
		        System.out.println("Tassa IRPEF: €" + professionista.getTassaIrpef());
		        System.out.println("Tassa INPS: €" + professionista.getTassaInps());
		        System.out.println("Reddito netto: €" + professionista.getTotaleNetto());
		    }
		

		
		
		
		
		
		
//		
//	  LiberoProfessionista l = new LiberoProfessionista(75000, 67, 26, 15);
//
//	   System.out.println(l.getTotaleNetto());
//	   
//	    MyArtigiano m = new MyArtigiano(85000, 67, 26, 15, 3500, 15000);
//        System.out.println("Totale netto MyArtigiano: " + m.getTotaleNetto());
    }

	