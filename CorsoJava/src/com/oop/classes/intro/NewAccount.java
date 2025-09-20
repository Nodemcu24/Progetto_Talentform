package com.oop.classes.intro;

public class NewAccount {

    private static int balance;
    private static int firstDeposit;
    private static int firstDraw;
    private static int secondDeposit;
    private static int secondDraw;
    private static int canoneAnnuo;

    public static int getBalance() {
        balance = getFirstDeposit() - getFirstDraw() + getSecondDeposit() - getSecondDraw() - getCanoneAnnuo();
        return balance;
    }

    public static void setBalance(int balance) {
        NewAccount.balance = balance;
    }

    public static int getFirstDeposit() {
        return firstDeposit;
    }

    public static void setFirstDeposit(int firstDeposit) {
        NewAccount.firstDeposit = firstDeposit;
    }

    public static int getFirstDraw() {
        return firstDraw;
    }

    public static void setFirstDraw(int firstDraw) {
        NewAccount.firstDraw = firstDraw;
    }

    public static int getSecondDeposit() {
        return secondDeposit;
    }

    public static void setSecondDeposit(int secondDeposit) {
        NewAccount.secondDeposit = secondDeposit;
    }

    public static int getSecondDraw() {
        return secondDraw;
    }

    public static void setSecondDraw(int secondDraw) {
        NewAccount.secondDraw = secondDraw;
    }

    public static int getCanoneAnnuo() {
        return canoneAnnuo;
    }

    public static void setCanoneAnnuo(int canoneAnnuo) {
        NewAccount.canoneAnnuo = canoneAnnuo;
    }

    public static void main(String[] args) {

        NewAccount.setFirstDeposit(500);
        NewAccount.setFirstDraw(100);
        NewAccount.setSecondDeposit(200);
        NewAccount.setSecondDraw(50);
        NewAccount.setCanoneAnnuo(10);

        System.out.println("Saldo Attuale: " + NewAccount.getBalance() + " €");
    }
}
