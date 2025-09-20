package com.oop.classes.intro;

public class Bank1 {
	
	//MODEL
	
	private int balance =0;
	private int firstDeposit =0;
	private int firstDraw =0;
	private int secondDeposit =0;
	private int secondDraw =0;
	private int thirdDeposit =0;
	private int thirdDraw =0;
	private int canoneAnnuo =0;
	
	
	
	
	
	
	

	public Bank1(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw, int thirdDeposit,
			int thirdDraw,int canoneAnnuo) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
		this.thirdDeposit = thirdDeposit;
		this.thirdDraw = thirdDraw;
		this.canoneAnnuo = canoneAnnuo;
	}


    public int getFirstDeposit() {
        return balance + firstDeposit;
    }

    public int getFirstDraw() {
        return getFirstDeposit() - firstDraw;
    }

    public int getSecondDeposit() {
        return getFirstDraw() + secondDeposit;
    }

    public int getSecondDraw() {
        return getSecondDeposit() - secondDraw;
    }

    public int getThirdDeposit() {
        return getSecondDraw() + thirdDeposit;
    }

    public int getThirdDraw() {
        return getThirdDeposit() - thirdDraw;
    }

    public int getFinalBalance() {
        return getThirdDraw();
    }

    public int getTotalCanoneannuo() {
        return getFinalBalance() * canoneAnnuo / 100;
    }

    public int getTotalAccount() {
        return getFinalBalance() - getTotalCanoneannuo();
    }








	public static void main(String[] args) {
        Bank1 bank = new Bank1(
            100,   // balance iniziale
            50,    // primo deposito
            30,    // primo prelievo
            70,    // secondo deposito
            20,    // secondo prelievo
            40,    // terzo deposito
            10,    // terzo prelievo
            55    //  canone Annuo
        );

        System.out.println("Saldo finale: " + bank.getFinalBalance());
    }
}
		
		
	

