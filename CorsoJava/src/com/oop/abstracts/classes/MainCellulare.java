package com.oop.abstracts.classes;

public class MainCellulare extends Cellulare {

	private double carica;
	private int numeroChiamate;

	public MainCellulare(double unaCarica) {

		this.carica = unaCarica;

	}

	
	

	@Override
	public void ricarica( double unaCarica) {
	
		if(unaCarica >0) {
			carica += unaCarica;
		}
	}

	@Override
	public void chiama(double minutiDurata) {
	 double costoChiamata =minutiDurata *20;
	 
	 if( minutiDurata >0 && carica >= costoChiamata) {
		 carica -= costoChiamata;
		 numeroChiamate++;
	 } else {
		 System.out.println(" Credito insufficiente");
	 }
	 
	 
	}

	@Override
	public double numero404() {
		
		return carica;
	}

	@Override
	public int getNumeroChiamate() {
		
		return numeroChiamate;
	}

	@Override
	public void azzeraChiamate() {
		 numeroChiamate =0;
	}		
		
		
		public static void main(String[] args) {

		      MainCellulare mioTelefono = new MainCellulare(10.0); // Ricarica iniziale: 10 euro

		        mioTelefono.chiama(5); // Chiamata da 5 minuti (1 euro)
		        System.out.println("Credito residuo: " + mioTelefono.numero404() + " euro");
		        System.out.println("Numero chiamate: " + mioTelefono.getNumeroChiamate());

		        mioTelefono.ricarica(5.0); // Ricarica di 5 euro
		        System.out.println("Credito dopo ricarica: " + mioTelefono.numero404() + " euro");

		        mioTelefono.azzeraChiamate();
		        System.out.println("Numero chiamate dopo azzeramento: " + mioTelefono.getNumeroChiamate());
		        
		       
		   

		
			
			
		}		
			
	}


