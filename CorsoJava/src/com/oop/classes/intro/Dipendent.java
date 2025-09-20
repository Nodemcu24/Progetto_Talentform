package com.oop.classes.intro;

public class Dipendent {
    
    protected String matricola;
   protected float stipendio;
   protected float straordinario;
    
    public Dipendent(String matricola, float stipendio, float straordinario) {
        super();
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }
    
    public float getStipendi(){
        return stipendio;
    }
    
    public float getPaga(int ore) {
        return stipendio + ore * straordinario;
    }
   
    public void Stampa() {
        System.out.println("La matricola del dipendente è: "+ matricola);
        System.out.println("Lo stipendio base del dipendente è: €" + stipendio);
       System.out.println("Lo staordinario del dipendente è di: €"+ straordinario);
    }   
   




public static void main(String[] args) {
    Dipendent dipendente = new Dipendent(
        "001A",
        1800f,
        30
    );
  
    DipendenteA dipendenteA = new DipendenteA(
        "001A",
        1800f, 
        30,
        0
    );
    
    dipendenteA.prendiMalattia(7);
    System.out.println(dipendenteA.getPaga(5));
    dipendenteA.stampaMalattia();
}

}