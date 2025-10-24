package com.xworkz.bankAccount.external;

import com.xworkz.bankAccount.internal.SavingsAccount;

public class BankRunner {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.displaySavings();
    }
}
