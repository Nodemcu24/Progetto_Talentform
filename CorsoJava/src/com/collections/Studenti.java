package com.collections;

import java.util.*;

public class Studenti {

	private String nome;
	private String cognome;
	private int eta;

	public Studenti(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}

	public static void main(String[] args) {
		List<Studenti> studenti = new ArrayList<>();
		studenti.add(new Studenti("Mario", "Rossi", 23));
		studenti.add(new Studenti("Gennaro", "Verdi", 21));
		studenti.add(new Studenti("Paolo", "Bianchi", 40));
        studenti.add(new Studenti("Anna","Balbi", 60 ));
		
		
//		List<Studenti> altriStudenti = new ArrayList<>();
//		altriStudenti.add(new Studenti("Lucia", "Neri", 19));
//		altriStudenti.add(new Studenti("Alessandro", "Blu", 25));

//		studenti.addAll(altriStudenti);
//
//		for (Studenti s : studenti)
//			System.out.println(s);
//		
//		Conta quante volte compare "Anna" in una lista.
		
//		  int countAnna = 0;
//	        for (Studenti s : studenti) {
//	            if (s.getNome().equals("Anna")) {
//	                countAnna++;
//	            }
//	        }

//	        System.out.println(countAnna);
        
        Studenti minStudente = studenti.get(0);
        for (Studenti s : studenti) {
            if (s.getEta() < minStudente.getEta()) {
                 minStudente = s;
            }
        }
        
        System.out.println("Studente con età minore: " + minStudente);

        
        
	    }
	}
		
	


