package com.Project17;

public class ReverseSentence {
        public static void main(String args[]) {
        String str[] = "guy. gandu a is Junior and Yubraj".split(" ");
        int length = str.length;
        String rev = " ";
        for(int i= length-1; i>=0;i--)
        {
            rev = rev + str[i]+" ";
        }
            System.out.println("The reverse sentence is:"+rev);
        }
}
