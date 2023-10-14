package com.Project17;

public class OddNumberSum {
    public static void main(String[] args) {
        int arr[] = {1,6,8,3,4,2,5,6,7,13,10,16,23};
        int sum = 0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2 !=0)
            {
                System.out.println("The odd number are: "+ arr[i]);
                sum = sum+arr[i];
            }
        }
        System.out.println("The sum of odd numbers are: "+ sum);
    }
}
