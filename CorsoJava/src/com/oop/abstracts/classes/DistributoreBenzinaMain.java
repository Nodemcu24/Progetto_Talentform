package com.oop.abstracts.classes;

import com.oop.classes.intro.Auto;

public class DistributoreBenzinaMain extends DistributoreBenzinaAstratto {

    private double deposito;         
    private double euroPerLitro;     

    public DistributoreBenzinaMain(double unPrezzoPerLitro) {
        this.euroPerLitro = unPrezzoPerLitro;
        this.deposito = 0;
    }

    @Override
    public void rifornisci(double unaQuantita) {
        this.deposito += unaQuantita;
    }

    @Override
    public void vendi(double euro, Auto unaAutomobile) {
        double litriDaVendere = euro / euroPerLitro;

        if (litriDaVendere > deposito) {
            System.out.println("Errore: non c'è abbastanza benzina nel deposito.");
            return;
        }

        unaAutomobile.aggiungiCarburante(litriDaVendere);
        this.deposito -= litriDaVendere;
    }

    @Override
    public void aggiorna(double unPrezzoPerLitro) {
        this.euroPerLitro = unPrezzoPerLitro;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getEuroPerLitro() {
        return euroPerLitro;
    }

    public static void main(String[] args) {
        
        DistributoreBenzinaMain distributore = new DistributoreBenzinaMain(1.734);

      
        Auto macchina = new Auto("benzina", 30, 5);

        
        distributore.rifornisci(300);
        System.out.println("Nel deposito ci sono: " + distributore.getDeposito() + " litri.");

      
        distributore.vendi(25, macchina);
        System.out.println("Nel deposito ci sono: " + distributore.getDeposito() + " litri.");

       
        distributore.aggiorna(1.654);
        System.out.println("Il prezzo al momento è: €" + distributore.getEuroPerLitro() + " al litro.");

      
        System.out.println("La macchina ha: " + macchina.getSerbatoio() + " litri di benzina.");
    }
}
