package com.oop.classes.intro;

public class Anagrafica {

	private String titolostudio;
	private String Nome;
	private String Cognome;
	private String Nazione;

//	public Anagrafica(String titolostudio, String nome, String cognome, String nazione) {
//		super();
//		this.titolostudio = titolostudio;
//		Nome = nome;
//		Cognome = cognome;
//		Nazione = nazione;
//	}

	public String getTitolostudio() {
		return titolostudio;
	}

	public void setTitolostudio(String titolostudio) {
		this.titolostudio = titolostudio;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getNazione() {
		return Nazione;
	}

	public void setNazione(String nazione) {
		Nazione = nazione;
	}

	public static void main(String[] args) {

		Anagrafica anagrafica = new Anagrafica();

		System.out.println(anagrafica.titolostudio);
		System.out.println(anagrafica.Nome);
		System.out.println(anagrafica.Cognome);
		System.out.println(anagrafica.Nazione);

	}

}
