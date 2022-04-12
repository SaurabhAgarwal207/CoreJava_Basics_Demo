package com.makeyoupro.basics;

import java.util.Scanner;
//Scanner input
public class ScannerInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scan.nextInt();
        System.out.println("Enter your name/String");
        String name = scan.next();
        System.out.println("Integer :"+ num+" String : "+name);
    }
}
