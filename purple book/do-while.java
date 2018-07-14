package com.company;
//do-while, enter a positive integer and calculate from 1 to 10

import java.util.*;

public class App4_8 {
    public static void main(String[] args) {
        int n, i = 1, sum = 0;
        Scanner buf = new Scanner(System.in);
        do {
            System.out.print("please enter positive integer");
            n = buf.nextInt();
        } while (n <= 0);

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("1+2+...+" + n + "=" + sum);

    }
}


