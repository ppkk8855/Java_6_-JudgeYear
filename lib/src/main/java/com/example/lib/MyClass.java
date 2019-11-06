package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {
        int a=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入西元年");
        a = scanner.nextInt();
        if(a%4!=0)
            System.out.print("閏年:不是");
        else if(a%100!=0)
            System.out.print("閏年:是");
        else if(a%400!=0)
            System.out.print("閏年:不是");
        else
            System.out.print("閏年:是");
    }


}
