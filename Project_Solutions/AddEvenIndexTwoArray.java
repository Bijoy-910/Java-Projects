package com.Project17;

public class AddEvenIndexTwoArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {2,4,6,8,1,3,5,7,9};
        int sum[] = new int[9];

       for(int i = 0 ;i<= arr1.length-1;i++)
       {
           if(arr1[i] % 2 == 0 && arr2[i] % 2 == 0)
               {
                   sum[i] = arr1[i] + arr2[i];
               }
       }
       for(int j =0;j<= sum.length-1;j++)
       {
           System.out.print(sum[j]+" ");
       }

    }

}
