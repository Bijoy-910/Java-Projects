package com.Project17;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(PowerOf2(n));
    }
    public static int PowerOf2(int n)
    {
        if((n & (n - 1)) == 0)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
}
