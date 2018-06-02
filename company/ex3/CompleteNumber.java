package com.company.ex3;

public class CompleteNumber {

    public static boolean checkPerfectNumber(int number){

        int count=0;

        for(int i=1;i<number;i++){

            if (number%i==0){

                count+=i;
            }

        }

        return count==number;
    }

}
