package org.example;


public class lab1 {
    public static void main(String [] args) {
        long a = 1;
        long b = 3;
        int c = 1;
        long i;
        long j;
        long n = 5;
        long m = 7;
        long result = 0;


        if (n < a || m < b ) {
            System.out.println("Incorrect values");
        } else if (a <= -c && n >= -c) {
            System.out.println("Example contains division by zero");
        } else {
            for (i = a; i < n; i++) {
                long denominator = i + c;
                for (j = b; j < m; j++) {
                    result += ((i + j) / denominator);

                }
            }
            System.out.println(result);
        }
    }
}