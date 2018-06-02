package com.company.ex2;

public class Number {

    public static final int Digit=10;

    public static int getMaxNum(int number){

        int temp=0;

        while (number>0){

           if(number%Digit>temp){

               temp=number%Digit;

           }
            number/=Digit;
        }

        return temp;
    }

    public static boolean getPalindrom(int number){

        int temp=number;
        int backward =0;

        while (temp>0){

            backward=backward*Digit+temp%Digit;
            temp/=Digit;

        }

         return backward==number;
    }

    public static boolean getPrimeNumber(int number){

        boolean isPime=true;

        for (int i=2;i<number;i++){

            if (number%i==0){

                isPime=false;
                break;

            }
        }
        return isPime;
    }

    public static String getDevisors(int number){

        String response = "All the prime devisors: ";
        int temp=0;

        for (int i=2;i<=number;i++){

            if(number%i==0){

                if(getPrimeNumber(i)){
                    temp=i;
                    response+="(" + temp + ")";
                }
            }
        }

        if(temp==0){

            response = "There are no one prime devisor ";
        }

        return response;

    }

    //Residual algorithm
    public static int getNod(int a, int b) {

        int temp=0;
        while (b != 0) {

            temp = b;

            b = a % b;

            a = temp;
        }
        return a;
    }

    public static int getNok(int a,int b){

        return a*b/getNod(a,b);

    }

    public static int getCountDifferentNumbers(int number) {
        int count=0;
        int tempNumber;

        for (int i = number;i>0;i--) {
            tempNumber=number;
            while (tempNumber > 0) {
                if (tempNumber % Digit == i) {
                    count++;
                    break;
                }
                tempNumber /= Digit;
            }
        }

        return count;

    }




}
