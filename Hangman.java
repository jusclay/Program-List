import java.util.Scanner;

/**
Justin Clayton
COSC221
This program will simulate the hang man game.
It will allow the user 5 chances to guess the secret word
*/
public class Hangman{
   public static void main(String args[]){
      //creates an object of type scanner
      Scanner keyboard = new Scanner(System.in);
      //array with with word to be guessed
      String secretWord[] = {"c","o","u","g","h"};
      //array that holds letter guessed by player
      String playerWords[] = {"x","x","x","x","x"};
            
      System.out.println("Welcome to the hangman game. You will have 5 chances to guess the secret word.");
      System.out.println("Good Luck!");
      // loop will execute for the length of the array
      for(int i = 0; i < secretWord.length; i++)
      {
         //prompts user to a guess of the letter
         System.out.print("Please enter your guess, you have " + (secretWord.length - i) + " chances left ");
         // accept user input
         String guess = keyboard.nextLine();
         
         
         //loops to the length of the array
         for(int c = 0; c < secretWord.length; c++)
         {
            //compares users guess values of secretWord array
            if(guess.equalsIgnoreCase(secretWord[c]))
            {
               //assigns correctly guessed values form secretWord array to playerWords array
               playerWords[c] = secretWord[c];
            }
         }
         //calls method that shows letters guess from secret word so far
         guessedSoFar(playerWords); 
         }
      //calls method that check the winner
      checkWinOrLose(secretWord, playerWords);
                 
   }
   
      
   /** Displays what has been guessed from the secret word to this point*/
   public static void guessedSoFar(String playerWords[])
   {
      //displays what has been guessed so far from the seceret word
      System.out.print("Guessed so far ");
      for(int c2 = 0; c2 < playerWords.length; c2++){
         System.out.print(playerWords[c2]);
      }
      System.out.println();
   }
   /** Checks if the user guessed the word or not*/
   public static void checkWinOrLose(String playerWords[], String secretWord[]){
      
      int checkEqual = 0;
      //runs loops to length of array
      for(int c = 0; c < playerWords.length; c++){
         //checks if contents of both arrays match
         if(playerWords[c].equalsIgnoreCase(secretWord[c])){
            checkEqual++;
         }
       }  
       //displays whether player won or lost
       if(checkEqual == 5)
         System.out.println("Congratulations you guesses the secret word!");
       else
         System.out.println("I'm sorry, you did not guess the secret word");
            
   }
   
}      
 