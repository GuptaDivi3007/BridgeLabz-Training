package com.testCase.TestCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
     @Test
     void testDepositValidAmount() {
    	 Bank bank=new Bank(1000);
    	 bank.deposit(500);
    	 assertEquals(1500,bank.getBalance());
     }
     @Test
     void testDepositNegativeAmount() {
    	 Bank bank=new Bank(1000);
    	 Exception exception = assertThrows(
                 IllegalArgumentException.class,
                 () -> bank.deposit(-200)
         );
    	 assertEquals("Deposit amount cannot be negative",exception.getMessage());
     }
     @Test
     void testWithdrawValidAmount() {
    	 Bank bank=new Bank(1500);
    	 bank.withdraw(500);
    	 assertEquals(1000,bank.getBalance());
     }
     @Test
     void Test_Withdraw_InsufficientFunds() {
    	 Bank bank=new Bank(1000);
    	 Exception exception=assertThrows(IllegalArgumentException.class,()->bank.withdraw(1500));
    	 assertEquals("Insufficient balance",exception.getMessage());
     }
}
