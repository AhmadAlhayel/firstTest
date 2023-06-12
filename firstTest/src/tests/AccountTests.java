package tests;

import bank.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTests {
    private Account account;

    @BeforeEach
    public void setup(){
        account = new Account(1000.0, 123456789);
    }

    @Test
    public void testDepositPositiveAmount() {
        // Test depositing a positive amount
        account.deposit(500.0);
        double expectedBalance = 1500.0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void testDepoistZeroAmount(){
        // Test depositing zero amount
        account.deposit(0.0);
        double expectedBalance = 1000.0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void testDepistNegaitveAmount(){
        // Test depositing a negative amount
        account.deposit(-100);
        double expectedBalance = 1000.0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void testWithdrawPositiveAmount(){
        // Test withdrawing a positive amount
        account.withdraw(500.0);
        double expectedBalance = 500.0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void testWithdrawNegaitveAmount(){
        // Test withdrawing a negative amount
        account.withdraw(-200.0);
        double expectedBalance = 1000.0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void testWithdrawZeroAmount(){
        // Test withdrawing zero amount
        account.withdraw(0.0);
        double expectedBalance = 1000.0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void testWithdrawOverdraft() {
        // Test withdrawing an amount exceeding the balance (overdraft)
        account.withdraw(1500.0);
        double expectedBalance = 1000.0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
}
