package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int initialPosition = 0;

        System.out.println("Initial Player Position : " + initialPosition);
        Random random =new Random();
        int dieRoll = random.nextInt(6);
        System.out.println("After Rolling the Die " + dieRoll);

    }
}
