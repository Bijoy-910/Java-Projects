package com.Project17;

class primeNumber {
    public static void main(String[] args) {
        int count = 0;
        primeNumber pm = new primeNumber();
        for (int i = 0; i <= 100; i++)
        {
            System.out.println("The prime number from 1 to 100:" + checkPrime(i));
            if (pm.checkPrime(i) == 1)
            {
                count++;
            }
        }
        System.out.println("The number of prime number between 1 to 100 are:" + count);
    }

    public static int checkPrime(int n)
    {

        if (n == 0 || n == 1)
        {
            System.out.println(n + " is not a prime number ");
        }
        else
        {
            for (int i = 2; i <= n-1; i++)
            {
                if (n % i == 0)
                {
                    System.out.println(n + " is not prime number ");
                    return 0;

                }
            }
        }
        return 1;
    }
}



