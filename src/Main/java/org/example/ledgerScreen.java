package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
public enum ledgerScreen {


    static void ledgerMenu(Scanner scanner) {
        System.out.println("Welcome To Your Personal Ledger");
        while(true) {
            System.out.println( """
                    please choose your option
                     A) Display All Entries
                     D) Display Deposit Entries
                     P) Display Payments Entries
                     R) Go to Reports Menu
                     H) Return to Home
                    """);

            String input = scanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "A" -> displayLedger();
                case "D" -> displayDeposits();
                case "P" -> displayPayments();
                case "R" -> {
                    reportsMenu(scanner);
                }
                case "H" -> {
                    System.out.println("Returning Home");
                    return;
                }
                default -> System.out.println("Error.Please Try Again");
            }
        }
    }

    private static void displayLedger() {
    System.out.println("""
            Show Entries
            """);
        BufferedReader caseOneReader = new BufferedReader( new FileReader("transactions.csv"));

    System.out.println("""
            Date|Time|Description|Vendor|Amount
            """);

    dateTimeSorter();
    for (Transaction transaction : transactions) {
        System.out.printf("|%s|%s|%-25.20s|%-10.20s|%-12.2f  \n",
                transaction.getDate(),transaction.getTime(), transaction.getVendor(), transaction.getDescription(), transaction.getAmount());
    }
    System.out.println("""
            | | | | |
            """);
}

private static void displayDeposits() {
    System.out.println("""
            Showing Deposits
            """);

    loadtransactions(filename);
    System.out.println("""
            Date|Time|Description|Vendor|Amount
            """);
    dateTimeSorter();
    for (Transaction transaction : transactions) {
        if (0 < transaction.getAmount()) {
            System.out.printf("|%s|%s|%-25.20s|%-10.20s|%-12.2f  \n",
                    transaction.getDate(), transaction.getTime(), transaction.getVendor(), transaction.getDescription(), transaction.getAmount());
        }
    }
    System.out.println("""
            | | | | |
            """);
    private static void displayPayments() {
        System.out.println("""
                Showing payments
                """);
    }
}



