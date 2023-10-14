package com.Project17;

public class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,45,4,56,2,46,4};

        for(int i=0; i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate elements is: "+ arr[j]);
                }
            }
        }
    }
}
