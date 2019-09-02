/*
 * Name:            Jose Ramirez
 * 
 * Program:         Mathematics Game - Java Project 1
 * 
 * Description:     This program asks the user for the number of questions they 
 *                  want to play (1-10) and the type of operation they want the 
 *                  questions to be. Then generates random number math questions. 
 *                  At the end of the game, displays the score and letter grade
 *                  the user earned based on the correct answers.
 * 
 * Date Started:    3/09/2018
 * Last Modified:   3/11/2018
 * 
 */

package ramirez;

import java.util.Scanner;
import java.util.Random;

public class MathematicsGame 
{
    public static void main(String[] args) 
    {   
        // input object for the user
        Scanner userInput = new Scanner(System.in);
        // random number object
        Random  ranNum    = new Random();
        
        // holds the user answer
        int userAnswer;
        // holds the number of chances the user has
        int numChances;
        // counter for each iteration within the loop
        int loopCounter = 1;
         // holds the user game score
        int userScore   = 0;
        // calculates and holds the user results
        int gameResultPercentage;
        
        // string object to hold the user's operation choice
        String userChoice    = new String();
        // string object to hold the user's decision to continue playing
        String continueYesNo = new String();
        
        System.out.println("Welcome to the Mathematics Game!\n");
        
        // continue loop
        do
        {
            continueYesNo = "";
            System.out.print("\nHow many chances would you like to play (1 - 10): \n");

            numChances = (int)userInput.nextByte();

            System.out.println("\nPlease enter the math operation for the game: \n");

            System.out.println("Enter \"+\" for addition.");
            System.out.println("Enter \"-\" for substraction.");
            System.out.println("Enter \"*\" for multiplication.");

            userChoice = userInput.next();
            
            // operations loop
            do
            {
                switch (userChoice)
                {
                    case "+": int sumFirstNum  = (int)(ranNum.nextFloat()*10 + 1);
                              int sumSecondNum = (int)(ranNum.nextFloat()*10 + 1);
                          
                              System.out.print("Question #" + loopCounter  + " " 
                                                            + sumFirstNum  + " + " 
                                                            + sumSecondNum + " = ");
                          
                              userAnswer = (int)userInput.nextByte();
                          
                              if ((sumFirstNum + sumSecondNum) == userAnswer)
                              {
                                  ++userScore;
                                  System.out.print("Correct!\n");
                              }
                              else
                              {
                                  System.out.print("This is incorrect.\n");
                              }

                              break;
                          
                    case "-": int subFirstNum  = (int)(ranNum.nextFloat()*10 + 1);
                              int subSecondNum = (int)(ranNum.nextFloat()*10 + 1);

                              System.out.print("Question #" + loopCounter  + " " 
                                                            + subFirstNum  + " - " 
                                                            + subSecondNum + " = ");

                              userAnswer = (int)userInput.nextByte();

                              if ((subFirstNum - subSecondNum) == userAnswer)
                              {
                                  ++userScore;
                                  System.out.print("Correct!\n");
                              }
                              else
                              {
                                  System.out.print("This is incorrect.\n");
                              }
                              
                              break;
                          
                    case "*": int mulFirstNum  = (int)(ranNum.nextFloat()*10 + 1);
                              int mulSecondNum = (int)(ranNum.nextFloat()*10 + 1);

                              System.out.print("Question #" + loopCounter  + " " 
                                                            + mulFirstNum  + " * " 
                                                            + mulSecondNum + " = ");

                              userAnswer = (int)userInput.nextByte();

                              if ((mulFirstNum * mulSecondNum) == userAnswer)
                              {
                                  ++userScore;
                                  System.out.print("Correct!\n");
                              }
                              else
                              {
                                  System.out.print("This is incorrect.\n");
                              }
                              
                              break;
                          
                    default : System.out.println("Invalid Choice");
                              break;
                }
            
                ++loopCounter;
            
            } while(loopCounter <= numChances);
        
            System.out.println("\nYou answered " + userScore + " questions correctly.");
            System.out.println(numChances - userScore + " questions were incorrect. \n");
            
            // percent calculation
            gameResultPercentage = (int)((double)userScore/numChances * 100);
            
            // decision statement to get the socore
            if (gameResultPercentage > 90)
            {
                System.out.println("Your score is " + gameResultPercentage + "% and " +
                                   "your letter grade is an A!\n");
            }
            else if(gameResultPercentage > 80)
            {
                System.out.println("Your score is " + gameResultPercentage + "% and " +
                                   "your letter grade is a B!\n");
            }
            else if(gameResultPercentage > 70)
            {
                System.out.println("Your score is " + gameResultPercentage + "% and " +
                                   "your letter grade is a C!\n");
            }
            else
            {
                System.out.println("Your score is " + gameResultPercentage + 
                                   "%, you have failed the game.\n");
            }
            
            // resetting the variables if the user continues
            loopCounter          = 1;
            userScore            = 0;
            gameResultPercentage = 0;
            numChances           = 0;
            userAnswer           = 0;
            
            System.out.println("Would you like to play again Y/N?\n");
            
            continueYesNo = userInput.next();
            
        } while(continueYesNo.equals("Y") || continueYesNo.equals("y")); 
        
        System.out.println("Thank you for playing, we hope you come back again.\n");
 
    } // end main
} // end class
    

