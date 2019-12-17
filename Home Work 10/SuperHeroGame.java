import java.util.Scanner;
import java.util.Random;
import java.io.*;

/**
COSC 220
Justin Clayton
Assignment #9
Purpose: This program provides the user with a list of superheroes. Each super hero has 3 abilities. These abilities are given Random values.
The random value determines rankind which decides the winner of the match. Game will have supero heros fight 7 consecutive times. Results of each matach will be sent to a .txt file.*/

public class SuperHeroGame
{
   /**This program provides the user with a list of superheroes. Each super hero has 3 abilities. These abilities are given Random values.
The random value determines rankind which decides the winner of the match.*/
   
   public static void main(String args[]) throws IOException
   {
   
      // Name of super heros
      String jamaicaMan = "Jamaica Man";
      String agilityMan = "Agility Man";
      String boltMan = "Bolt Man";
      String stickyMan = "Sticky Man";
      String waterMan = "Water Man";
      String fireMan = "Fire Man";
      String gorjoGirl = "Gorjo Girl";
      
      //String nameOfFile;
      
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
      int f1Win;
      int f2Win;
      int draw;
   
         
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
         f1Win = 0;
         f2Win = 0;
         draw = 0;
               
               // Open the file
               File filename = new File("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameInput.txt");
               Scanner inputFile =  new Scanner(filename);
               
               // Display Hero options
               while(inputFile.hasNext())
               {
                  // Read names from file
                  String heroNames = inputFile.nextLine();
                  
                  // Displays lines from text file
                  System.out.println(heroNames);
               }
               inputFile.close();
                     
               // Fighter options
               input1 = keyboard.nextInt();
               
               // Determines which hero user has chosen to use
               switch (input1)
               {
               
                  
                  // User chooses opponent
                  case 1:
                     
                     //Opens file that results will be written to
                     FileWriter fW = new FileWriter("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameOutput.txt", true);
                     PrintWriter outputFile = new PrintWriter(fW);

                     
                     System.out.println ("You Chose " + jamaicaMan);
                     System.out.println();

                     //Opens file that data will be written from
                     filename = new File("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameInput2.txt");
                     inputFile =  new Scanner(filename);
                     
                     //Displays Opponent Choices
                     while(inputFile.hasNext())
                     {
                        //Read names from file
                        String heroNames = inputFile.nextLine();
                        
                        // Displays lines from text file
                        System.out.println(heroNames);
                     }
                     inputFile.close();
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
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();

                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        
                        break;
                     }
                     // Closes file that results were written to
                     outputFile.close();
                  break; 
                     
                     
                  case 2:
                     
                     //Opens file that results will be written to
                     fW = new FileWriter("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameOutput.txt", true);
                     outputFile = new PrintWriter(fW);

                     
                     System.out.println ("You Chose " + agilityMan);
                     System.out.println();

                     //Opens file that data will be written from
                     filename = new File("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameInput2.txt");
                     inputFile =  new Scanner(filename);
                     
                     //Displays Opponent Choices
                     while(inputFile.hasNext())
                     {
                        //Read names from file
                        String heroNames = inputFile.nextLine();
                        
                        // Displays lines from text file
                        System.out.println(heroNames);
                     }
                     inputFile.close();
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
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();

                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        break;
                     }
                     // Closes file that results were written to
                     outputFile.close();
                  break;
                     
                  case 3:
                     
                     //Opens file that results will be written to
                     fW = new FileWriter("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameOutput.txt", true);
                     outputFile = new PrintWriter(fW);

                     
                     System.out.println ("You Chose " + boltMan);
                     System.out.println();

                     //Opens file that data will be written from
                     filename = new File("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameInput2.txt");
                     inputFile =  new Scanner(filename);
                     
