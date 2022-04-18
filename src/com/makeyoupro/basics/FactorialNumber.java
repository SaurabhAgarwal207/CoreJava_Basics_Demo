package com.makeyoupro.basics;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter number");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int fact=1;
        for(int i=2;i<=num;i++)
            fact=fact*i;
        System.out.println("Factorial of "+num+" is : "+fact);
    }
}
