package com.oop.classes.intro;

public class Elettricista extends Docente {
	
	private int inpsFissa;
	private int importoEccedente;

	public Elettricista(int redditoAnnuoLordo, int coefRedd, int tassaInps, int tassaIrpef,  int inpsFissa,  int importoEccedente) {
		super(redditoAnnuoLordo, coefRedd, tassaInps, tassaIrpef);
		
		 this.inpsFissa = inpsFissa;
		 this.importoEccedente = importoEccedente;
		 
	}	 
      public int getUtileTasse() {
			 
			 return redditoAnnuoLordo * coefRedd/100;
		 }
		
		
        public int getTassaIrpef() {
        	
        	return getUtileTasse() * tassaIrpef/100;
        }
        
        
         public int getUtileTasseEccedente() {
        	 
        	 return (redditoAnnuoLordo - importoEccedente)* coefRedd/100;
         }
        
        
        
        
   	 public int getTassaInps() {
		 
		 return getUtileTasseEccedente() * tassaInps/100;
	 }
        
        
        
        
         public int getRedditoNetto() {
        	 
        	 return redditoAnnuoLordo - (getTassaIrpef()+ getTassaInps()+ inpsFissa) ;
        	 
		
		
		
	}

}
