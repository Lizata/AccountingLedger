package org.example;

import java.io.IOException;
import java.util.Scanner;

import static org.example.Reports.reportsScreen;

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
                Enter your choice:
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
                Enter your choice:
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
                Enter your choice:
                 
                """;


    }

    public static void showHomeScreen(Scanner scanner) {
        boolean appGo = true;
        while (appGo) {

            // Show the user the menu
            String homeScreen = homeScreen();
            System.out.println(homeScreen);

            // Get the user input
            String homeScreenOption;
            homeScreenOption = scanner.nextLine();

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
        while (!appGo) ;

    }

    private static void printErrorMessage() {
        System.out.println("I didn't catch that, please try again");
    }

    public static void showledgerScreen(Scanner inputScanner) {
        boolean appGo = false;
        do {
            String ledgerScreen = ledgerScreen();
            System.out.println(ledgerScreen);

            switch (ledgerScreen) {
                case "A":
                    System.out.println("Display all entries");
                    break;
                case "D":
                    System.out.println("Display deposits only");
                    break;
                case "P":
                    System.out.println("Display payments only");
                    break;
                case "R":
                    System.out.println("Show additional Reports");
                    break;
                case "H":
                    System.out.println("Return to Home");
                case "F":
                    appGo = true;
                    break;
                default:
                    printErrorMessage();
                    break;
            }
        } while (appGo);
    }

    public static void showreportScreen(Scanner inputScanner) throws IOException {
        boolean appGo = true;
        do {
        }  while(appGo);
            String reportsScreen = reportsScreen();
            System.out.println(reportsScreen);

            switch (reportsScreen) {
                case "1":
                    System.out.println("Month To Date");
                    break;
                case "2":
                    System.out.println("Previous Month");
                    break;
                case "3":
                    System.out.println("Year To Date");
                    break;
                case "4":
                    System.out.println("Previous Year");
                    break;
                case "5":
                    System.out.println("Search By Vendor");
                    break;
                case "0":
                    System.out.println("Back");
                    appGo = true;
                    break;
                default:


            }
        }
public static void showdepositsScreen(Scanner inputScanner) {
    boolean appGo = true;
    do {
    } while (appGo);
    String depositScreen = depositScreen();
    System.out.println(depositScreen);

    switch (depositScreen) {
        case "1":
            System.out.println("Enter the date of deposit as - yyyy-mm-dd");
            break;
        case "2":
            System.out.println("Enter the time the deposit was made 00:00:00");
            break;
        case "3":
            System.out.println("Enter your deposit description");
            break;
        case"4":
            System.out.println("Enter the Vendor");
            break;
        case "5":
            System.out.println("Enter your deposit amount");

    }
}
}























