package com.methods;

public class GraficaDati {
	
	
	 public String getAnagrafica ( String nome, String cognome ) {
		 
		 
		 return nome + " " + cognome;
	 }
	
	public int getAnagrafica ( int anni) {
		
		
		return anni ;
	}
	 public long getAnagrafica (long telefono) {
		 
		 
		 return telefono;
	 }
	
	
	

	public static void main(String[] args) {
	
	GraficaDati dati = new GraficaDati();
	
	 String nome = "nome Francesco";
	 String cognome= " cognome Rossi";
	 int anni = 34;
	 long telefono = 1234567890;
	 
	 System.out.println(dati.getAnagrafica(nome, cognome));
	 System.out.println(dati.getAnagrafica(anni));
     System.out.println(dati.getAnagrafica(telefono));
	}

}
