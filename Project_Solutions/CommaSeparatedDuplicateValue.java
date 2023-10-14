package com.Project17;

import java.util.Objects;

public class CommaSeparatedDuplicateValue {
    public static void main(String[] args) {
        String[] str = {"1","2","3","6","8","3","6","9","7","12","11","10"};
        int arr[] = new int[str.length];

        String temp;
        for(int i=0;i< str.length-1;i++)
        {
            for(int j=0;j< str.length-i-1 ;j++)
            {
                int n = Integer.parseInt(str[j]);
                int m = Integer.parseInt(str[j+1]);
                if(n>m)
                {
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }

        for(int i=0;i< str.length;i++) {
            System.out.print(str[i] + " ,\n");
        }



       for(int i=0;i<str.length-1;i++)
        {
            if(str[i] != str[i +1])
            //if(!Objects.equals(str[i], str[i + 1]))
            {
                System.out.print(" "+str[i]+",");

            }
            str[i] = str[str.length-1];
        }
    }
}

