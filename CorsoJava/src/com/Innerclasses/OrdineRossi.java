package com.Innerclasses;

	public class OrdineRossi {
	    
	    private String nomeCliente;
	    private String cognomeCliente;
	    private Long partitaIva;
	    private Long fattura; 
	    
	    
	    public OrdineRossi(String nomeCliente, String cognomeCliente, Long partitaIva, Long fattura) {
	        this.nomeCliente = nomeCliente;
	        this.cognomeCliente = cognomeCliente;
	        this.partitaIva = partitaIva;
	        this.fattura = fattura;
	    }


	    public class Prodotto {
	        
	        private int idProdotto;
	        private String nomeProdotto;
	        private int quantitaProdotto;
	        private int prezzoProdotto;
	        
	        public Prodotto(int idProdotto, String nomeProdotto, int quantitaProdotto, int prezzoProdotto) {
	            this.idProdotto = idProdotto;
	            this.nomeProdotto = nomeProdotto;
	            this.quantitaProdotto = quantitaProdotto;
	            this.prezzoProdotto = prezzoProdotto;
	        }    
	        
	        
	        public void StampaOrdine() {
	            System.out.println("DETTAGLI ORDINE:");
	            System.out.println("NOME CLIENTE: "+ nomeCliente + " COGNOME CLIENTE: "+ cognomeCliente );
	            System.out.println("PARTITA IVA: "+ partitaIva + " FATTURA: €"+ fattura );
	            System.out.println("-----------------------------------------------------------------------");
	            System.out.println("DETTAGLI ORDINE:");
	            System.out.println("ID PRODOTTO: "+ idProdotto + " NOME PRODOTTO: "+ nomeProdotto );
	            System.out.println("QUANTITA: : "+ quantitaProdotto + " PREZZO: €"+ prezzoProdotto );
	        }
	        
	    }
	    
	    

	    public static void main(String[] args) {
	        
	        OrdineRossi ordine = new OrdineRossi("Giorgio", "Rossi", 1234567890l, 1500l );
	        
	        OrdineRossi.Prodotto a = ordine.new Prodotto(123, "Scarpe", 5, 300 );
	        
	        a.StampaOrdine();
	    	        
	    }
	        
	}        
	        
	        
	        
	        
	        
	    