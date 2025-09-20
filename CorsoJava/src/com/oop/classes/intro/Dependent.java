package com.oop.classes.intro;

public class Dependent {
	
	private String nome;
	private double stipendio;
	
	
	public Dependent() {
		
		
	}

	public Dependent(String nome, double stipendio) {
		super();
		this.nome = nome;
		this.stipendio = stipendio;
	};
	
	
	public String getNome() {
		
		return nome;
	}
		 
	 public double getStipendio() {
		 
		 return stipendio;
	 }

	 public void setNome(String  nuovoNome) {
		 this.nome = nuovoNome;
	 }

	 public void setStipendio(double nuovoStipendio) {
		 this.stipendio = nuovoStipendio;
	 
	 }	
	 
	 public void aumento ( double percentuale) {
		 
		   this.stipendio += stipendio +(stipendio * percentuale/100);
	 }
	 
	 
}	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
