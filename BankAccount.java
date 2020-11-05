import java.util.*;
import java.time.LocalDate;
public class BankAccount {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private LocalDate dateCreated;
    public BankAccount(int id,double balance) {
        this.id = id;
        this.balance = balance;
    }    
    public void setID (int id){
        this.id = id;
    }   
    public void setBalance (double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate (double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public static double getAnnualInterestRate (){
        return annualInterestRate;
    }
    public int getID (){
        return id;
    }
    public double getBalance (){
        return balance;
    }
    public LocalDate getDate() {
        this.dateCreated = LocalDate.now();
        return dateCreated;
    }
    public double getMonthlyInterest() {
        double monthlyInterest= annualInterestRate/12;
        return monthlyInterest;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void deposit(double amount) {
     balance = balance + amount;   
    }
    public String toString() {
        return "ID:" + getID() +", Balance:€" + getBalance() + ", Date created:" + getDate() +", Annual Interest Rate:" + getAnnualInterestRate()+"%";
    }
}