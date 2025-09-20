package com.oop.classes.intro;

public class NewArtigiano {

    private int redditoAnnoLordo;
    private int coeffRedd;
    private int tassaIrpef;
    private int tassaInps;
    private int aliquotaEccedente;
    private int importoEccedente;

    // METODI SET
    public void setRedditoAnnuoLordo(int RedditoAnnuoLordo) {
        this.redditoAnnoLordo = RedditoAnnuoLordo;
    }

    public void setCoeffRedd(int CoeffRedd) {
        this.coeffRedd = CoeffRedd;
    }

    public void setTassaIrpef(int TassaIrpef) {
        this.tassaIrpef = TassaIrpef;
    }

    public void setTassaInps(int TassaImps) {
        this.tassaInps = TassaImps;
    }

    public void setAliquotaEccedente(int AliquotaEccedente) {
        this.aliquotaEccedente = AliquotaEccedente;
    }

    public void setImportoEccedente(int ImportoEccedente) {
        this.importoEccedente = ImportoEccedente;
    }

    // Metodi Get

    public int getRedditoAnnoLordo() {
        return redditoAnnoLordo;
    }

    
    public int getUtileImponibile() {
        return redditoAnnoLordo * coeffRedd/100;
    }
    

    public int getTassaIrpef() {
        return getUtileImponibile() * tassaIrpef/100;
    }
    

    public int getAliquotaEccedente() {
        return ((redditoAnnoLordo - importoEccedente) * coeffRedd/100)* aliquotaEccedente/100;
    }
    
    public int getRedditoNetto() {
        return redditoAnnoLordo - (getTassaIrpef() + tassaInps + getAliquotaEccedente() );
    }


    public static void main(String[] args) {
        NewArtigiano ar = new NewArtigiano();
        
        ar.setRedditoAnnuoLordo(95000);
        ar.setCoeffRedd(67);
        ar.setTassaInps(3000);
        ar.setTassaIrpef(15);
        ar.setImportoEccedente(15000);
        ar.setAliquotaEccedente(24);
        
        System.out.println("Il reddito annuo imponibile è: "+ ar.getUtileImponibile());
        System.out.println("Il reddito netto: "+ ar.getRedditoNetto());
        System.out.println("La tassa irpef annuale è di: "+ ar.getTassaIrpef());
        System.out.println("L'aliquota eccedente è di: "+ ar.getAliquotaEccedente());
        
    }

}