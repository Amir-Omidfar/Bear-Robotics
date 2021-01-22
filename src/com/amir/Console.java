package com.amir;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static int readNumber() {
        return scanner.nextInt();
    }

    public static boolean pinVerify(int correctPin){
        int trials=0;
        boolean verified = false;
        System.out.println("Enter your pin number:");
        while ((trials<3) && (!verified))
        {
            int pinEntered=Console.readNumber();
            if (correctPin == pinEntered)
            {verified=true;}
            else{
                System.out.println("Wrong input try again!");
            }
            trials++;
        }
        return verified;
    }

//    public static int readNumber(String prompt, int max) {
//        int value;
//        while (true) {
//            System.out.print(prompt);
//            value = scanner.nextInt();
//            if (value <= max)
//                break;
//            System.out.println("Enter a value smaller " + min + " and " + max);
//        }
//        return value;
//    }
}