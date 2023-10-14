package com.Project17;

public class AsciValueAtoZ {
    public static void main(String[] args) {
        char CapitalChar = 'A';
        char SmallCharacter = 'a';

        for (int i='A'; i<='Z';i++)
        {
            System.out.println(CapitalChar+":"+i);
            CapitalChar++;
        }
        for (int i='a'; i<='z';i++)
        {
            System.out.println("   "+SmallCharacter+":"+i);
            SmallCharacter++;
        }
    }
}
