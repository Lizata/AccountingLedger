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
 public void setTransactionDate(LocalDate setDate){this.date = setDate;}

 public void setTransactionTime(String timeInput){this.time = LocalTime;}
 public void setDescription(String description){this.description = setDescription();
  public void setVendor(String inputVendor)


  }




 }
}



