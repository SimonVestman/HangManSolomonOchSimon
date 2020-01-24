/*
This is the part of the game where you choose if you want to play against a other player or the computer
Made by Simon Vestman
This program was created 2020-01-23
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
            String temp = "";
            String hold = "";
            String guessed = "";

            System.out.println("Player 1 can now enter the secret word!");
            String word = sc.nextLine();
            do {
                System.out.println("Player 2 can now guess!");
                String guess = sc.nextLine();
                for (int i = 0; i < word.length(); i++) {
                    if (guess.equals(Character.toString(word.charAt(i)))) {
                        hold = Character.toString(temp.charAt(i)).replace("-", guess); // något fel här
                        temp = temp.substring(0, i) + hold + temp.substring(i + 1, temp.length());
                    }
                }
                numguess++;
                win = true;
                System.out.println(temp);
                if (temp.equals(word)) {
                    System.out.println("You guessed the word right!" + "\n" + word);
                    break;
                }

            } while (numguess < 7);

        } else if (Gamemode.equalsIgnoreCase("computer")) {
            //Multiplayer begins
            System.out.println("You are now playing against a computer");
        }
    }
}
