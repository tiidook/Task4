package com.company;

import com.company.ex1.HeadsOrTails;
import com.company.ex2.Number;
import com.company.ex3.CompleteNumber;

public class Main {

    public static void main(String[] args) {

        String start="How many Heads and Trails? ";
        View.print(start);

        String response=HeadsOrTails.getHeadsTrails(1000);
        View.print(response);

        int number=5123745;

        View.print("Max number is: " +  Number.getMaxNum(number));

        number=1234321;
        boolean isPalindrom=Number.getPalindrom(number);
        View.print("Is this number " + number + " palindrom? " + isPalindrom);

        number=122;
        boolean isPrime=Number.getPrimeNumber(number);
        View.print("Is this number " + number + " prime? " + isPrime);

        number=123;
        System.out.println(Number.getDevisors(number));


        System.out.println("Nod = " + Number.getNod(10,24));
        System.out.println("Nok = " + Number.getNok(10,24));

        number=1274785;
        View.print("Number is " + number + " count of different numbers= " + Number.getCountDifferentNumbers(number));

        number =6 ;
        View.print("Number is " + number + " is it complete number " + CompleteNumber.checkPerfectNumber(number));
        number =28;
        View.print("Number is " + number + " is it complete number " + CompleteNumber.checkPerfectNumber(number));
        number =496;
        View.print("Number is " + number + " is it complete number " + CompleteNumber.checkPerfectNumber(number));
        number =638;
        View.print("Number is " + number + " is it complete number " + CompleteNumber.checkPerfectNumber(number));





    }
}
