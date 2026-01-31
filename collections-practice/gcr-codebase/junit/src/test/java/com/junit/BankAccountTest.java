package com.junit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.BankAccount;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000); 
    }
    @Test
    void testDeposit() {

        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }
    @Test
    void testWithdraw() {

        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }
    @Test
    void testWithdrawInsufficientFunds() {

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
    }
}
