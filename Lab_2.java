package com.company;


public class Lab_2 {

    public static void Lab_2(String[] args) {
        final int a = 5;
        long SumMax = 0;
        long SumMin = 0;
        long minValue;
        long maxValue;
        long[][] matrix = new long[][]
                {
                        {8, 3, 4, 12},
                        {1, 6, 9, 11},
                        {2, 7, 5, 10},
                        {4, 8, 1, 15}
                };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= a;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("\n");

        for (int j = 0; j < 4; j++) {
            if ((j + 1) % 2 == 1) {
                minValue = Long.MAX_VALUE;
                for (int i = 0; i < 4; i++) {
                    minValue = (long) Math.min(minValue, matrix[i][j]);
                }
                SumMin += minValue;
            }

            if ((j + 1) % 2 == 0) {
                maxValue = Long.MIN_VALUE;
                for (int i = 0; i < 4; i++) {
                    maxValue = (long) Math.max(maxValue, matrix[i][j]);
                }
                SumMax += maxValue;
            }

        }

        System.out.printf("%1s - сума найменших елементів в стовпцях матриці з непарними номерами\n", SumMin);
        System.out.printf("%1s - сума найбільших елементів в стовпцях матриці з парними номерами ", SumMax);
    }
}
