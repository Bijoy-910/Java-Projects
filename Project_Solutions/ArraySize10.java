package com.Project17;

public class ArraySize10 {
        public static void main(String[] args) {
            // Create an empty array of size 10
            int[] arr = new int[10];

            // Initialize index variables
            int index2 = 0;
            int index3 = 0;
            int index5 = 0;

            // Loop through values 1 to 30 and add to the array
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    arr[index2] = i;
                    index2++;
                } else if (i % 3 == 0) {
                    arr[5 + index3] = i;
                    index3++;
                } else if (i % 5 == 0) {
                    arr[8 + index5] = i;
                    index5++;
                }
            }

            // Print the array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

