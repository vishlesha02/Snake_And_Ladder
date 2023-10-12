package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {

        int initialPosition = 0;

        System.out.println("Initial Player Position : " + initialPosition);
        Random random =new Random();
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("Player rolled the die and got a : " + dieRoll);


        int option= random.nextInt(3);
        System.out.println("Option to be followed : "+ option);

        switch (option) {
            case 0:
                System.out.println("No Play" );
                initialPosition += 0;
                System.out.println("No moves : " + initialPosition);
                break;
            case 1:
                System.out.println("Ladder");
                initialPosition += dieRoll;
                System.out.println("Move ahead by " + initialPosition + " blocks");
                break;
            case 2:
                System.out.println("Snake");
                initialPosition -= dieRoll;
                System.out.println("Move back by " + initialPosition + " blocks");
                break;

        }
        System.out.println("Players Current Position : " + initialPosition);
    }
}
