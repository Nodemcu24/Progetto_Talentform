package com.oop.classes.intro;

public class BankAccount {

	private int balance = 0;
	private int firstDeposit = 0;
	private int firstDraw = 0;
	private int secondDeposit = 0;
	private int secondDraw = 0;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getFirstDeposit() {
		return balance + firstDeposit;
	}

	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public int getSecondDeposit() {
		return secondDeposit;
	}

	public void setSecondDeposit(int secondDeposit) {
		this.secondDeposit = secondDeposit;
	}

	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

	public String toString() {

		return "All'interno del conto in banca al momento ci sono: " + this.getTotalAccount() + "€.";
	}

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.setBalance(0);
		bank.setFirstDeposit(500);
		bank.setFirstDraw(100);
		bank.setSecondDeposit(50);

		System.out.println(bank);
	}

}
