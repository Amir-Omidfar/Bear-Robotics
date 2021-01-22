package com.amir;

public class CashBin {
    //ATM ID (assigned based on its location, the closed bank branch to it, etc)
    private int ID;
    //cash bin balance used to make sure
    private int balance;
    //check if the user's card is inserted
    private boolean cardInserted;

    //Constructors
    public CashBin() {
        this.ID=12345;
        this.balance=10_000;
        this.cardInserted=false;
    }

    public CashBin(int ID, int balance) {
        this.ID = ID;
        this.balance = balance;
        this.cardInserted=false;
    }

    //isCardInserted methods
    public boolean isCardInserted(){
        return cardInserted;
    }
    public void insertCard(){
        cardInserted=true;
    }
    public void removeCard(){
        cardInserted=false;
    }

    //balance methods: used for money withdrawing/depositing  from/to the bin
    private int getBalance() {
        return balance;
    }
    //transactions to/from the cash bin
    public void deposit(int amount){
        this.balance=+amount;
    }
    public void withdraw(int amount){
        if (amount > this.balance){
            System.out.println("Not enough money!Select smaller amounts");
        }
        else{
            balance=balance-amount;
        }
    }
}
