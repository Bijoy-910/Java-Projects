package com.Project17;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = fibonacci(n);
        System.out.println(result);
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prevPrev = 0;
        int prev = 1;
        int current = 0;
        for (int i = 2; i <n; i++) {
            current = prev + prevPrev;
            prevPrev = prev;
            prev = current;
        }
        return current;
    }
}