                     //Displays Opponent Choices
                     while(inputFile.hasNext())
                     {
                        //Read names from file
                        String heroNames = inputFile.nextLine();
                        
                        // Displays lines from text file
                        System.out.println(heroNames);
                     }
                     inputFile.close();
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
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();

                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        break;
                     }
                     // Closes file that results were written to
                     outputFile.close();
                     break;
                  
                  case 4:
                     
                     //Opens file that results will be written to
                     fW = new FileWriter("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameOutput.txt", true);
                     outputFile = new PrintWriter(fW);

                     
                     System.out.println ("You Chose " + stickyMan);
                     System.out.println();

                     //Opens file that data will be written from
                     filename = new File("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameInput2.txt");
                     inputFile =  new Scanner(filename);
                     
                     //Displays Opponent Choices
                     while(inputFile.hasNext())
                     {
                        //Read names from file
                        String heroNames = inputFile.nextLine();
                        
                        // Displays lines from text file
                        System.out.println(heroNames);
                     }
                     inputFile.close();
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
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();

                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        break;
                     }
                     // Closes file that results were written to
                     outputFile.close();
                  break;
                     
                  case 5:
                     //Opens file that results will be written to
                     fW = new FileWriter("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameOutput.txt", true);
                     outputFile = new PrintWriter(fW);

                     
                     System.out.println ("You Chose " + waterMan);
                     System.out.println();

                     //Opens file that data will be written from
                     filename = new File("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameInput2.txt");
                     inputFile =  new Scanner(filename);
                     
                     //Displays Opponent Choices
                     while(inputFile.hasNext())
                     {
                        //Read names from file
                        String heroNames = inputFile.nextLine();
                        
                        // Displays lines from text file
                        System.out.println(heroNames);
                     }
                     inputFile.close();
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
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();

                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        break;
                     }
                     // Closes file that results were written to
                     outputFile.close();
                  break;
                     
                  case 6:
                     //Opens file that results will be written to
                     fW = new FileWriter("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameOutput.txt", true);
                     outputFile = new PrintWriter(fW);

                     
                     System.out.println ("You Chose " + fireMan);
                     System.out.println();

                     //Opens file that data will be written from
                     filename = new File("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameInput2.txt");
                     inputFile =  new Scanner(filename);
                     
                     //Displays Opponent Choices
                     while(inputFile.hasNext())
                     {
                        //Read names from file
                        String heroNames = inputFile.nextLine();
                        
                        // Displays lines from text file
                        System.out.println(heroNames);
                     }
                     inputFile.close();
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
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();

                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        break;
                     }
                     // Closes file that results were written to
                     outputFile.close();
                  break;

                  case 7:
                     //Opens file that results will be written to
                     fW = new FileWriter("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameOutput.txt", true);
                     outputFile = new PrintWriter(fW);

                     
                     System.out.println ("You Chose " + gorjoGirl);
                     System.out.println();

                     //Opens file that data will be written from
                     filename = new File("C:/Users/jgc5/Downloads/Home Work 10/SuperHeroGameInput2.txt");
                     inputFile =  new Scanner(filename);
                     
                     //Displays Opponent Choices
                     while(inputFile.hasNext())
                     {
                        //Read names from file
                        String heroNames = inputFile.nextLine();
                        
                        // Displays lines from text file
                        System.out.println(heroNames);
                     }
                     inputFile.close();
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
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                        
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();
                           
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
                           
                              //Decides if user won the match
                              if (totalPower1 > totalPower2)
                              {
                                 f1Win++; // Number of accumualated matches won
                                 outputFile.println("You Won Match " + count);
                              }
                              // Determines if user lost the match
                              else if(totalPower1 < totalPower2)
                              {
                                 f2Win++; // Number accumulated loss
                                 outputFile.println("You Lost Match " + count);
                              }
                              // Determines if match was a draw
                              else if (totalPower1 == totalPower2)
                              {
                                 draw++;// Number of accumulated Draws
                                 outputFile.println("Match " + count + " Was a Draw");
                                 
                              }
                              
                           }
                           // Output Results of matches
                           outputFile.println();
                           outputFile.println("Number of Matches you Won " + f1Win);
                           outputFile.println("Number of Matches you Lost " + f2Win);
                           outputFile.println("Number of Draws " + draw);
                           outputFile.println();

                        break;
                     
                        default:
                           System.out.println("Please enter a valid number!");
                        break;
                     }
                     // Closes file that results were written to
                     outputFile.close();
                     break;

                                          
                  default:
                     System.out.println("Please enter a valid number!");// Output if invalid number was entered
                  break;
                     
                  }       
            System.out.println();
            System.out.println("Enter 0 to exit, hit any key to play again");// Allows user to enter value to end game or continue playing 
            input = keyboard.nextInt();
      }while (input != 0 ); // Checks if user has entered 0
                      
        
   }
}