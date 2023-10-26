package org.example;

import java.util.Scanner;

public class Screens {

    public static String homeScreen() {
        return """
                HOME SCREEN
                =========== D) Add Deposit 
                =========== P) Make Payment(Debit) 
                =========== L) Ledger 
                =========== X) Exit 
                Enter your choice:
                """;
    }

    public static String depositScreen() {
        return """
                DEPOSIT SCREEN
                ========= 1) Show deposit amount
                ========= 2) Display deposits from current month
                ========= 3) Enter the deposit source
                ========= 4) Enter the deposit vendor
                """;
    }

    public static String paymentScreen() {
        return """
                PAYMENT SCREEN
                ========= 1) Enter payment amount
                ========= 2) Enter the payment recipient
                ========= 3) Enter the payment description
                ========= 4) Enter the payment vendor
                """;
    }

    public static String ledgerScreen() {
        return """
                LEDGER SCREEN
                ========== A) Display all entries
                ========== D) Display deposits only
                ========== P) Display payments only
                ========== R) Show additional Reports
                ========== H) Home
                """;

    }

    public static String reportScreen() {
        return """
                Reports Screen
                ========== 1) Month To Date
                ========== 2) Previous Month 
                ========== 3) Year To Date
                ========== 4) Previous Year
                ========== 5) Search by Vendor
                ========== 0) Back
                """;

        System.out.println("Select from these choices below:");







    public static void showHomeScreen(){ boolean appGo = true;
            while (appGo) {

                // Show the user the menu
                String homeScreen = homeScreen();
                System.out.println(homeScreen);

                // Get the user input
                String homeScreenOption;
                homeScreenOption = inputScanner.nextLine();
            }

    }

                """
        }}
        boolean appGo = true;
        while (appGo) {

            // Show the user the menu
            String homeScreen = homeScreen();
            System.out.println(homeScreen);

            // Get the user input
            String homeScreenOption;
            homeScreenOption = inputScanner.nextLine();

            // Decide what to do with it
            switch (homeScreenOption.toUpperCase()) {
                case "D":
                    System.out.print(depositScreen());
                    break;
                case "P":
                    System.out.print(paymentScreen());
                    break;
                case "L":
                    System.out.print(ledgerScreen());
                    appGo = false;
                    break;

                case "X":
                    System.out.println("Extract over a quarter million");
                    appGo = false;
                    break;
                default:
                    System.out.println("Error. please try again");
                    break;
            }
        }
    }
}
