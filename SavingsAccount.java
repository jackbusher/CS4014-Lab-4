public class SavingsAccount extends BankAccount {
    
    public SavingsAccount(int id, double balance) {
        super(id,balance);
    }
    public void withdraw(double amount) {
          if(getBalance() >= amount) {
              super.withdraw(amount);
            }
    }
        
    public String toString() {
        return super.toString();
    }    
    }

