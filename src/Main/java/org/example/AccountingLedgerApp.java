package org.example;

import java.util.Scanner;

public class AccountingLedgerApp {
    public static void main(String[] args) {
        goLedger();
    }

    public static void goLedger() {

        Scanner inputScanner = new Scanner(System.in);


        System.out.println("Hello User here's your Personal Ledger");

        Screens.showHomeScreen(inputScanner);
    }

}
