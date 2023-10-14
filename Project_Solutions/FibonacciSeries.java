package com.Project17;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print("The fibonacci series is ");
        for(int i =0;i<=10;i++)
        {
            int c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
