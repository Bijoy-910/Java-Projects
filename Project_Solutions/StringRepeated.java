package com.Project17;

import java.util.HashMap;
import java.util.Map;

public class StringRepeated {
    public static void main(String[] args) {
        String str []= {"Rolando","Rolando","Messi","Neymar","Neymar","Rolando","Messi"};
//        String [] st = str.split(",");
//
//        Map<String,Integer> strMap = new HashMap<String,Integer>();
//
//        for(String strin:st)
//        {
//            Integer old = strMap.get(strin);
//
//            if(old == null)
//            {
//                old =0;
//            }
//            strMap.put(strin, old+1);
//        }
//        System.out.println(strMap);
        int count = 0;
        //String temp[] = new String[str.length];
        for(int i =0;i< str.length-1;i++)
        {
            for(int j=i+1;j< str.length;j++)
            {
                if((str[i].equals(str[j])) && (i != j) )
                {
//                    System.out.println(str[j]);
                    System.out.println(str[j]+" is "+count+" times");
                    count++;
                }
            }
        }
    }
}
