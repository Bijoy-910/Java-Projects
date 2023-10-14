package com.Project17;

public class SecondLargestNumberArray {
    public static void main(String[] args) {
        int arr[] = {6,8,2,4,3,17,1,5};
        int temp=0;
        for(int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The second largest number in an array is: "+arr[1]);
    }
}
