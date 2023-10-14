package com.Project17;

public class ReverseArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Original array: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.print("Reverse array:");
        for (int i= arr1.length-1;i >= 0;i--)
        {
            System.out.print(" "+arr1[i]);
        }
//        int i = arr1.length-1;
//        while(i>=0)
//        {
//            System.out.print(" "+arr1[i]);
//            i--;
//        }
    }
}
