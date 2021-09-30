package org.nathan.javabasics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerChoice;
        int cpuChoice;
        int rounds;
        int round;
        int ties;
        int wins;
        int losses;

        while(true){
            System.out.println("How many rounds would you like to play for? (1-10)");
            rounds = Short.parseShort(scanner.nextLine());
            round = 0;
            ties = 0;
            wins = 0;
            losses = 0;
            if(rounds < 1 || rounds > 10){
                System.out.println("Error: game length out of range.");
                break;
            }
            while (round < rounds) {
                while (true) {
                    System.out.println("Round " + (round + 1) + ": (1) Rock, (2) Paper, or (3) Scissors?");
                    playerChoice = Short.parseShort(scanner.nextLine());
                    if (playerChoice != 1 && playerChoice != 2 && playerChoice != 3) {
                        System.out.println("Please enter a valid selection");
                        continue;
                    }
                    break;
                }
                System.out.println("You" + choiceName(playerChoice));

                cpuChoice = random.nextInt(3) + 1;
                System.out.println("The computer" + choiceName(cpuChoice));

                switch (playerWin(playerChoice, cpuChoice)) {
                    case 0:
                        System.out.println("Unlucky, you lost...");
                        losses++;
                        break;
                    case 1:
                        System.out.println("Congratulations! You won!");
                        wins++;
                        break;
                    case 2:
                        System.out.println("No winner, that was a tie.");
                        ties++;
                        break;
                }
                round++;
            }
            System.out.println("Game over! You won " + wins + " times, lost " + losses + " times, and tied " + ties + " times.");
            System.out.println("Play again? y/n");
            char again = scanner.nextLine().charAt(0);
            if(again == 'n'){
                System.out.println("Thanks for playing!");
                break;
            }else if(again == 'y'){
                continue;
            }
            break;//happens if the user does not choose y or n when asked whether to continue
        }
    }

    public static int playerWin(int choice, int cpu){
        int result = choice - cpu;
        if(result == 1 || result == -2){
            return 1;
        } else if (result == 0){
            return 2;
        } else{
            return 0;
        }
    }

    public static String choiceName(int choice){
        if(choice == 1){
            return " chose ROCK";
        }else if(choice == 2){
            return " chose PAPER";
        }else if(choice == 3){
            return " chose SCISSORS";
        }else{
            return "ERROR";
        }
    }
}
