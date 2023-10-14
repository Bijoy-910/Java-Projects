package com.Project17;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String original = sc.nextLine();
        String temp = " ";

        for (int i = original.length();i>=0;i--)
        {
            temp = temp+original.charAt(i);
        }
        if(original.equals(temp))
        {
            System.out.println(original+" is a palindrome string.");
        }
        else {
            System.out.println(original+ " is not a palindrome string");
        }

    }
}
