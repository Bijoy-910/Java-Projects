package com.Project17;

public class MultipleMissingArrayNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8,10,11,13};
        int register[] = new int[arr[arr.length-1]+1];
        for (int n:arr)
        {
            register[n] =1;
        }
        for (int i=1;i< register.length;i++)
        {
            if (register[i] == 0)
            {
                System.out.println("The missing number are: "+i);
            }
        }
    }
}
