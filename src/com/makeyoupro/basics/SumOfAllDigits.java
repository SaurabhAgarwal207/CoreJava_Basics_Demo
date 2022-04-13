package com.makeyoupro.basics;

import java.util.Scanner;

public class SumOfAllDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number");
        int num= scan.nextInt();
        int sum=0; int mod;
        while(num>0){
            mod=num%10;
            sum=sum+mod;
            num=num/10;
        }
        System.out.println("Sum of digits is :"+sum);
    }
}
