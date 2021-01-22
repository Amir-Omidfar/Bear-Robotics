package com.amir;

public class Account {

    // Assuming two account types: saving and checking:
    private int savingBalance;
    private int checkingBalance;
    private int pinNumber;
    private User userInfo;

    public Account() {
        savingBalance=100;
        checkingBalance=1000;
        pinNumber=1234;
        userInfo=new User();
    }

    public Account(int savingBalance, int checkingBalance, int pinNumber, User userInfo) {
        this.savingBalance = savingBalance;
        this.checkingBalance = checkingBalance;
        this.pinNumber = pinNumber;
        this.userInfo = userInfo;
    }

    public int getSavingBalance() {
        return savingBalance;
    }

    public void savingDeposit(int amount){
        this.savingBalance+=amount;
    }
    public void savingWithdraw(int amount){
        if (amount > savingBalance)
            System.out.println("not enough money in your saving account. Select smaller amount!");
        else{
            this.savingBalance-=amount;
            System.out.println("transaction completed");
        }
    }

    public int getCheckingBalance() {
        return checkingBalance;
    }

    public void checkingDeposit(int amount){
        this.checkingBalance+=amount;
    }
    public void checkingWithdraw(int amount){
        if (amount > checkingBalance)
            System.out.println("not enough money in your checking account. Select smaller amount!");
        else{
            this.checkingBalance-=amount;
            System.out.println("transaction completed");
        }

    }

    public void displayBalance(int accountType){
        if (accountType == 1){
            System.out.println("Checking account balance: "+getCheckingBalance());
        }
        else{
            System.out.println("Saving account balance: "+getSavingBalance());
        }

    }

    public void deposit(int accountType, int amount){
        if (accountType ==1){
            checkingDeposit(amount);
        }
        else if (accountType == 2){
            savingDeposit(amount);
        }
    }

    public void withdraw(int accountType, int amount){
        if (accountType ==1){
            checkingWithdraw(amount);
        }
        else if (accountType == 2){
            savingWithdraw(amount);
        }
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

}
