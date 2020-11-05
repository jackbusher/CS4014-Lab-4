import java.util.*;
public class TestBankAccount {
    public static void main() {        
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        CurrentAccount curAcc1 = new CurrentAccount(1,500,200);
        CurrentAccount curAcc2 = new CurrentAccount(2,842,350);
        SavingsAccount savAcc1 = new SavingsAccount(3,217.50);
        SavingsAccount savAcc2 = new SavingsAccount(4,1200);
        
        list.add(curAcc1);
        list.add(curAcc2);
        list.add(savAcc1);
        list.add(savAcc2);
        
        curAcc1.setAnnualInterestRate(3);
        
        curAcc1.deposit(200);
        curAcc1.withdraw(100);
        
        curAcc2.deposit(158);
        curAcc2.withdraw(600);
        
        savAcc1.deposit(1200);
        savAcc1.withdraw(400);
        
        savAcc2.deposit(50);
        savAcc2.withdraw(700);
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}