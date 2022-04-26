package com.bridgelabz;

import javax.swing.text.Position;
import java.util.Random;

public class SnakeAndLadder {

    //Initialization of Ending Wining Position is fixed to 100
    public static final int Ending_Wining_Position = 100;

    public static void main(String[] args) {
        //Display Welcome Message
        System.out.println("Welcome to the Snake And Ladder Game :-) ");
//          Initialization of the Single player position is Starts with 0
        int SingPlyrPos = 0;

        int DiesCount =0;
        Random random = new Random();
       for (SingPlyrPos = 0; SingPlyrPos<=Ending_Wining_Position;) {
           int dies = random.nextInt(6) + 1;
           System.out.println("Number on dies =" + dies);
           System.out.println(DiesCount++);

        /*Generating random option for checks
        Options to check Player Plays or not
        or Ladder
        And Last option is to check Snake
         */
           //To check the condition via if else

           int opt = random.nextInt(3);

        /*Applying if Condition
        If Condition checks the obj is == 1 Prints the Ladder
        Single Player position is equal to Single player Position plus die no
        then prints the Single player position
         */

           if (opt == 1) {
               System.out.println("Ladder");
               SingPlyrPos = SingPlyrPos + dies;
               System.out.println("Now The Single Player Position is :- " + SingPlyrPos);
               if (SingPlyrPos+dies <= Ending_Wining_Position){

                   SingPlyrPos=SingPlyrPos+dies;
               }else {
                   SingPlyrPos=SingPlyrPos;
               }
           }
        /*Applying else Condition
        else Condition Prints the Snake
         */
           else {
               System.out.println("Snake");
               if (SingPlyrPos -dies > 0){
                   SingPlyrPos =SingPlyrPos-dies;
               }else{
                   SingPlyrPos=0;
               }

//         Again checks the if else condition
               /*Single player position is minus dies is greater than equal to zero
               then Single player position is equal to single player position minus dies
               otherwise its starts with single player position

                */
           }
           System.out.println("Now The Single Player Position is :- " + SingPlyrPos);

       }
        System.out.println("Total Moves :- " + DiesCount);
    }

}

