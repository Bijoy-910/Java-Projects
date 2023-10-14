package com.Project17;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the armstrong number:");
        n = sc.nextInt();
        int temp1 = n;
        int len=0;
        while(temp1 != 0)
        {
            len = len + 1;
            temp1 = temp1/10;
        }
        int temp2 = n;
        int rem ;
        int sum = 0;
        while(temp2 !=0)
        {
            rem = temp2 %10;
            int mul = 1;
            for(int i = 1;i<=len;i++)
            {
                mul = mul*rem;
            }
            sum = sum + mul;
            temp2 = temp2/10;
        }
        if(n==sum)
        {
            System.out.println(n+" is a armstrong number");
        }
        else {
            System.out.println(n+" is not a armstrong number");
        }
    }
}
