package com.Project17;

public class FactorialRecursion {
    int fact = 1;
    public static void main(String[] args) {
        int num = 6;
        FactorialRecursion fr =  new FactorialRecursion();
        System.out.println("The factorial of num "+num+" is: "+ fr.calFact(num));
    }
    public int calFact(int num)
    {
        if(num>1)
        {
            fact = fact*num;
            calFact(num-1);
        }
        return fact;
    }

}
