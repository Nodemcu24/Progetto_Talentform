package com.oop.classes.intro;

public class TipoCapoAbbigliamento {
	    
	    protected String marca = "";
	    protected String modello = "";
	    protected double costo = 0;
	    
	    public TipoCapoAbbigliamento(String marca, String modello, double costo) {
	        
	        this.marca = marca;
	        this.modello = modello;
	        this.costo = costo;
	    }
	    
	    public void setMarca(String marca) {
	        
	        this.marca = marca;
	    }
	    
	    public void setModello(String modello) {
	        
	        this.modello = modello;
	    }
	    
	    public void setCosto(double costo) {
	        
	        this.costo = costo;
	    }
	    
	    public void getCosto() {
	        
	        System.out.println("Il costo del capo ammonta a: €" + costo);
	    }
	    
	    public double applicaSconto(double sconto) {
	        
	        return costo - (costo * (sconto / 100));
	    }
	    
	    public void modificaCosto(double costo) {
	        
	        this.costo = costo;
	    }
	}
	
	
