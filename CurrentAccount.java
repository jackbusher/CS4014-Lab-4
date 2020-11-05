public class CurrentAccount extends BankAccount {
    private double odLimit;
    public CurrentAccount(int id, double balance,double odLimit) {
        super(id,balance);
        this.odLimit = odLimit;
    }
    
    public void withdraw(double amount) {
          if(getBalance() - amount >=  0-odLimit) {
              super.withdraw(amount);
            }
    }
    
    public String toString() {
        return super.toString();
    }
}