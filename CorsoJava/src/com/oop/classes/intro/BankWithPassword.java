package com.oop.classes.intro; // Package che organizza la classe nel progetto

import java.util.Scanner; // Importa Scanner per leggere input da tastiera

public class BankWithPassword { // Definizione della classe principale

    private int balance = 0; // Saldo iniziale del conto
    private int pass;        // Password per accedere al conto
    private int rate;        // Interesse calcolato

    // Costruttore che imposta solo la password
    public BankWithPassword(int pass) {
        this.pass = pass;
    }

    // Costruttore che imposta saldo iniziale e password
    public BankWithPassword(int initialBalance, int pass) {
        this.balance = initialBalance;
        this.pass = pass;
    }

    // Metodo per controllare se la password è corretta
    public boolean controlPassword(int pass) {
        if (this.pass == pass)
            return true;
        return false;
    }

    // Metodo per depositare denaro, se la password è corretta
    public boolean deposit(int pass, int amount) {
        if (controlPassword(pass)) {
            this.balance += amount; // Aggiunge l'importo al saldo
            return true;
        }
        return false;
    }

    // Metodo per ottenere il saldo attuale
    public int getBalance() {
        return balance;
    }

    // Metodo per ottenere l'interesse calcolato
    public int getRate() {
        return rate;
    }

    // Metodo per prelevare denaro, se la password è corretta
    public boolean withDraw(int pass, int amount) {
        if (controlPassword(pass)) {
            this.balance -= amount; // Sottrae l'importo dal saldo
            return true;
        }
        return false;
    }

    // Metodo per calcolare l'interesse e salvarlo in 'rate'
    public boolean addInterest(int percentualeInteresse, int pass) {
        if (controlPassword(pass)) {
            this.rate = this.balance * percentualeInteresse / 100;
            return true;
        }
        return false;
    }

    // Metodo per ottenere la password (non consigliato per sicurezza)
    public int getPass() {
        return pass;
    }

    // Metodo statico per chiudere il programma (ritorna sempre false)
    public static boolean close() {
        return false;
    }

    // Metodo principale che gestisce l'interazione con l'utente
    public static void main(String[] args) {

        BankWithPassword a = new BankWithPassword(123); // Crea un conto con password 123

        Scanner s = new Scanner(System.in); // Scanner per input da tastiera
        boolean run = true; // Variabile per controllare il ciclo

        System.out.println("inserisci password");
        int pass = s.nextInt(); // L'utente inserisce la password

        while (run) { // Ciclo principale del programma

            if (a.controlPassword(pass)) { // Se la password è corretta

                // Menu delle operazioni disponibili
                System.out.println("1 - saldo del conto");
                System.out.println("2 - deposito sul conto");
                System.out.println("3 - preleva dal conto");
                System.out.println("4 - aggiungi interesse");
                System.out.println("5 - visualizza interesse");
                System.out.println("6 - chiudi il programma");

                System.out.println("inserisci operazione");
                int operazione = s.nextInt(); // L'utente sceglie l'operazione

                switch (operazione) {
                    case 1: // Mostra il saldo
                        System.out.println("il tuo saldo è = " + a.getBalance());
                        break;

                    case 2: // Deposita denaro
                        System.out.println("inserisci quanto vuoi depositare");
                        int dep = s.nextInt();
                        a.deposit(pass, dep);
                        break;

                    case 3: // Preleva denaro
                        System.out.println("inserisci quanto vuoi prelevare");
                        int prev = s.nextInt();
                        a.withDraw(pass, prev);
                        break;

                    case 4: // Aggiungi interesse
                        System.out.println("aggiungi un interesse");
                        int interesse = s.nextInt();
                        a.addInterest(interesse, pass);
                        break;

                    case 5: // Visualizza interesse calcolato
                        System.out.println("l'interesse applicato corrisponde alla cifra: ");
                        System.out.println(a.getRate());
                        break;

                    case 6: // Chiudi il programma
                        run = close(); // Questo ritorna sempre false, quindi il ciclo continua
                        System.out.println("programma chiuso correttamente");
                        break;
                }

            } else {
                // Se la password è sbagliata, chiede di reinserirla
                System.out.println("password errata, reinseriscila");
            }

        }

    }

}
