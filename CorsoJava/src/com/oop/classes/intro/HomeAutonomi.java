package com.oop.classes.intro;

public class HomeAutonomi {

	public static void main(String[] args) {
		
		
		Docente doc = new Docente (80000, 67, 26, 5);
		
		System.out.println(doc.getRedditoNetto());		

		 Elettricista elettr = new Elettricista(90000,67,24,15,3500,15000 );
		
		System.out.println(elettr.getRedditoNetto());
		 
		 
	}

}
