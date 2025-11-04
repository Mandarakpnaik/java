package com.xworkz.arithmetic.external;

import com.xworkz.arithmetic.bridge.*;

public class ArithmeticRunner {
    public static void main(String[] args) {
        Addition addition=(number1, number2) -> number1+number2;
        long add=addition.add(789,12345);
        System.out.println("Addition :"+add);

        Division division=((number1, number2) -> number1/number2);
        int divide=division.division(18,2);
        System.out.println("Division :"+divide);

        Divide function=(a, b) -> a/b;
        long divid=function.division(93456,83456);
        System.out.println("Division :"+divid);

        Mod mod =(a, b) -> a%b;
        float modulo=mod.modulo(18.3f,11.2f);
        System.out.println("Mod of a and b :"+modulo);

        Modular modular=(num1, num2) -> num1%num2;
        int modu=modular.modulo(5,3);
        System.out.println("modulo :"+mod);

        Multiplication multiplication=((value1, value2) -> value1*value2);
        int multi=multiplication.multiplication(389,490);
        System.out.println("Multiplication :"+multi);

        Multi multis=(a, b) -> a*b;
        double num=multis.multi(890.45,934.2);
        System.out.println("Multi :"+num);

        Sub sub=((number1, number2) -> number1-number2);
        float minus=sub.substation(73.4f,34.4f);
        System.out.println("Substation :"+minus);

        Subtraction substation=(a, b) -> a-b;
        double subs=substation.sub(2045.56,34.32);
        System.out.println("Sub :"+sub);
        Sum addi=((a , b) ->a+b);
        int sum=addi.addition(15,2);
        System.out.println("Addition of two number :"+sum);







    }
}
