package com.oop.classes.intro;

public class Dipendente {
	
	 //MODEL
	private int stipendio;
	private int oreLavorate;
	private int retribuzioneOraria;
	
	
	
	
	
	public Dipendente(int stipendio, int oreLavorate, int retribuzioneOraria) {
		super();
		this.stipendio = stipendio;
		this.oreLavorate = oreLavorate;
		this.retribuzioneOraria = retribuzioneOraria;
	}

       public int  getRetribuzioneOraria() {
    	  
    	   return stipendio/oreLavorate;
    	   
       }
       
       public int getStipendio() {
    	   
    	   return retribuzioneOraria*oreLavorate;
       }

       public int getOreLavorate() {
    	   
    	   return stipendio / retribuzioneOraria;
       }
       
       
       
       
	public static void main(String[] args) {
		
       Dipendente dipendente = new Dipendente( 1500, 160, 15);
       System.out.println(" TOTALE RETRIBUZIONE ORARIA " + dipendente.getRetribuzioneOraria());
       System.out.println ( "TOTALE STIPENDIO " + dipendente.getStipendio());
       System.out.println (" TOTALE ORE LAVORATE " + dipendente.getOreLavorate());
	}

}

	
	
	
	

	








