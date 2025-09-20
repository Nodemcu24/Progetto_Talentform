package com.enumeration;
import java.util.Scanner;
public class Enumeration {
	
//	enum Level {
//        MEDIUM,
//        HIGH
//
//    }
//
//    public static void main(String[] args) {
//        Level myVar = Level.MEDIUM;
//        Level myV = Level.HIGH;
//        System.out.println(myVar);
//        System.out.println(myV);
//    }
//
//}

//	  enum Giorno {
//	        LUNEDI,
//	        MARTEDI,
//	        MERCOLEDI,
//	        GIOVEDI,
//	        VENERDI,
//	        SABATO,
//	        DOMENICA
//	    }
//
//	    public static void main(String[] args) {
//	        // Ciclo for per stampare tutti i valori dell'enum Giorno
//	        for (Giorno g : Giorno.values()) {
//	            System.out.println(g);
//	        }
//	    }
//	}
	
	
	
	
	
	
//	Crea un enum Stagione con quattro valori. Usa switch per stampare un messaggio diverso per ogni stagione.

//	 enum Stagione {
//	        PRIMAVERA, ESTATE, AUTUNNO, INVERNO
//	    }
//
//	    public static void main(String[] args) {
//	        // Seleziona una stagione
//	        Stagione s = Stagione.ESTATE;
//
//	        // Usa switch per stampare un messaggio diverso
//	        switch (s) {
//	            case PRIMAVERA:
//	                System.out.println(" iin primavera fioriscono i fiori");
//	                break;
//	            case ESTATE:
//	                System.out.println(" È il momento di andare al mare.");
//	                break;
//	            case AUTUNNO:
//	                System.out.println("Le foglie cadono ");
//	                break;
//	            case INVERNO:
//	                System.out.println("Fa freddo! ");
//	                break;
//	        }
//	    }
//	}
//	
//	Chiedi all’utente il giorno della settimana e verifica se è lavorativo.
	
	
	
	
//	 enum Giorno {
//	        LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA
//	    }
//
//	    public static void main(String[] args) {
//	        Giorno g = Giorno.LUNEDI; 
//
//	        if (g == Giorno.SABATO || g == Giorno.DOMENICA) {
//	            System.out.println(g + " non è un giorno lavorativo.");
//	        } else {
//	            System.out.println(g + " è un giorno lavorativo.");
//	        }
//	    }
//	}
//	
	
//	Stampa tutti i nomi e le posizioni (ordinal) di un enum Taglia.
	
    enum Taglia {
        S, M, l, XL
    }

    public static void main(String[] args) {
        System.out.println("Taglie disponibili:");
        for (Taglia t : Taglia.values()) {
            System.out.println(t.name() + " ha posizione " + t.ordinal());
        }
    }
}
	
	
	
	
	
	
	
	