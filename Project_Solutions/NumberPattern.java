package com.Project17;

import java.util.Scanner;

public class NumberPattern{
        public static void printPattern(int n) {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);

                }
                for(int j=i-1;j>=1;j--) {
                    System.out.print(j);

                }
                System.out.print(" ");
            }
        }
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the numbers:");
            int n = s.nextInt();
            printPattern(n);
        }
}

