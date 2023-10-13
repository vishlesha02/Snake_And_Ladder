package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {

        int playerPosition = 0;
        int count=0;

        System.out.println("Initial Player Position : " + playerPosition);
        Random random = new Random();

        while(playerPosition != 100) {

            int dieRoll = random.nextInt(6) + 1;
            count++;
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
                    int newPosition = playerPosition + dieRoll;
                    if(newPosition > 100)
                    {
                        System.out.println("Cannot move ahead, You rolled too high");
                    }
                    else {
                        playerPosition = newPosition;
                        System.out.println("Move ahead by " + dieRoll + " blocks");
                    }
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
            System.out.println("-------------------------------------");
        }
        System.out.println("Die rolled to win the game : " + count + " times");
    }
}
