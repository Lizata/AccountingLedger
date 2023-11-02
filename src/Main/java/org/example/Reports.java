package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
public class Reports {

public static String reportsScreen() throws IOException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("""
            "Please choose from these viable options:");
               1) View Month To Date");
               2) View Previous Month");
               3) View Year To Date");
               4) View Previous Year");
               5) Search By Vendor");
               0) Back- return to previous screen");
               Enter your option:
                        
            """);

    int choice = scanner.nextInt();

    switch(choice) {
        case "1": ReportsScreen.filterByPresentMonth(transactions);
            // Handle "Month To Date" report
            //Display transactions for the current month
            int caseOneCurrentMonth = LocalDate.now().getMonthValue();
            BufferedReader caseOneReader = new BufferedReader(new FileReader("transactions.csv"));
            // DisplayTransactionMonthHistory(caseOneReader, CaseOneCurrentYear, CaseOneCurrentMonth, Case
            break;
        case "2": ReportsScreen.filterByPreviousMonth(transactions);
            // Handle "Year To Date" report
            // Display transactions for the current year
            break;
        case "3":  ReportsScreen.filterByYear(transactions);
            // Handle "Previous Month" report
            // Display transactions for
    }
return "";  // todo fix this
}


}
