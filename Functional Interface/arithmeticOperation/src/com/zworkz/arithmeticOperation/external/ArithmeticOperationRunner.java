package com.zworkz.arithmeticOperation.external;

import com.zworkz.arithmeticOperation.bridge.*;

public class ArithmeticOperationRunner {
    public static void main(String[] args) {
        Addition addition=(a, b) -> a+b;
        double add=addition.add(456.89,98334.67);
        System.out.println("Addition :"+add);

        Sum sum =(a, b) -> a+b;
        float additions=sum.sum(33.2f,12.8f);
        System.out.println("Sum :"+additions);

        Multi multi =(a, b) -> a*b;
        long number = multi.multi(457944,24244);
        System.out.println("Multiplication :"+number);

        Multiplication multiplication =(a, b) -> a*b;
        int value =multiplication.multiplication(6789,897);
        System.out.println(value);

        Sub  sub =(a, b) -> a-b;
        double num=sub.sub(567.34,234.56);
        System.out.println("Sub :"+num);

        Subtraction subtraction =(a, b) -> a-b;
        float subtractions=subtraction.sub(56.1f,34.3f);
        System.out.println("Subtraction :"+subtractions);

        Divide divide = (num1, num2) -> num1/num2;
        long divides=divide.divide(78965,98765);
        System.out.println("divide :"+divides);

        Division division =(a, b) -> a/b;
        int numbers=division.division(4532,897);
        System.out.println("Division :"+numbers);

        Mod mod = (a, b) -> a%b;
        int mods=mod.mod(389,56);
        System.out.println("Mod :"+mods);

        Modular modular=(a, b) -> a%b;
        long modulo=modular.mod(6789,1234);
        System.out.println("Modular :"+modulo);
    }
}
