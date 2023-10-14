package com.Project17;

public class ProgramMatrix {
    public static void main(String[] args) {
        int matrix [][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("The original matrix: ");
        for (int i=0;i<3;i++)
        {
         for (int j=0;j<3;j++)
         {
             System.out.print(matrix[i][j]+ " ");
         }
            System.out.println();
        }
        System.out.println("The reversed matrix: ");
        for (int i=0;i<3;i++)
        {
            for (int j=2;j>=0;j--)
            {
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
