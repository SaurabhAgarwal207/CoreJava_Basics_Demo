package com.makeyoupro.basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scan = new Scanner (System.in);
        int num= scan.nextInt();
        int n=num;
        int mod,sum=0;
        while(num>0){
            mod=num%10;
            sum=sum+(mod*mod*mod);
            num=num/10;
        }
        if(sum==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
