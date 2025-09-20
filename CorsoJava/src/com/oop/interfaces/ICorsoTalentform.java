package com.oop.interfaces;

public class ICorsoTalentform implements CorsoTalentform {

    private String durataCorso;
    private String tecnologieCorso;
    private int numeroStudentiCorso;
    private String modalitaCorso;

    public ICorsoTalentform(String durata, String tecnologie, int numeroStudenti, String modalitaCorso) {
        this.durataCorso = durata;
        this.tecnologieCorso = tecnologie;
        this.numeroStudentiCorso = numeroStudenti;
        this.modalitaCorso = modalitaCorso;
    }

    @Override
    public String getDurataCorso() {
        return durataCorso;
    }

    @Override
    public String getTecnologieCorso() {
        return tecnologieCorso;
    }

    @Override
    public int getNumeroStudentiCorso() {
        return numeroStudentiCorso;
    }

    @Override
    public String getModalitaCorso() {
        return modalitaCorso;
    }

    public static void main(String[] args) {
        ICorsoTalentform corso = new ICorsoTalentform("248 ore", "Backend", 13, "Remoto");

        System.out.println("Durata del corso: " + corso.getDurataCorso());
        System.out.println("Tecnologie del corso: " + corso.getTecnologieCorso());
        System.out.println("Numero di studenti: " + corso.getNumeroStudentiCorso());
        System.out.println("Modalità del corso: " + corso.getModalitaCorso());
    }
}
