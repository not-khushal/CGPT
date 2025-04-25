package assignment18;

public class Q12 {
    public static class BankAccount{
        public String accountNumber;
        protected String accountName;
        private double balance;

        public double getBalance(){
            return balance;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public void displayDetails(){
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Account Holder Name : " + accountName);
            System.out.println("Account Balance : " + balance);
        }
    }
    public class SavingsAccount extends BankAccount{
        public SavingsAccount(String accountNumber, String accountName, double balance){
            this.accountNumber = accountNumber;
            this.accountName = accountName;
            setBalance(balance);
        }
    }
    public static void main(String[] args){
        Q12 q12 = new Q12();
        BankAccount ba1 = q12.new SavingsAccount("125344213456", "Khushal Khaitan", 600000);
        ba1.displayDetails();
    }

}
