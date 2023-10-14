package com.Project17;

import java.util.HashSet;

public class RemoveDuplicateUnsortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,7,10,11,8,8,10,4,4,5,3,2,2,9,9,6};
        //Using HashSet we can remove duplicate element in an array both sorted and Unsorted array
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i< arr.length;i++)
        {
            hs.add(arr[i]);
        }
        for(int unsortedArray: hs)
        {
            System.out.print(" "+ unsortedArray);
        }

    }
}
