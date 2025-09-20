package com.oop.classes.intro;

public class Freelancer {

	private int redditoAnnuoLordo;
	private int coeffRedd;
	private int tassaInps;
	private int tassaIrpef;

	public Freelancer(int redditoAnnuoLordo, int coeffRedd, int tassaInps, int tassaIrpef) {
		super();
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coeffRedd = coeffRedd;
		this.tassaInps = tassaInps;
		this.tassaIrpef = tassaIrpef;
	}

	public int getUtilitasse() {

		return redditoAnnuoLordo * coeffRedd / 100;
	}

	public int getTassaInps() {

		return getUtilitasse() * tassaInps / 100;
	}

	public int getIrpef() {

		return getUtilitasse() * tassaIrpef / 100;
	}

	public int getRedditoNetto() {

		return (redditoAnnuoLordo - (getTassaInps() + getIrpef())) / 12;
	}

	public static void main(String[] args) {

		Freelancer freelancer = new Freelancer(85000, 78, 26, 15);

		System.out.println(" Reddito Netto: " + freelancer.getRedditoNetto());

	}

}
