package com.Project17;

public class MissingAPNumber {
    public static void main(String[] args)
    {
        int arr[] = {2, 4, 8, 10, 12, 14};
        System.out.println("The missing number is:" +findMissingNumber(arr));
    }
    public static int findMissingNumber(int arr[]){
        int n = arr.length;
        int diff = (arr[n - 1] + arr[0])/n;
        int i = arr[0];

        for( int a : arr)
        {
            if(a != i)
            {
                return i;
            }
            i = i+diff;
        }
        return i;
    }
}
