package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {

        int playerPosition = 0;
        int playerPosition2 = 0;
        int count=0;

        boolean player1Won = false;
        boolean player2Won = false;

        System.out.println("Initial 1st Player  Position : " + playerPosition);
        System.out.println("Initial 2nd Player  Position : " + playerPosition2);

        Random random = new Random();

        while (!player1Won && !player2Won) {

            for (int i = 1; i <= 2; i++) {

                if(i == 1)
                {
                    System.out.println("1st Player ");
                }
                else
                {
                    System.out.println("2nd Player");
                }

                int dieRoll = random.nextInt(6) + 1;
                count++;
                System.out.println("Player rolled the die and got a : " + dieRoll);

                int option = random.nextInt(3);
                System.out.println("Option to be followed : " + option);

                switch (option) {
                    case 0:
                        if(i == 1) {
                            System.out.println("No Play");
                            playerPosition += 0;
                            System.out.println("1st Player Current Position : " + playerPosition);
                        }
                        else {
                            System.out.println("No Play");
                            playerPosition2 += 0;
                            System.out.println("2nd Player Current Position : " + playerPosition2);
                        }
                        break;

                    case 1:
                        if(i == 1) {
                            System.out.println("Ladder");
                            int newPosition = playerPosition + dieRoll;
                            if (newPosition > 100) {
                                System.out.println("Cannot move ahead, You rolled too high");
                            } else {
                                playerPosition = newPosition;
                                System.out.println("Move ahead by " + dieRoll + " blocks");

                                if(newPosition == playerPosition + dieRoll)
                                {
                                    System.out.println("Player gets extra chance due to ladder");
                                    i--;
                                }
                            }
                            System.out.println("1st Player Current Position : " + playerPosition);
                        }
                        else {
                            System.out.println("Ladder");
                            int newPosition = playerPosition2 + dieRoll;
                            if (newPosition > 100) {
                                System.out.println("Cannot move ahead, You rolled too high");
                            } else {
                                playerPosition2 = newPosition;
                                System.out.println("Move ahead by " + dieRoll + " blocks");

                                if(newPosition == playerPosition2 + dieRoll)
                                {
                                    System.out.println("Player gets extra chance due to ladder");
                                    i--;
                                }
                            }
                            System.out.println("2nd Player Current Position : " + playerPosition2);
                        }
                        break;

                    case 2:
                        if(i == 1) {
                            System.out.println("Snake");
                            playerPosition -= dieRoll;
                            if (playerPosition < 0) {
                                playerPosition = 0;
                            }
                            System.out.println("Move back by " + dieRoll + " blocks");
                            System.out.println("1st Player Current Position : " + playerPosition);
                        }
                        else {
                            System.out.println("Snake");
                            playerPosition2 -= dieRoll;
                            if (playerPosition2 < 0) {
                                playerPosition2 = 0;
                            }
                            System.out.println("Move back by " + dieRoll + " blocks");
                            System.out.println("2nd Player Current Position : " + playerPosition2);                        }
                        break;

                }
                System.out.println("-------------------------------------");

                if (playerPosition == 100) {
                    System.out.println("Player 1 wins!");
                    player1Won = true;
                    break;
                } else if (playerPosition2 == 100) {
                    System.out.println("Player 2 wins!");
                    player2Won = true;
                    break;
                }
            }
        }

        System.out.println("Die rolled to win the game : " + count + " times");
    }
}
