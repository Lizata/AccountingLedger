package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
public class Reports {

public static String reportsScreen() throws IOException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please choose from these viable options:");
    System.out.println("1) View Month To Date");
    System.out.println("2) View Previous Month");
    System.out.println("3) View Year To Date");
    System.out.println("4) View Previous Year");
    System.out.println("5) Search By Vendor");
    System.out.println("0) Back- return to previous screen");
    System.out.print("Enter your option:");

    int choice = scanner.nextInt();

    switch(choice) {
        case 1:
            // Handle "Month To Date" report
            //Display transactions for the current month
            int caseOneCurrentMonth = LocalDate.now().getMonthValue();
            BufferedReader caseOneReader = new BufferedReader(new FileReader("transactions"));
            // DisplayTransactionMonthHistory(caseOneReader, CaseOneCurrentYear, CaseOneCurrentMonth, Case
            break;
        case 2:
            // Handle "Year To Date" report
            // Display transactions for the current year
            break;
        case 3:
            // Handle "Previous Month" report
            // Display transactions for
    }
return "";  // todo fix this
}


}
