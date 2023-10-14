package com.Project17;

public class SwapNumber {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swapping a is: "+a);
        System.out.println("Before swapping b is: "+b);
        //By using third variable we are swapping the number
//        int t;
//        t=a;
//        a=b;
//        b=t;
//        System.out.println("After swapping a is :"+a);
//        System.out.println("After swapping b is: "+b);
        //Without using third variable
        a =a + b;
        b =a - b;
        a =a - b;
        System.out.println("After swapping a is:" +a);
        System.out.println("After swapping b is:" +b);
    }
}
