package com.Project17;

import java.util.*;

    public class DoublyPrime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (isDoublyPrime(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }

        public static boolean isDoublyPrime(int n) {
            Set<Integer> factors = new HashSet<>();
            int d = 2;
            while (d * d <= n) {
                while (n % d == 0) {
                    factors.add(d);
                    n /= d;
                }
                d++;
            }
            if (n > 1) {
                factors.add(n);
            }
            return factors.size() == 2 && isPrime(factors);
        }

        public static boolean isPrime(int n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isPrime(Set<Integer> factors) {
            for (int factor : factors) {
                if (!isPrime(factor)) {
                    return false;
                }
            }
            return true;
        }
    }

