package com.company.ex1;

import java.util.Random;

public class HeadsOrTails {

    public static final int HEAD = 0;
    public static final int TRAIL = 1;
    public static final int CountOfCasts = 1000;

    public static String getHeadsTrails() {
        int head = 0;
        int trail = 0;

        Random random = new Random();

        for (int i = 0; i < CountOfCasts; i++) {

            if (random.nextInt(TRAIL - HEAD + TRAIL) + HEAD == TRAIL){

                trail += 1;

            }else {

                head += 1;

            }

        }

        return "Сount of heads: " + head + " Count of trails: " + trail;
    }

}


