package com.Project17;

public class MissingNumberArray {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,6,7,8,9};
        int expectedNumber = arr.length+1;
        int sum = 0;
        int totalSum = expectedNumber*(expectedNumber+1)/2;
        for (int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("Missing number in array is: "+(totalSum-sum));
    }
}
