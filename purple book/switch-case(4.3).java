package com.company;

public class App4_3 {
    public static void main(String[] args) throws Exception {
        int a = 100, b = 6;
        char operation;
        System.out.print("please enter operation symbol:");
        operation = (char) System.in.read();


        switch (operation)

        {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;


            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;

            case '*':
                System.out.println(a + "*" + b + "=" + (a * b));
                break;

            case '/':
                System.out.println(a + "/" + b + "=" + ((float) a / b));
                break;

            default:
                System.out.print("incorrect input");


        }


    }


}
