package com.makeyoupro.basics;

import java.util.Scanner;
/*
In this program we are using charAt method.
We can also convert String to char array then iterate over it.
Another way could be using StringBuffer and StringBuilder , as both classes contains
inbuilt method reverse
 */
public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter String to Reverse");
        Scanner scan = new Scanner(System.in);
        String s= scan.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("Reverse of "+s+" is : "+rev);
    }
}
