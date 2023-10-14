package com.Project17;

public class count {
    public static void main(String[] args) {
        int n =123456;
        int count = 0;
        while(n != 0)
        {
            n =n/10;
            count++;
        }
        System.out.println("the number "+n+" is "+count+" times.");
    }
}
