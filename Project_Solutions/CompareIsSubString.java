package com.Project17;

import java.util.Scanner;

public class CompareIsSubString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        boolean result = isSubstring(str1, str2);
        System.out.println(result);
    }
        public static boolean isSubstring(String str1, String str2) {
            if (str1 == null || str2 == null) {
                return false;
            }
            if (str1.length() < str2.length()) {
                return false;
            }
            int i = 0;
            int j = 0;
            while (i < str1.length() && j < str2.length()) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    j++;
                }
                else {
                    j = 0;
                }
                i++;
            }
            return (j == str2.length());
            //return isSubstring(str1, str2);
        }
}
