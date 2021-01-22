package com.amir;

public class Main {

    public static void main(String[] args) {
        //create a new user and then a bank account and a ATM cash_bin which we are at
        var amirInfo =new User("Amir","Omidfar",1_781_232);
        var myAccount=new Account(200, 12000, 4545, amirInfo);
        var fremontATM=new CashBin(2321,100_000);

        boolean systemInTest=true;
        while (systemInTest){
            System.out.println("Press 1 to insert card or 2 to exit the program:");
            int usrInput=Console.readNumber();
            if(usrInput == 2){
                systemInTest=false;
                System.out.println("End of the program");
            }
            else if (usrInput != 1)
                System.out.println("Wrong selection try again1");
            else{
                //Since we don't have access to the ATM machine card insertion is modeled with if statements
                //and we are manually changing the cash bin's related method
                fremontATM.insertCard();
                //Allow three attempts to enter the correct pin number
                if (!Console.pinVerify(myAccount.getPinNumber())){
                    systemInTest=false;
                    System.out.println("invalid entry!Exiting the program. Please remove your card");
                    fremontATM.removeCard();
                }
                else {
                    System.out.println("Welcome to your account");
                    boolean activeUser=true;
                    while(activeUser){
                        System.out.println("For Checking Account select 1 for Saving 2 or 3 to Exit");
                        int accountType=Console.readNumber();
                        if (accountType==3){
                            activeUser=false;
                            fremontATM.removeCard();
                            System.out.println("Thanks goodbye!");
                        }
                        else
                        {
                            System.out.println("Select from the menu: Balance: 1, Deposit: 2, Withdraw: 3");
                            int action=Console.readNumber();
                            if(action == 1){
                                myAccount.displayBalance(accountType);
                            }
                            else  if(action == 2){
                                System.out.println("Enter the amount you are depositing");
                                int depositAmount=Console.readNumber();
                                myAccount.deposit(accountType,depositAmount);
                                System.out.println("Account updated");
                                myAccount.displayBalance(accountType);
                            }
                            else if (action == 3){
                                System.out.println("Enter the amount you are withdrawing");
                                int withdrawAmount=Console.readNumber();
                                myAccount.withdraw(accountType,withdrawAmount);
                                System.out.println("Account updated");
                                myAccount.displayBalance(accountType);
                            }

                        }


                    }



                }





            }

        }

    }
}
