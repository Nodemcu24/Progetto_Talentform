package com.oop.abstracts.classes;

public class MainProfessionisti {

    public static void main(String[] args) {
        Commercialista conti = new Commercialista(3000, 22, 15000, 70000, 67, 24, 15);

        System.out.println("Totale netto: " + conti.getTotaleNetto());
        System.out.println("Reddito Annuo Netto: " + conti.getRedditoAnnuoNetto());
    }

}