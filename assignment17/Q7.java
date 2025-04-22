package assignment17;

public class Q7 {
    public class BankAccount{
        private String accountHolder;
        private double accountNumber;
        private double balance;

        public double getBalance() {
            return balance;
        }

        public BankAccount(String accountHolder, double accountNumber, double balance){
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public void amountDeposit(double depoMoney){
            balance = balance+depoMoney;
        }
        public void amountWithdrawl(double withMoney){
            if(balance<withMoney){
                System.out.println("Insufficient Balance");

            }
            else{
                balance=balance-withMoney;
            }
        }
        public void displayDetails(){
            System.out.println("Account Holder Name : " + accountHolder);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Account Balance : " + balance);
        }
    }
    public static void main(String[] args){
        Q7 q7 = new Q7();
        BankAccount ba1 = q7.new BankAccount("Khushal Khaitan", 123456781, 300000);
        BankAccount ba2 = q7.new BankAccount("Megha Khaitan", 123456782, 400000);
        ba1.amountWithdrawl(100);
        System.out.println(ba1.getBalance());

    }
}
