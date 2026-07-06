public class BankAccount {

    String accountHolder = "Arun";
    int accountNumber = 12345;
    double balance = 50000;

    void display() {

        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);

    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.display();

    }
}