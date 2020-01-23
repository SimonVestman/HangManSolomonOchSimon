/*
This is the part of the game where you choose if you want to play against a other player or the computer
Made by Simon Vestman
This program was created 2020-01-23
 */

import java.util.Scanner;

public class HangMan {
    public static  void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play against a other player or a computer");
        String Gamemode = sc.nextLine();

        if(Gamemode.equalsIgnoreCase("player")) {
            System.out.println("You are now playing against an ohter player");

        } else if (Gamemode.equalsIgnoreCase("computer")){
                System.out.println("You are now playing against a computer");
        }
    }
}
