package org.example;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

import static org.example.ledgerScreen.*;
import static org.example.Transaction.*;

public class homeScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Welcome to your Personal Ledger!
                """);

        while (true) {
            System.out.println("""
                    HOME SCREEN
                    =========== D) Add Deposit 
                    =========== P) Make Payment(Debit) 
                    =========== L) Ledger 
                    =========== X) Exit 
                    Enter your choice:
                    """);

            String input = userInputs(scanner);

            switch (input.toUpperCase()) {
                case "D":
                    addDeposit(scanner);
                case "P":
                    addPayment(scanner);
                case "L": {
                    progressBar();
                    ledgerMenu(scanner);
                }
                case "X": {
                    System.out.println("""
                            Exiting, Thank You!
                            """);
                    System.exit(5);
                }
                default:
                    System.out.println("Error. Try Again");
            }
        }
    }

    private static void addPayment(Scanner scanner) {
        System.out.println("""
                Make Your Payment
                """);

        System.out.println(" Enter your payment date as: YYYY-MM-DD:");
        LocalDate dateInput = userDateInput(scanner);

        System.out.println("Enter the time: (HH:MM) ");
        LocalTime timeInput = usertimeInput(scanner);


        System.out.println("Enter the vendor name:");
        String vendor = userInputs(scanner);

        System.out.println("Enter the description of your payment:");
        String description = userInputs(scanner);

        System.out.println("Now enter your payment amount:");
        double amount = userDoubleInputs(scanner) * -1;

        savetransactions(fileName);
        Transaction newPayment = new Transaction(dateInput, timeInput, description, vendor, amount);
        transactions.add(newPayment);
        transactions.csv(fileName);

        System.out.println("You've entered: " + "\n" + newPayment);
        System.out.println("Thank you! Going back to previous screen...\n");
    }

    private static void addDeposit(Scanner scanner) {
        System.out.println("""
                Let's make a deposit
                """);

        System.out.println(" Enter your deposit date as: YYYY-MM-DD:");
        LocalDate dateInput = userDateInput(scanner);

        System.out.println("Enter the time: (HH:MM) ");
        LocalTime timeInput = usertimeInput(scanner);


        System.out.println("Enter the vendor name:");
        String vendor = userInputs(scanner);

        System.out.println("Enter the description of your deposit:");
        String description = userInputs(scanner);

        System.out.println("Now enter your deposit amount:");
        double amount = userDoubleInputs(scanner);

        Transaction newDeposit = new Transaction(dateInput, timeInput, description, vendor, amount);
        transactions.add(newDeposit);

        System.out.println("You've entered: " + "\n" + newPayment);
        saveTransaction(filename);
        System.out.println("Thank you! Going back to previous screen...\n");
    }

    public static String userInputs(Scanner scanner) {
        return scanner.nextLine().trim();
    }

    public static double userDoubleInput(Scanner scanner) {
        while (true) {
            try {
                double doubleInput = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("You entered: " + doubleInput);

                return doubleInput;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

    public static LocalDate userDateInput(Scanner scanner) {
        while (true) {
            try {
                LocalDate dateInput;

                String dateInput1 = userInputs(scanner);
                dateInput = LocalDate.parse(dateInput1);

                System.out.println("You entered: " + dateInput1);
                return dateInput;
            } catch (Exception e) {
                System.out.println("Error. Use the format yyyy-MM-dd");
            }
        }
    }

}

    public static LocalTime userTimeInput(Scanner scanner) {
        LocalTime timeInput;
        while (true) {
            try {
                String timeInput1 = userInputs(scanner);
                timeInput = LocalTime.parse(timeInput1);

                System.out.println("You entered: " + timeInput1);
                return timeInput;
            } catch (Exception e) {
                System.out.println("Error. Use the format HH:mm");
            }
        }
    }

}