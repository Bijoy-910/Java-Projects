package com.Project17;

public class EvenNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,7,90,43,34,56,7,2,3,1,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 ==0)
            {
                System.out.println("The even number are: "+arr[i]);
                sum += arr[i];
            }
        }
        System.out.println("The sum of even number are: "+sum);
    }
}
