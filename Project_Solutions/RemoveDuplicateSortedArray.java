package com.Project17;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5,6,6};
        int temp[] = new int [arr.length];
        int j=0;
        for(int i=0;i< arr.length-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                temp[j] = arr[i];
                j++;
            }
            temp[j] = arr[arr.length-1];
        }
        for(int arr1: temp)
        {
            System.out.print(" "+arr1);
        }

        //Using another method to remove duplicate element
//        for(int i=0;i< arr.length-1;i++)
//        {
//            if(arr[i] != arr[i+1])
//            {
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//        arr[j] = arr[arr.length-1];
//        for(int i=0;i<j+1;i++)
//        {
//            System.out.print(" "+arr[i]);
//        }
    }
}
