package com.Project17;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which is divisible by 10: ");
        int n = sc.nextInt();

        if(n%10 == 0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
