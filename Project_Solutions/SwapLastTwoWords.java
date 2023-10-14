package com.Project17;

public class SwapLastTwoWords {
    public String LastTwo(String str) {
        if (str.length() < 2)
            return str;
        return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
    }
    public static void main(String[] args) {
        SwapLastTwoWords swp = new SwapLastTwoWords();
        String str = "Coding";
        System.out.println("The given string is:" + str);
        System.out.println("The last two word swap string is: "+swp.LastTwo(str));
    }
}

