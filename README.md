# Bear-Robotics
ATM controller assignment for Bear Robotics coding challenge

## Proble Statement
***

Write code for a simple ATM. It doesn't need any UI (either graphical or console), but a controller should be implemented and tested.

### Requirements
At least the following flow should be implemented:
*Insert Card => PIN number => Select Account => See Balance/Deposit/Withdraw*

For simplification, there are only 1 dollar bills in this world, no cents. Thus account balance can be represented in **integer**.

Your code doesn't need to integrate with a **real bank system**, but keep in mind that we may want to integrate it with a real bank system in the future. It doesn't have to integrate with a **real cash bin** in the ATM, but keep in mind that we'd want to integrate with that in the future. And even if we integrate it with them, we'd like to test our code. Implementing bank integration and ATM hardware like cash bin and card reader is not a scope of this task, but testing the controller part (not including bank system, cash bin etc) is within the scope.

A bank API wouldn't give the ATM the PIN number, but it can tell you if the PIN number **is correct or not**.

Based on your work, another engineer should be able to implement the user interface. You don't need to implement any REST API, RPC, network communication etc, but just **functions/classes/methods, etc**.

You can simplify some complex real world problems if you think it's not worth illustrating in the project.

## How to submit
Please upload the code for this project to GitHub or anywhere, and post a link to your repository below. Please attach the instruction to clone your project, build and run tests in README.md file in the root directory of the repository.
***

## Code implementation explained

This assignment is coded in Java using IntelliJ IDE version 2020.3 in Mac OS Big Sur version 11.1. 
The main 5 files are located under "src/com/amir". The code is commented out so hopefully is self-explanatory. But let me know if there is any question. You may reach at: omidfar73@gmail.com . 
To begin testing out the controller simply execute and run the program (Main.java). It walks you through the the control flow given above (in the problem assignment) while asking for your input at each stage. 
**Control flow:  Insert Card => PIN number => Select Account => See Balance/Deposit/Withdraw**
For testing purposes at the beginngin of Main.Java, I have instantiated three objects to be used which you may edit/change. Throughout the testing procedure at some stages it's assumed the user would enter a valid option so the validity of some options are not checked. I shall now briefly explain each of the given files:

### 1.User.java
User class allows you to include personal information to be added to the account. For simplicity only first name, last name and account number are there now. But things like DOB, address, SSN and ... can also be added. I assumed the account number is fixed, however there are setter and getter methods for both first and last name. Finally there are two constructors (default one and one with parameters). 

### 2.CashBin.Java
This one creates objects for the ATM machines. It has attributes of the machine ID, its available balance, and whether a card is inserted or not. The methods are pretty strightforward except the ones about its Balance. My intention was to count for cases where the machine does not have as much money as the user requested but since it's very hypothetical it's not included in test cases in Main.Java. 

### 3.Console.Java
This one provides couple static methods for reading the user's input and simplifying the pin verification process (They are both used in Main.Java to build test cases and the control flow).

### 4.Account.Java
This file includes the main class in this implementation which is the user's account. It has checking and saving balances, an object from User.Java for user's info, the account pin number and two constructors (default one and one with parameters). The methods are pretty straightforward setters and getters mainly. There are three additional methods: 1.displayBalance 2.deposit 3.withdraw that are built upon the getters/setters for simpler and easier implementation.

### 5.Main.Java
Finally and example with following the given control flow is created in Main.Java which can be used for testing purposes.     





