package com.bridgelabz;

import javax.swing.text.Position;
import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake And Ladder Game :-) ");
        //Starting Postion of player is Start with 0
        int SingPlyrPos = 0;
        System.out.println("Player Position is:- 0 ");
        System.out.println("So Lets Start the game play ");

        Random random = new Random();
        System.out.println("The Player is rolling a die With a good Expetation :-) ");
        int die = random.nextInt(6) + 1;
        System.out.println("Dice Will get Random Number is :- " + die);
    }
}
