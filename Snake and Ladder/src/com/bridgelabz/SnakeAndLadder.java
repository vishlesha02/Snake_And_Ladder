package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {

        int playerPosition = 0;

        System.out.println("Initial Player Position : " + playerPosition);
        Random random = new Random();


        while(playerPosition != 10) {

            int dieRoll = random.nextInt(6) + 1;
            System.out.println("Player rolled the die and got a : " + dieRoll);

            int option = random.nextInt(3);
            System.out.println("Option to be followed : " + option);

            switch (option) {
                case 0:
                    System.out.println("No Play");
                    playerPosition += 0;
                    System.out.println("Players Current Position : " + playerPosition);

                    break;

                case 1:
                    System.out.println("Ladder");
                    playerPosition += dieRoll;
                    System.out.println("Move ahead by " + dieRoll + " blocks");
                    System.out.println("Players Current Position : " + playerPosition);
                    break;

                case 2:
                    System.out.println("Snake");
                    playerPosition -= dieRoll;
                    if(playerPosition < 0)
                    {
                        playerPosition = 0;
                    }
                    System.out.println("Move back by " + dieRoll + " blocks");
                    System.out.println("Players Current Position : " + playerPosition);
                    break;

            }

        }
    }
}
