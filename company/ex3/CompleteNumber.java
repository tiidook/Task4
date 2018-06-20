package com.company.ex3;

import com.company.ex2.Number;

public class CompleteNumber {

    public static boolean checkPerfectNumber(int number) {
        int complete = 0;
        int count = number / 2;
        if (!Number.getPrimeNumber(number)) {

            for (int i = 1; i <= count; i++) {

                if (number % i == 0) {
                    complete += i;
                }
            }
            return complete == number;
        }
        return false;
    }
}
