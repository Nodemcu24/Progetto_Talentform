package com.oop.classes.intro;

public class MainAutomobile {
	
	
	

	public static void main(String[] args) {
	
		Automobile car = new Automobile(30);
		   car.addGas(10);
	        car.drive(150);
	        
	        
	        System.out.println("Carburante rimanente: " + car.getGas());

	         Auto auto = new Auto ("benzina", 50, 20);
	         
	         auto.aggiungiCarburante(10);
	         auto.faiUnGiro(12);
	         auto.getSerbatoio();
	         auto.getTipoDiCarburante();
	        
	         System.out.println("Tipo di carburante (Auto): " + auto.getTipoDiCarburante());
	         System.out.println("Carburante rimanente (Auto): " + auto.getSerbatoio());
	     
	 
	    }

	}
