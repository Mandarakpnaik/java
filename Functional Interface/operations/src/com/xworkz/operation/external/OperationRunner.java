package com.xworkz.operation.external;

import com.xworkz.operation.bridge.*;

public class OperationRunner {
    public static void main(String[] args) {
        Addition addition=(a, b) -> a+b;
        int add=addition.add(89,90);
        System.out.println("addition :"+add);

        Sum sum =(a, b) -> a+b;
        long num=sum.sum(56788,765);
        System.out.println("Sum of a and b :"+num);

        Sub sub = (a, b) -> a-b;
        float minus=sub.sub(89.2f,21.2f);
        System.out.println("Sub :"+minus);

        Subtraction subtractions=(a, b) -> a-b;
        double number = subtractions.subtraction(421.34,45.23);
        System.out.println("Subtraction :"+number);

        Multi multi=(num1, num2) -> num1*num2;
        int value=multi.multi(290,923);
        System.out.println("multi :"+value);

        Multiplication multiplication =(a, b) -> a*b;
        long multiplications=multiplication.multiplication(78899,22189);
        System.out.println("multiplication :"+multiplications);

        Divide divide = (a, b) -> a/b;
        double divides=divide.divide(89.34,923.45);
        System.out.println("Divide two number :"+divides);

        Division division =(a, b) -> a/b;
        float divisionNumber = division.division(59.3f,19.3f);
        System.out.println("Division :"+divisionNumber);


        Mod mod=(num1, num2) -> num1%num2;
        int mods=mod.mod(3,20);
        System.out.println("Mod of two number :"+mods);

        Modular modular=(a, b) -> a%b;
        long modulars =modular.modular(8993,455789);
        System.out.println("modular :"+modulars);
    }


}
