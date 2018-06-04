package com.company.ex2;

public class Number {

    public static final int DIGIT = 10;
    public static final int MINPRIMENUMBER = 2;

    public static int getMaxNum(int number){
        int temp = 0;
        number = number > 0 ? number : -number;

        while (number > 0){

           if (number % DIGIT > temp){

               temp = number % DIGIT;

           }
            number /= DIGIT;
        }

        return temp;
    }

    public static boolean getPalindrom(int number){
        int temp = number;
        int backward = 0;
        number = number > 0 ? number : -number;

        while (temp > 0){

            backward = backward * DIGIT + temp % DIGIT;
            temp /= DIGIT;

        }

         return backward == number;
    }

    public static boolean getPrimeNumber(int number){
        number = number > 0 ? number : -number;

        for (int i = MINPRIMENUMBER; i < number; i++){

            if (number % i == 0){

                return false;

            }
        }
        return true;
    }

    public static String getDevisors(int number){
        String response = "All the prime devisors: ";
        int temp = 0;
        number = number > 0 ? number : -number;

        for (int i = MINPRIMENUMBER; i <= number; i++){

            if (number % i == 0){

                if (getPrimeNumber(i)){
                    temp = i;
                    response += "(" + temp + ")";
                }
            }
        }

        return temp == 0 ? "There are no one prime devisor" : response;

    }

    //Residual algorithm
    public static int getNod(int a, int b) {
        int temp;

        while (b != 0) {

            temp = b;

            b = a % b;

            a = temp;
        }
        return a;
    }

    public static int getNok(int a,int b){

        return a * b / getNod(a,b);

    }

    public static int getCountDifferentNumbers(int number) {
        int count = 0;
        number = number > 0 ? number : -number;

        for (int i = number; i > 0; i--) {
            int tempNumber = number;

            while (tempNumber > 0) {

                if (tempNumber % DIGIT == i) {
                    count++;
                    break;
                }

                tempNumber /= DIGIT         ;
            }
        }

        return count;

    }

}
