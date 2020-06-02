package com.company;

public class Main {

    public static void main(String[] args) {
        double s = 0;
        char a = 3, b = 3, n = 6, m = 10;
        final int C = 2;

        if (a <= C && C <= n) {
            System.out.println("Division by Zero");
            return;
        }
        for (char i = a; i <= n; i++) {
            for (char j = b; j <= m; j++) {
                s += (double) (i * j) / (i - C);

            }
        }
        System.out.println("S = " + s);
    }
}
