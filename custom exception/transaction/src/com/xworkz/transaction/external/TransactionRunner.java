package com.xworkz.transaction.external;

import com.xworkz.transaction.internal.Transaction;

public class TransactionRunner {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
//        transaction.checkCancel("cancel");
        transaction.checkCancel("can");
//        transaction.checkFailed("fail");
        transaction.checkFailed("pass");
        transaction.checkFound("yes");
//       transaction.checkFound("no");
        transaction.checkProcess("proces");
//       transaction.checkProcess("process");
        transaction.checkTime("morning");
//       transaction.checkTime("evening");
    }
}
