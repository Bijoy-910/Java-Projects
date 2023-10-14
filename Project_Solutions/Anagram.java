package com.Project17;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "RACE";
        String str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length())
        {
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1,c2)){
                System.out.println(str1 +" and "+ str2 +" is an anagram.");;
            }
            else {
                System.out.println(str1 + " and " + str2 + " is not an anagram.");
            }
        }
        else {
            System.out.println(str1 +" and "+ str2 +" is not an anagram.");
        }
    }
}






















//       str1 = str1.toUpperCase();
//       str2 = str2.toUpperCase();
//
//       if(str1.length() == str2.length())
//       {
//           char []c1 = str1.toCharArray();
//           char []c2 = str2.toCharArray();
//
//           Arrays.sort(c1);
//           Arrays.sort(c2);
//           //if(c1.equals(c2))
//           if(Arrays.equals(c1,c2))
//           {
//               System.out.println(str1+" and "+ str2 +" is an anagram.");
//           }
//           else
//           {
//               System.out.println(str1+" and "+ str2 +" is not an anagram.");
//           }
//       }
//       else
//       {
//           System.out.println(str1+ " and " + str2 + " is not an anagram.");
//       }
//    }
//}
