package com.oop.classes.intro;

import java.util.Scanner;

public class MainDistributore {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il prezzo della benzina: ");
        double prezzoBenzina = in.nextDouble();
        in.nextLine(); 

        System.out.print("Inserisci il prezzo del gasolio: ");
        double prezzoGasolio = in.nextDouble();
        in.nextLine();

        DistributoreBenzina distributore = new DistributoreBenzina(prezzoBenzina, prezzoGasolio);

        System.out.print("Hai una macchina a benzina o gasolio? ");
        String tipoMacchina = in.nextLine();

        System.out.print("Inserisci la resa (km/l): ");
        double resa = in.nextDouble();
        in.nextLine();

        System.out.print("Inserisci i litri di carburante nel serbatoio: ");
        double litri = in.nextDouble();
        in.nextLine();

        Auto auto = new Auto(tipoMacchina, resa, litri);

        System.out.print("Quanti litri di benzina vuoi aggiungere al distributore? ");
        double rifornimentoBenzina = in.nextDouble();
        in.nextLine();
        distributore.rifornisciBenzina(rifornimentoBenzina);

        System.out.print("Quanti litri di gasolio vuoi aggiungere al distributore? ");
        double rifornimentoGasolio = in.nextDouble();
        in.nextLine();
        distributore.rifornisciGasolio(rifornimentoGasolio);

        System.out.print("Quanti litri vuoi vendere alla tua macchina? ");
        double litriVenduti = in.nextDouble();
        in.nextLine();
        distributore.vendi(litriVenduti, auto);

        System.out.println(" Stato del distributore:");
        System.out.println("Benzina rimanente: " + distributore.getLitriBenzina());
        System.out.println("Gasolio rimanente: " + distributore.getLitriGasolio());

        System.out.println(" Aggiorno i prezzi...");
        distributore.reimpostaPrezziCarburanti(1.70, 1.59);
        System.out.println("Prezzo benzina: " + distributore.getPrezzoBenzina());
        System.out.println("Prezzo gasolio: " + distributore.getPrezzoGasolio());

        
    }
}
