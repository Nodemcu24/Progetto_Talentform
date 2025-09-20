
package com.oop.classes.intro;


public class Cellulare {
    
    
    private double carica;  
    private int numeroChiamate;  
    private int minutiChiamateTotali = 0;
    
    // Costruttore: inizializza il cellulare con un certo credito
    public Cellulare(double carica) {
        this.carica = carica;
    }

    // Metodo per ricaricare il credito del cellulare
    public void ricarica(double ricarica) {
        this.carica += ricarica;
    }
    
    // Metodo per effettuare una chiamata
    public void chiama(double minutiDurata) {
    	
        // Incrementa il numero di chiamate
        this.numeroChiamate++;
        
        // Verifica se c'è abbastanza credito per la chiamata (0.20€/minuto)
        if (this.carica - minutiDurata * 0.20 > 0) {
        	
            // Scala il costo della chiamata dal credito
            this.carica -= minutiDurata * 0.20;

            // Aggiunge la durata della chiamata al totale
            minutiChiamateTotali += minutiDurata;
        }
       
    }
    
    // Metodo che simula il numero 404 per conoscere il credito residuo
    public double numero404() {
        return this.carica;
    }    
    
    // Metodo per azzerare tutte le chiamate e il credito
    public void azzeraChiamate() {
        this.numeroChiamate = 0;
        this.minutiChiamateTotali = 0;
        this.carica = 0;
    }

    // Metodo che restituisce una stringa con il numero di chiamate e i minuti totali
    public String getNumeroChiamate() {
        return "Cellulare [numeroChiamate=" + this.numeroChiamate + ", minutiChiamateTotali=" + minutiChiamateTotali + "]";
    }

    // Metodo statico per stampare qualsiasi oggetto passato come parametro
    public static void stampa(Object aaa) {
        System.out.println(String.valueOf(aaa));
    }

    // Metodo main: punto di ingresso del programma
    public static void main(String[] args) {
        
        // Creazione di un nuovo cellulare con 20€ di credito
        Cellulare cellulare1 = new Cellulare(20);
        
        // Ricarica di 50€
        cellulare1.ricarica(50.0);

        // Effettua una chiamata di 13 minuti
        cellulare1.chiama(13.0);

        // Stampa il credito residuo
        stampa(cellulare1.numero404());

        // Stampa il numero di chiamate e i minuti totali
        stampa(cellulare1.getNumeroChiamate());
        
        // Ricarica di 80€
        cellulare1.ricarica(80.0);

        // Effettua una chiamata di 20 minuti
        cellulare1.chiama(20.0);

        // Stampa il credito residuo
        stampa(cellulare1.numero404());

        // Stampa il numero di chiamate e i minuti totali
        stampa(cellulare1.getNumeroChiamate());
        
        // Ricarica di 20€
        cellulare1.ricarica(20.0);

        // Effettua una chiamata di 90 minuti
        cellulare1.chiama(90.0);

        // Stampa il credito residuo
        stampa(cellulare1.numero404());

        // Stampa il numero di chiamate e i minuti totali
        stampa(cellulare1.getNumeroChiamate());
        
        // Stampa un messaggio informativo
        stampa("chiamate azzerate");
        
        // Azzera tutte le chiamate e il credito
        cellulare1.azzeraChiamate();

        // Stampa lo stato dopo l'azzeramento
        stampa(cellulare1.getNumeroChiamate());
    }
}
