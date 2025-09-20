package com.oop.classes.intro;

public class OtherFreelancer extends MyFreelancer {

	public OtherFreelancer(int redditoAnnuoLordo, int coeffRedd, int tassaInps, int tassaIrpef) {
		super(redditoAnnuoLordo, coeffRedd, tassaInps, tassaIrpef);
		
	}

     
	  public int getUtileTasse() {
	    	 
	    	 
	    	 return redditoAnnuoLordo * coeffRedd/100;
	    	 
	     }


	  public int getTassaInps() {
		  
		  
		  return getUtileTasse()* tassaInps /100;
		  
	  }

	  public int getTassaIrpef() {
		  
		  
		  
		  return getUtileTasse() * tassaIrpef/100;
	  }


	    public int getRedditoAnnuoNetto() {
	    	
	    	
	    	return (redditoAnnuoLordo-(getTassaInps() + getTassaIrpef()))/12;
	    }


	}


