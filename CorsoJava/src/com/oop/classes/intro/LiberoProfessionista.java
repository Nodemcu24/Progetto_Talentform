package com.oop.classes.intro;

public class LiberoProfessionista {

    protected int redditoAnnuoLordo;
    protected int coefRedd;     // coefficiente di redditività (percentuale)
    protected int tassaInps;    // percentuale tassa INPS
    protected int tassaIrpef;   // percentuale tassa IRPEF

    // Calcolo utile su cui si basano le tasse
    public int getUtileTasse() {
        return redditoAnnuoLordo * coefRedd / 100;
    }

    // Calcolo tassa IRPEF basata sull'utile
    public int getTassaIrpef() {
        return getUtileTasse() * tassaIrpef / 100;
    }

    // Calcolo tassa INPS basata sull'utile
    public int getTassaInps() {
        return getUtileTasse() * tassaInps / 100;
    }

    // Calcolo reddito netto dopo le tasse
    public int getTotaleNetto() {
        return redditoAnnuoLordo - (getTassaIrpef() + getTassaInps());
    }

    // Setter
    public void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
        this.redditoAnnuoLordo = redditoAnnuoLordo;
    }

    public void setCoefRedd(int coefRedd) {
        this.coefRedd = coefRedd;
    }

    public void setTassaInps(int tassaInps) {
        this.tassaInps = tassaInps;
    }

    public void setTassaIrpef(int tassaIrpef) {
        this.tassaIrpef = tassaIrpef;
    }
}

    
    
//    
//    public LiberoProfessionista(int redditoAnnuoLordo, int coefRedd, int tassaInps, int tassaIrpef) {
//        
//        this.redditoAnnuoLordo = redditoAnnuoLordo;
//        this.coefRedd = coefRedd;
//        this.tassaInps = tassaInps;
//        this.tassaIrpef = tassaIrpef;
//    }
//
//    
//    
//    public int getUtileTasse() {
//        return redditoAnnuoLordo *coefRedd/100;
//    }
//    
//    public int getTassaIrpef() {
//        return getUtileTasse() *tassaIrpef/100;
//    }
//    
//    
//    public int getTassaInps() {
//        return getUtileTasse() *tassaInps/100;
//    }
//    
//    public int getTotaleNetto() {
//        return redditoAnnuoLordo -(getTassaIrpef() + getTassaInps());
//    }
//	
//}	
//	





