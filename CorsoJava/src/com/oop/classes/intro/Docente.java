package com.oop.classes.intro;

public class Docente {
	
	    protected int redditoAnnuoLordo;
	    protected int coefRedd;     // coefficiente di redditività (percentuale)
	    protected int tassaInps;    // percentuale tassa INPS
	    protected int tassaIrpef;   // percentuale tassa IRPEF
		public Docente(int redditoAnnuoLordo, int coefRedd, int tassaInps, int tassaIrpef) {
			super();
			this.redditoAnnuoLordo = redditoAnnuoLordo;
			this.coefRedd = coefRedd;
			this.tassaInps = tassaInps;
			this.tassaIrpef = tassaIrpef;
			
			
			
			
			
	

	
	
	
	
		}
	
		 public int getUtileTasse() {
			 
			 return redditoAnnuoLordo * coefRedd/100;
		 }
		
		 public int getTassaInps() {
			 
			 return getUtileTasse() * tassaInps/100;
		 }
		
        public int getTassaIrpef() {
        	
        	return getUtileTasse() * tassaIrpef/100;
        }
        
         public int getRedditoNetto() {
        	 
        	 return (redditoAnnuoLordo - tassaIrpef - tassaInps);
        	 
         }
        
		}
