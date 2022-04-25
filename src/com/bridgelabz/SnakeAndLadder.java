package com.bridgelabz;

import javax.swing.text.Position;
import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake And Ladder Game :-) ");
//          Initialization of the Single player position is Starts with 0
        int SingPlyrPos = 0;
        Random random = new Random();
        int die = random.nextInt(6) + 1;

        /*Generating random option for checks
        Options to check Player Plays or not
        or Ladder
        And Last option is to check Snake
         */
        //To check the condition via if elseif

        int obj = random.nextInt(3);

        /*Applying if Condition
        If Condition checks the obj is == 0 Prints the Ladder
        Single Player position is equal to Single player Position plus die no
        then prints the Single player position
         */

        if (obj == 0) {
            System.out.println("Ladder");
            SingPlyrPos = SingPlyrPos + die;
            System.out.println("Now The Single Player Position is :- " + SingPlyrPos);
        }
        /*Applying else if Condition
        else If Condition checks the obj is == 1 Prints the Snake
        Single Player position is equal to Single player Position Minus die no
        then prints the Single player position
         */
        else if (obj == 1) {
            System.out.println("Snake");
            SingPlyrPos = SingPlyrPos - die;
            System.out.println("Now The Single Player Position is :- " + SingPlyrPos) ;
        }
        // Else condition Print the Nobody will play the game
        else {
            System.out.println("Random Function chooses the No Player Plays the Game Option");
            System.out.println("Nobody Play The Game");
            SingPlyrPos = SingPlyrPos;
            System.out.println("Now The Single Player Position is :- " + SingPlyrPos) ;
        }


    }
}
