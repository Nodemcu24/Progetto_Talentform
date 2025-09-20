package com.local.classes;

//Esercizio: Usa una classe locale all’interno di un costruttore per stampare un messaggio di benvenuto.

public class Welcome {

	public Welcome(String testo) {

		class Messaggio {

			public void saluta() {
				System.out.println(" Ciao" + testo);

			}
		}

		Messaggio m = new Messaggio();
		m.saluta();

	}

	public static void main(String[] args) {

		new Welcome(" Benvenuto");

	}

}
