package com.oop.classes.intro;

public class MainAbbigliamento {
	

	    public static void main(String[] args) {
	        
	        TipoCapoAbbigliamento t = new TipoCapoAbbigliamento("Balmain", "Estivo",50.99);
	        
	        System.out.println("Dopo lo sconto il prezzo è: €" + t.applicaSconto(10));
	        
	        System.out.println("");
	        
	        CapoAbbigliamento c = new CapoAbbigliamento("Balmain", "Estivo", 50.99, 28, 1, 5);
	        
	        c.venduto(2);
	        c.getDettagli();
	    }
	}
	
	
	
	


