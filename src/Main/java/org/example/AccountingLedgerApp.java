package org.example;

import java.io.IOException;
import java.util.Scanner;

public class AccountingLedgerApp {
    public static void main(String[] args) throws IOException {
        goLedger();
    }

    public static void goLedger() throws IOException {

        Scanner inputScanner = new Scanner(System.in);
        Scanner depositScanner = new Scanner(System.in);


        System.out.println("Hello User here's your Personal Ledger");

        Screens.showHomeScreen(inputScanner);
        Screens.showledgerScreen(inputScanner);
        Screens.showreportsScreen(inputScanner);

















    }

}
