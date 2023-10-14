package com.Project17;

public class AscendingNumber {
    public static void main(String[] args) {
        int arr[] = {10,8,9,11,5,4,2,77,0,1,3,34,7,6};
        int temp;
        for(int i =0;i< arr.length;i++)
        {
            for(int j= i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i:arr)
        {
            System.out.println("Ascending order array are: "+i);
        }
    }
}
