package com.makeyoupro.basics;

import java.util.Scanner;

public class FibonanciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println("enter size");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=num;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
