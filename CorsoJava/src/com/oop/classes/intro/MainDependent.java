package com.oop.classes.intro;

public class MainDependent {
	
	 public static void main(String[] args) {
		 
		 Dependent dip = new Dependent();
		  dip.setNome("Paolo");
		  dip.setStipendio(1500);
		  dip.aumento(20);
		  
		  System.out.println(dip.getNome()+ " " + dip.getStipendio());
		  
		  
		  
		  
			Dependent d = new Dependent(" Carlo",1300);
			 d.aumento(30);
			 
			 System.out.println(d.getNome()+ " " + d.getStipendio());
	
	
	 }
}
