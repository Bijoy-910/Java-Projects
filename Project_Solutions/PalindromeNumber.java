package com.Project17;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Palindrome number:");
        int n = sc.nextInt();
        int rev = 0, rem;
        int temp = n;
        while (temp !=0)
        {
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if (rev == n)
        {
            System.out.println(n+" is a Palindrome number.");
        }
        else
            System.out.println(n+" is not a Palindrome number.");
    }
}
