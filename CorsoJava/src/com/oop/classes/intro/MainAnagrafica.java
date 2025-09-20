package com.oop.classes.intro;

public class MainAnagrafica {
	
	

	public static void main(String[] args) {
	
		Anagrafica anagrafic = new Anagrafica();
         
		anagrafic.setTitolostudio(" Diploma");
		anagrafic.setNome("Fabio");
		anagrafic.setCognome("Rossi");
		anagrafic.setNazione("Italia");
		
		System.out.println(anagrafic.getTitolostudio());
		System.out.println(anagrafic.getNome());
		System.out.println(anagrafic.getCognome());
		System.out.println(anagrafic.getNazione());
		
		
		DatiAnagrafica anagr = new DatiAnagrafica();
		
		anagr.setTitolostudio("Laurea");
		anagr.setNome("Luca");
		anagr.setCognome("Bianchi");
		anagr.setNazione("Italia");
		
		System.out.println(anagr.getTitolostudio());
		System.out.println(anagr.getNome());
		System.out.println(anagr.getCognome());
		System.out.println(anagr.getNazione());
		
	}

}
