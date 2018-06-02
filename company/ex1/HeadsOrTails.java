package com.company.ex1;

import java.util.Random;

public class HeadsOrTails {

    public static final int HEAD=0;
    public static final int TRAIL=1;

    public static String getHeadsTrails() {

        int head=0,trail=0;
        int check=0;
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {

            check=random.nextInt(TRAIL-HEAD+TRAIL)+HEAD;
            if (check==TRAIL){

                trail+=1;

            }else{

                head+=1;

            }

        }

        return "Сount of heads: " + head + " Count of trails: " + trail;
    }


}


