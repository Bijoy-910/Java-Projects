package com.Project17;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Bijoy";
        int length = str.length();
        String rev = "";
        for(int i = length-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("The reverse string is: "+rev);
    }
}
