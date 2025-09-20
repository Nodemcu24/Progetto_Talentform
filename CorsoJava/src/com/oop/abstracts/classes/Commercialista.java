package com.oop.abstracts.classes;


public class Commercialista extends Idraulico {

    private int inpsFissa;
    private int iva;
    private int importoEccedente;
    private int redditoAnnuoLordo;
    private int coeffRedd;
    private int aliquotaInps;
    private int tassaIrpef;

    public Commercialista(int inpsFissa, int iva, int importoEccedente, int redditoAnnuoLordo, int coeffRedd, int aliquotaInps, int tassaIrpef) {
        this.inpsFissa = inpsFissa;
        this.iva = iva;
        this.importoEccedente = importoEccedente;
        this.redditoAnnuoLordo = redditoAnnuoLordo;
        this.coeffRedd = coeffRedd;
        this.aliquotaInps = aliquotaInps;
        this.tassaIrpef = tassaIrpef;
    }

    @Override
    public int getUtileTasse() {
        return redditoAnnuoLordo * coeffRedd / 100; // per psicologo e irpeff idraulico
    }

    @Override
    public int getTassaIrpef() {
        return getUtileTasse() * tassaIrpef / 100;
    }

    @Override
    public int getTassaInps() {
        return getUtileTasse() * aliquotaInps / 100;
    }

    @Override
    public int getTotaleNetto() {
        return redditoAnnuoLordo - (getTassaIrpef() + getTassaInps());
    }

    @Override
    public int getUtileEccedente() {
        return (redditoAnnuoLordo - importoEccedente) * coeffRedd / 100;
    }

    public int getUtileInps() {
        return getUtileEccedente() * aliquotaInps / 100;
    }

    public int getRedditoAnnuoNetto() {
        return redditoAnnuoLordo - (getTassaIrpef() + getUtileInps() + inpsFissa + getUtileIva());
    }

    public int getUtileIva() {
        return getUtileEccedente() * iva / 100;
    }

	@Override
	public int getUtilitasse() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIrpef() {
		// TODO Auto-generated method stub
		return 0;
	}

}