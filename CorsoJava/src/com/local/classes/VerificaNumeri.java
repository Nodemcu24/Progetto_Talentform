package com.local.classes;

public class VerificaNumeri {

    public static void verifica(int numero) {
        class ControlloPariDispari {
            boolean isPari() {
                return numero % 2 == 0;
            }
        }

        ControlloPariDispari controllo = new ControlloPariDispari();
        System.out.println(numero + (controllo.isPari() ? " è pari." : " è dispari."));
    }

    public static void main(String[] args) {
        verifica(7);
        verifica(10);
    }
}
