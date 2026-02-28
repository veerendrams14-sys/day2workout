class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}
public class Bankaccount1{
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Veerendra", 1000);

        acc1.displayBalance();

        acc1.deposit(500);
        acc1.displayBalance();

        acc1.withdraw(300);
        acc1.displayBalance();

        acc1.withdraw(1500); 
    }
}