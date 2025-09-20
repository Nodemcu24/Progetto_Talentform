package com.oop.classes.intro;

public class BankAccount1 {

	private int balance;
	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;
	private int thirdDeposit;
	private int thirdDraw;
	private int canoneAnnuo;

	public BankAccount1(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw,
			int thirdDeposit, int thirdDraw, int canoneAnnuo) {
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
		 
		 return balance +firstDeposit;
	 }
	
	 public int getFirstDraw() {
		 
		 return getFirstDeposit()-firstDraw;
	 }
	
	 public int getSecondDeposit() {
		 
		 return getFirstDraw()+ secondDeposit;
	 }
	
	public int getSecondDraw() {
		
		return getSecondDeposit() - secondDraw;
	}
	
	public int getThirdDeposit() {
		
		return getSecondDraw()+ thirdDeposit;
	}
	
	public int getThirdDraw() {
		
		return getThirdDeposit() - thirdDraw;
	}
	
	public int getCanoneannuo() {
		
		return getThirdDraw() * canoneAnnuo /100;
	}
	
	public int getTotalAccount() {
		
		return getThirdDraw()- getCanoneannuo();
	}
	
	
	public static void main(String[] args) {
		
		BankAccount1 bankAccount1 = new BankAccount1(0, 500, 100, 200, 50, 30, 10, 5);
		
		System.out.println( bankAccount1.getTotalAccount());
		
		

	}

}
