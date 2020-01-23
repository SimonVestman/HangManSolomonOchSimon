/*
This is the part of the game where you choose if you want to play against a other player or the computer
Made by Simon Vestman
This program was created 2020-01-23
 */

import java.util.Scanner;

public class HangMan {
    public static  void main (String [] args){

    //Chose singel or multiplayer
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play against a other player or a computer");
        String Gamemode = sc.nextLine();
        if(Gamemode.equalsIgnoreCase("player")) {
            //Singelplayer begins
            System.out.println("You are now playing against an other player");
            boolean win = false;
            String temp = "";
            String hold = "";
            String guessed = "";

            System.out.println("Player 1 can now enter the secret word!");
                String w = sc.nextLine();
                do {
                    System.out.println("Player 2 can now guess!");
                    String guess = sc.nextLine();
                } while (){
            }

        } else if (Gamemode.equalsIgnoreCase("computer")){
            //Multiplayer begins
                System.out.println("You are now playing against a computer");
        }
    }
}
