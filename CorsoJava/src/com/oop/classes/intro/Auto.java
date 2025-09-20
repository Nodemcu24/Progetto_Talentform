package com.oop.classes.intro;


public class Auto {
	
	
	//Modificare la classe Car2, assegnata nell’esercizio 3.4, in modo tale che la
	//macchina riconosca il tipo di carburante che consuma(benzina o gasolio).
	//Implementate inoltre i seguenti metodi: void aggiungiCarburante(double litri)
	//che aggiunge carburante al serbatoio della macchina. void faiUnGiro(double
	//kilometri) che simula una corsa di un'auto per un determinato numero di km.
	//boolean usaBenzina() che restituisce se il carburante della macchina è benzina.
	//boolean usaGasolio() che restituisce se il carburante della macchina è gasolio.
	//double getSerbatoio()che restituisce il numero di litri di carburante rimanenti
	//nel serbatoio. String getTipoDiCarburante() che restituisce il tipo di
	//carburante della macchina.

	
	    
	    protected double resa;
	    protected double serbatoio;
	    protected boolean benzina;
	
	    public void  aggiungiCarburante(double litri) {
			 
			  serbatoio +=litri;
		 }
		
		 public void faiUnGiro( double km) {
			 
			 double carburanteConsumato = km /resa;
			 
			 if(carburanteConsumato <= serbatoio) {
				 serbatoio -= carburanteConsumato;
			 }
			 
		 }
	    
	    public boolean usaBenzina() {
	    	
	    	return benzina;
	    }
	    
	    public boolean usaGasolio() {
	    	
	    	return !benzina;
	    }
	    
	    public double getSerbatoio() {
	    	
	    	return serbatoio;
	    }
	    
	    public String getTipoDiCarburante() {
	    	String tipoCarburante;
	    	if(benzina= true ) {
	    		tipoCarburante = "benzina";
	    	} else {
	    		tipoCarburante ="gasolio";
	    	}
	    	
	    	 return tipoCarburante;
	    }
	    
	     public Auto(String unCarburante, double unaResa, double litri) {
	    	 
	    	serbatoio= litri;
	    	 resa = unaResa;
	    	 if( unCarburante.equalsIgnoreCase("benzina") == true) {
	    		 
	    		 benzina= true;
	    		 
	    	 } else {
	    		 
	    		 benzina =false;
	    	 }
	    	 
	    	
	     }
	
	

}
