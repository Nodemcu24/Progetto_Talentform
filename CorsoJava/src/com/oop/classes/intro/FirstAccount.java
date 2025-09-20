package com.oop.classes.intro;

public class FirstAccount {
	
	private int balance;
	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;
	
	
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getFirstDeposit() {
		return balance+ firstDeposit;
	}
	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}
	public int getFirstDraw() {
		return getFirstDeposit()-firstDraw;
	}
	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}
	public int getSecondDeposit() {
		return getFirstDraw()+ secondDeposit;
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
	
	
	

}
