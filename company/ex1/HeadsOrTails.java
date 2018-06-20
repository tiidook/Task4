package com.company.ex1;

import java.util.Random;

public class HeadsOrTails {

    public static String getHeadsTrails(int countOfCasts) {
        int trail = 0;
        Random random = new Random();

        for (int i = 0; i < countOfCasts; i++) {

            if (random.nextBoolean()){
                trail += 1;
            }

        }
        return  "trails: " + trail + " heads: " + (countOfCasts - trail);
    }

}


