package com.collections;
import java.util.*;
public class Persona {
	private String nome;
	private String cognome;
	private int eta;
	
	
	

	public Persona(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

     public String toString() {
    	 
    	 return nome + "  " +(eta);
     }


	public static void main(String[] args) {
		
		Persona persona = new Persona("Mario", "Bianchi",25);
		Persona persona1 = new Persona("Luca", "Rossi", 18);
		
		
		ArrayList<Persona> persone = new ArrayList<>(List.of(persona));
		
		ArrayList<Persona> persone1 = new ArrayList<>(List.of(persona1));
		
		persone.addAll(persone1);
		
		persone.sort((x, y) -> x.eta -y.eta);
       
		System.out.println(persone);
		
	}

}
