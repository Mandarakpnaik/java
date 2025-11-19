package com.xworkz.transaction.internal;

import com.xworkz.transaction.event.*;

public class Transaction {
    public String checkCancel(String result){
        if (result=="cancel"){
            try{
                throw new TransactionCancelledException();
            }catch (TransactionCancelledException transactionCancelledException){
                transactionCancelledException.printStackTrace();
                System.out.println("cancelled");
            }

        }else {
            System.out.println("not cancelled");
        }
        return result;
    }
    public String checkFailed(String value) {
        if (value=="fail"){
            try{
                throw new TransactionFailedException();

            }catch (TransactionFailedException transactionFailedException){
                transactionFailedException.printStackTrace();
                System.out.println("failed");
            }
        }else {
            System.out.println("not failed");
        }
        return value;

    }
    public String checkFound(String found){
        if (found=="no"){
            try {
                throw new TransactionNotFoundException();

            }catch (TransactionNotFoundException transactionNotFoundException){
                transactionNotFoundException.printStackTrace();
                System.out.println("found");
            }
        }else {
            System.out.println("not found");
        }
        return found;
    }
    public String checkProcess(String status){
        if (status=="process"){
            try {
                throw new TransactionProcessingException();
            }catch (TransactionProcessingException transactionProcessingException){
                transactionProcessingException.printStackTrace();
                System.out.println("processing");
            }
        }else {
            System.out.println("not processing");
        }
        return status;
    }
    public String checkTime(String time){
        if (time=="evening"){
            try{
                throw new TransactionTimeoutException();
            }catch (TransactionTimeoutException transactionTimeoutException){
                transactionTimeoutException.printStackTrace();
                System.out.println("timeout");
            }

        }else {
            System.out.println("not timeout");
        }
        return time;
    }
}
