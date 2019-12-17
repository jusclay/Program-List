import java.util.Scanner;
import java.util.Random;

/**
COSC 220
Justin Clayton
Assignment #9
Purpose: This program provides the user with a list of superheroes. Each super hero has 3 abilities. These abilities are given Random values.
The random value determines rankind which decides the winner of the match.*/

public class SuperHeroGame
{
   /**This program provides the user with a list of superheroes. Each super hero has 3 abilities. These abilities are given Random values.
The random value determines rankind which decides the winner of the match.*/
   
   public static void main(String args[])
   {
   
      // Name of super heros
      String jamaicaMan = "Jamaica Man";
      String agilityMan = "Agility Man";
      String boltMan = "Bolt Man";
      String stickyMan = "Sticky Man";
      String waterMan = "Water Man";
      String fireMan = "Fire Man";
      String gorjoGirl = "Gorjo Girl";
      
      // Holds Fighter's ability Power value
      int strengthFighter1;
      int strengthFighter2;
      int speedFighter1;
      int speedFighter2;
      int agilityFighter1;
      int agilityFighter2;
      
      // Holds Total combined power value
      int totalPower1;
      int totalPower2;
      
      // Hold Total wins, losses and draws
      int f1Win = 0;
      int f2Win = 0;
      int draw = 0;
   
         
      // hold keyboard input
      int input;
      int input1;
      int input2;
   
      // Creats object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      // Created object to accept Random number
      Random randomPowerLevel = new Random();

      //Repeat until 0 is entered
      do
      {
               // Fighter options
               System.out.println(" 1. Jamaica Man");
               System.out.println(" 2. Agility Man");
               System.out.println(" 3. Bolt Man");
               System.out.println(" 4. Sticky Man");
               System.out.println(" 5. Water Man");
               System.out.println(" 6. Fire man");
               System.out.println(" 7. Gorjo Girl");
               System.out.println();
               System.out.println("Please enter the number of your superhero:");
               input1 = keyboard.nextInt();
               
               // Determines which hero user has chosen to use
               switch (input1)
               {
               
                  // User chooses opponent
                  case 1:
                     System.out.println ("You Chose " + jamaicaMan);
                     System.out.println();
                     System.out.println(" 1. Jamaica Man");
                     System.out.println(" 2. Agility Man");
                     System.out.println(" 3. Bolt Man");
                     System.out.println(" 4. Sticky Man");
                     System.out.println(" 5. Water Man");
                     System.out.println(" 6. Fire man");
                     System.out.println(" 7. Gorjo Girl");
                     System.out.println();
                     System.out.println("Please enter the number of your opponent:");
                     input2 = keyboard.nextInt();

                     // Determines what opponent has been chosen
                     switch (input2)
                     {
                        //Decides Winner of match 
                        case 1:
                           System.out.println("Your opponent is " + jamaicaMan);
                           System.out.println();
                           
                           //Runs 7 consecutive matches
                           for (int count = 1; count <= 7; count++ )
                           {
                              //Assigns Random value to fighters ability  
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              // Adds values of abilities to create overall powerlevel
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 System.out.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 System.out.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 2:
                           System.out.println("Your opponent is " + agilityMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        break;
                     
                        case 3:
                           System.out.println("Your opponent is " + boltMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 4:
                           System.out.println("Your opponent is " + stickyMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                                            
                        case 5:
                           System.out.println("Your opponent is " + waterMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        
                        break;
                     
                        case 6:
                           System.out.println("Your opponent is " + fireMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        break;
                     
                        case 7:
                           System.out.println("Your opponent is " + gorjoGirl);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                     }
                  break;
                  
                  case 2:
                     System.out.println ("You Chose " + agilityMan);
                     System.out.println();
                     System.out.println(" 1. Jamaica Man");
                     System.out.println(" 2. Agility Man");
                     System.out.println(" 3. Bolt Man");
                     System.out.println(" 4. Sticky Man");
                     System.out.println(" 5. Water Man");
                     System.out.println(" 6. Fire man");
                     System.out.println(" 7. Gorjo Girl");
                     System.out.println();
                     System.out.println("Please enter the number of your opponent:");
                     input2 = keyboard.nextInt();

                     
                     switch (input2)
                     {
                        case 1:
                           System.out.println("Your opponent is " + jamaicaMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 2:
                           System.out.println("Your opponent is " + agilityMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                           
                        break;
                     
                        case 3:
                           System.out.println("Your opponent is " + boltMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 4:
                           System.out.println("Your opponent is " + stickyMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                                            
                        case 5:
                           System.out.println("Your opponent is " + waterMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        
                        break;
                     
                        case 6:
                           System.out.println("Your opponent is " + fireMan);
                           System.out.println();
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                           
                        break;
                     
                        case 7:
                           System.out.println("Your opponent is " + gorjoGirl);
                           System.out.println();
                              
                              for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                           break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        }
                  break;
                  
                  case 3:
                     System.out.println ("You Chose " + boltMan);
                     System.out.println();
                     System.out.println(" 1. Jamaica Man");
                     System.out.println(" 2. Agility Man");
                     System.out.println(" 3. Bolt Man");
                     System.out.println(" 4. Sticky Man");
                     System.out.println(" 5. Water Man");
                     System.out.println(" 6. Fire man");
                     System.out.println(" 7. Gorjo Girl");
                     System.out.println();
                     System.out.println("Please enter the number of your opponent:");
                     input2 = keyboard.nextInt();

                     
                     switch (input2)
                     {
                        case 1:
                           System.out.println("Your opponent is " + jamaicaMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 2:
                           System.out.println("Your opponent is " + agilityMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        break;
                     
                        case 3:
                           System.out.println("Your opponent is " + boltMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 4:
                           System.out.println("Your opponent is " + stickyMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                                            
                        case 5:
                           System.out.println("Your opponent is " + waterMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();                        
                        
                           break;
                     
                        case 6:
                           System.out.println("Your opponent is " + fireMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 7:
                           System.out.println("Your opponent is " + gorjoGirl);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                     }      
                  break;
                  
                  case 4:
                     System.out.println ("You Chose " + stickyMan);
                     System.out.println();
                     System.out.println(" 1. Jamaica Man");
                     System.out.println(" 2. Agility Man");
                     System.out.println(" 3. Bolt Man");
                     System.out.println(" 4. Sticky Man");
                     System.out.println(" 5. Water Man");
                     System.out.println(" 6. Fire man");
                     System.out.println(" 7. Gorjo Girl");
                     System.out.println();
                     System.out.println("Please enter the number of your opponent:");
                     input2 = keyboard.nextInt();

                     
                     switch (input2)
                     {
                        case 1:
                           System.out.println("Your opponent is " + jamaicaMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 2:
                           System.out.println("Your opponent is " + agilityMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        break;
                     
                        case 3:
                           System.out.println("Your opponent is " + boltMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 4:
                           System.out.println("Your opponent is " + stickyMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                                            
                        case 5:
                           System.out.println("Your opponent is " + waterMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        
                        break;
                     
                        case 6:
                           System.out.println("Your opponent is " + fireMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        break;
                     
                        case 7:
                           System.out.println("Your opponent is " + gorjoGirl);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                     }
                  break;
                  
                  case 5:
                     System.out.println ("You Chose " + waterMan);
                     System.out.println();
                     System.out.println(" 1. Jamaica Man");
                     System.out.println(" 2. Agility Man");
                     System.out.println(" 3. Bolt Man");
                     System.out.println(" 4. Sticky Man");
                     System.out.println(" 5. Water Man");
                     System.out.println(" 6. Fire man");
                     System.out.println(" 7. Gorjo Girl");
                     System.out.println();
                     System.out.println("Please enter the number of your opponent:");
                     input2 = keyboard.nextInt();

                     
                     switch (input2)
                     {
                        case 1:
                           System.out.println("Your opponent is " + jamaicaMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 2:
                           System.out.println("Your opponent is " + agilityMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        break;
                     
                        case 3:
                           System.out.println("Your opponent is " + boltMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 4:
                           System.out.println("Your opponent is " + stickyMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                                            
                        case 5:
                           System.out.println("Your opponent is " + waterMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        
                        break;
                     
                        case 6:
                           System.out.println("Your opponent is " + fireMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                           break;
                     
                        case 7:
                           System.out.println("Your opponent is " + gorjoGirl);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                         break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        }
                  break;
                  
                  case 6:
                     System.out.println ("You Chose " + fireMan);
                     System.out.println();
                     System.out.println(" 1. Jamaica Man");
                     System.out.println(" 2. Agility Man");
                     System.out.println(" 3. Bolt Man");
                     System.out.println(" 4. Sticky Man");
                     System.out.println(" 5. Water Man");
                     System.out.println(" 6. Fire man");
                     System.out.println(" 7. Gorjo Girl");
                     System.out.println();
                     System.out.println("Please enter the number of your opponent:");
                     input2 = keyboard.nextInt();

                     
                     switch (input2)
                     {
                        case 1:
                           System.out.println("Your opponent is " + jamaicaMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 2:
                           System.out.println("Your opponent is " + agilityMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        break;
                     
                        case 3:
                           System.out.println("Your opponent is " + boltMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 4:
                           System.out.println("Your opponent is " + stickyMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                                            
                        case 5:
                           System.out.println("Your opponent is " + waterMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        
                        break;
                     
                        case 6:
                           System.out.println("Your opponent is " + fireMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                           
                        break;
                     
                        case 7:
                           System.out.println("Your opponent is " + gorjoGirl);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        }
                  break;
                  
                  case 7:
                     System.out.println ("You Chose " + gorjoGirl);
                     System.out.println();
                     System.out.println(" 1. Jamaica Man");
                     System.out.println(" 2. Agility Man");
                     System.out.println(" 3. Bolt Man");
                     System.out.println(" 4. Sticky Man");
                     System.out.println(" 5. Water Man");
                     System.out.println(" 6. Fire man");
                     System.out.println(" 7. Gorjo Girl");
                     System.out.println();
                     System.out.println("Please enter the number of your opponent:");
                     input2 = keyboard.nextInt();

                     
                     switch (input2)
                     {
                        case 1:
                           System.out.println("Your opponent is " + jamaicaMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 2:
                           System.out.println("Your opponent is " + agilityMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                           
                        break;
                     
                        case 3:
                           System.out.println("Your opponent is " + boltMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        case 4:
                           System.out.println("Your opponent is " + stickyMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                                            
                        case 5:
                           System.out.println("Your opponent is " + waterMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        
                        break;
                     
                        case 6:
                           System.out.println("Your opponent is " + fireMan);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                           
                        break;
                     
                        case 7:
                           System.out.println("Your opponent is " + gorjoGirl);
                           System.out.println();
                           
                           for (int count = 1; count <= 7; count++ )
                           {
                              strengthFighter1 = randomPowerLevel. nextInt(10) + 1;
                              strengthFighter2 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter1 = randomPowerLevel. nextInt(10) + 1;
                              speedFighter2 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter1 = randomPowerLevel. nextInt(10) + 1;
                              agilityFighter2 = randomPowerLevel. nextInt(10) + 1;
                              
                              totalPower1 = strengthFighter1 + speedFighter1 + agilityFighter1;
                              totalPower2 = strengthFighter2 + speedFighter2 + agilityFighter2;
                           
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++;
                                 System.out.println("You Won Match " + count);
                              }
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++;
                                 System.out.println("You Lost Match " + count);
                              }
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;
                                 System.out.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           System.out.println();
                           System.out.println("Number of Matches you Won " + f1Win);
                           System.out.println("Number of Matches you Lost " + f2Win);
                           System.out.println("Number of Draws " + draw);
                           System.out.println();
                        
                        break;
                     
                        default:
                           
                           System.out.println("Please enter a valid number!");// Output if invalid number was entered
                        }
                  break;
                  
                  default:
                     System.out.println("Please enter a valid number!");// Output if invalid number was entered

               }       
            System.out.println();
            System.out.println("Enter 0 to exit, hit any key to play again");// Allows user to enter value to end game or continue playing 
            input = keyboard.nextInt();
      }while (input != 0 );                  
        
   }
}