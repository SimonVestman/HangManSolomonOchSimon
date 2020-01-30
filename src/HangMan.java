/*
This is the part of the game where you choose if you want to play against a other player or the computer
Made by Simon Vestman
This program was created 2020-01-23
 */

import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {

        //Chose singel or multiplayer
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play against an other player or a computer");
        String Gamemode = sc.nextLine();
        if (Gamemode.equalsIgnoreCase("player")) {
            //Singelplayer begins
            System.out.println("You are now playing against an other player");
            boolean win = false;
            int numguess = 0;

            System.out.println("Player 1 can now enter the secret word!");
            String word = sc.nextLine();
            while(numguess <7) {
                char[] secret = word.toCharArray();
                System.out.println("Player 2 can now guess!");
                char guess = sc.next().charAt(0);
                for (char c : secret) {
                    System.out.println(c);

                    boolean contains = false;
                    for (char v : secret) {
                        if (v == guess) {
                            contains = true;
                            break;
                        }
                    }if(!contains) {
                        numguess++;
                        System.out.println("The letter you guessed isn't in the word!");
                    }
                }
            }

        } else if (Gamemode.equalsIgnoreCase("computer")) {
            //Multiplayer begins
            System.out.println("You are now playing against a computer");
        }
    }
}
