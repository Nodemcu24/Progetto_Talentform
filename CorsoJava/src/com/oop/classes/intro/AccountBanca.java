package com.oop.classes.intro;

public class AccountBanca {
	
  
   private int balance;
	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;

	
	
	
	

	public AccountBanca(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw) {
		;
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
	}

       public int getFirstDeposit(){
    	   
    	   return balance + firstDeposit;
    	   
       }

        public int getFirstDraw() {
        	
         return getFirstDeposit()-firstDraw;	
        }

        public int getSecondDeposit() {
        	
        	
        	return getFirstDraw()+secondDeposit;
        }
        
        public int getTotalAccount() {
        	
        	
        	 return getSecondDeposit()-secondDraw ;
        }
        
        
        
        
        
        
        

	public static void main(String[] args) {
		
		AccountBanca banca = new AccountBanca(0, 100, 20, 200, 10);
         
		 System.out.println(" IL SALDO TOTALE " + banca.getTotalAccount());
		
		
		
		
	}

}
