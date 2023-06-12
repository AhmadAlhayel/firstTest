package bank;

public class Account {
    private double balance;
    private int accountNumber;

    public Account(double initialCash, int accountNumber){
        this.balance = initialCash;
        this.accountNumber = accountNumber;
    }

    public void deposit(double cash){
        if (cash > 0){
            // If the cash amount is positive, add it to the balance
            balance += cash;
            System.out.println("Insätning lyckades. Nytt saldo: " + balance);
        } else {
            System.out.println("Fel belopp för insättning.");
        }
    }

    public void withdraw(double cash) {
        if (cash > 0 && cash <= balance){
            // If the cash amount is positive and not exceeding the balance, subtract it from the balance
            balance -= cash;
            System.out.println("Uttag lyckades. Nytt saldo: " + balance);
        } else {
            System.out.println("Fel belopp eller otillräckligt saldo.");
        }
    }

    public double getBalance(){
        // Return the current balance
        return balance;
    }

    public int getAccountNumber(){
        // Return the account number
        return accountNumber;
    }
}
