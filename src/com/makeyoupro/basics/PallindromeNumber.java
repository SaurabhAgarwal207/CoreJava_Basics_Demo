package com.makeyoupro.basics;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Please Enter Number");
        int num = scan.nextInt();
        int sum=0;
        int n=num;
        while(num>0){
            int m=num%10;
            sum=sum*10+m;
            num=num/10;
        }
        if(sum==n)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}
