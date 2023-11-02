package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {

    private LocalDate date;

    private LocalTime time;
    private String description;
    private String vendor;
    private double amount;

    public Transaction(LocalDate dateInput, LocalTime timeInput, String inputDescription, String inputVendor, double inputAmount) {
        this.date = dateInput;
        this.time = timeInput;
        this.description = inputDescription;
        this.vendor = inputVendor;
        this.amount = inputAmount;
    }

    public LocalDate getTransactionDate() {
        return date;
    }

    public void setTransactionTime(LocalTime timeInput) {
        this.time = timeInput;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public void setVendor(String inputVendor) {
        this.vendor = inputVendor;
    }
    public void setAmount(double inputAmount) {
        this.amount = inputAmount;
    }

    @Override
    public String toString() {
        return "Date: " + date + "\n" +
                "Time: " + time + "\n" +
                "Description: " + description + "\n" +
                "Vendor: " + vendor + "\n" +
                "Amount: " + amount;


    }

}

