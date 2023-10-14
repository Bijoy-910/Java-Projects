package com.Project17;

public class Array {
    public static void main(String[] args) {
        int arr[] = {19,10,44,3,11,129};

        for(int j=0; j<= arr.length;j++)
        {
            if(j % 5 == 4)
            {
                System.out.println("The elements of this loop are :"+ j);
            }
        }
        for(int i:arr)
        {
            if(i % 5 == 4)
            {
                System.out.println("The elements are:"+ i);
            }
        }
    }
}
