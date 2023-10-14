package com.Project17;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "RajeevPriyaa";
        System.out.println("Actual string: "+str);
        String result = checkString(str);
        System.out.println(" String after removing duplicate values:" +result);
    }
    public static String checkString(String str)
    {
        String str1 =" ";

        for (int i=0; i<str1.length();i++)
        {
            char ch = str.charAt(i);
            if(str1.indexOf(ch) == -1)
            {
                str1  = str1 + ch;
            }

        }
        return str1;
    }
}
