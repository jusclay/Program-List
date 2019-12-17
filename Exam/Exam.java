/**
COSC220 
Lecturer: Dr Hateley
Justin Clayton
Final Exam Program
*/

import java.util.Scanner;
import java.io.*;

/** Creates a class that will accept questions and answers*/
class Question
{
   String question;
   String answer;
   
   public Question(String question, String answer)
   {
      this.question = question;
      this.answer = answer;
   }
}

/** This Programs presents and 20 question test to user.
At the end of the test, the score will be displayed and written to a .txt file */
public class Exam
{
   public static void main (String args [])throws IOException
   
   {
      System.out.println("Please answer questions with lower case letters.");
      int t1 = trueFalse();
      int t2 = multipleChoice();
      int t3 = shortAnswer();
      int total = t1+ t2 + t3;
      writeToFile(total);
        
   }  
   
   /** This method stores an array of true anf false questions and passes array to runTest methods. It Also returns the total score*/
   public static int trueFalse()throws IOException
   {
      String q1 = "1. True or False. A string is a datatype: ";
      String q2 = "2. True or False: A left brace in a Java program is always followed by a right brace later in the program: ";
      String q3 = "3. True of False. Java is an object oriented programming language: ";
      String q4 = "4. True or False. Variable names can be started with numbers:  ";
      String q5 = "5. True or False. A while Loop is a Post test loop: ";
      String q6 = "6. True or False. Git does not download the full repository to the local drive of the developer: ";
   
   
      Question [] tftest = 
      {
         new Question (q1, "true"),
         new Question (q2, "true"),
         new Question (q3, "true"),
         new Question (q4, "false"),
         new Question (q5, "false"),
         new Question (q6, "false"),
      };
   
      int total = runTest(tftest);
      return total;
   
   }
   
    /** This method stores an array of multple choice questions and passes array to runTest methods. It Also returns the total score*/
   public static int multipleChoice()throws IOException
   {
      String q7 = "7. What do you call the part of the program between the braces?\na. Header \nb. Footer \nc. Array \nd. Body";
      String q8 = "8. What  are the names of comments that begin with /**? \na. Single Line Comments \nb. Documentation Comments \nc. Multiline Comments \nd. Descriptive Comments";
      String q9 = "9. What does the statement new Scanner (System.in) do?\na. Creates Scanner Object in memory \nb. Executes Scanner Object \nc. Imports Scanner object \nd. Outputs Scanner";
      String q10 = "10. What kind of operators are these +, -, *, /? \na. Math Operators \nb. Aritmetic Operators \nc. Logical Operators \nd. Relational Operators";
      String q11 = "11. Who created Git?\na. Jeff Bezos \nb. Steve Jobs \nc. Linus Torvalds \nd. Bill Gates";
      String q12 = "12. Which of the following are not valid assignment statements?\na. total =9 \nb. 72 = amount \nc. profit = 129 \nd. letter = ‘W’";
      String q13 = "13. Git ______ command Saves a new version of your project?\na. Commit \nb. Branch \nc. Get \nd. add";
      String q14 = "14. What kind of structure is an IF statement?\na. Class Structure \nb. Sequence Structure \nc. Decision Structure \nd. Pathway Structure";
      String q15 = "15. This type of loop always executes at least once.\na. while \nb. any of these \nc. do-while \nd. for";
      String q16 = "16. When a program is finished using a file, it should do this.\na. erase the file \nb. close the file \nc. throw an exception \nd. reset the read position";

      
      Question [] mtest = 
      {
         new Question (q7, "d"),
         new Question (q8, "b"),
         new Question (q9, "a"),
         new Question (q10, "b"),
         new Question (q11, "c"),
         new Question (q12, "b"),
         new Question (q13, "a"),
         new Question (q14, "c"),
         new Question (q15, "c"),
         new Question (q16, "b"),
      };
      
      int total = runTest(mtest);
      return total;
   }
   
   /** This method stores an array of short answer questions and passes array to runTest methods. It Also returns the total score*/
   public static int shortAnswer()throws IOException
   {
      String q17 = "17. ______ allows the developer to diverge from the main project and work on separate section without affecting the main project. ";
      String q18 = "18. Git is a _______ Software. ";
      String q19 = "19. This is a variable that keeps a running total. ";
      String q20 = "20. What type of method does not return a value? ";
      
   
   
      Question [] satest = 
      {
         new Question (q17, "branching"),
         new Question (q18, "version control"),
         new Question (q19, "accumulator"),
         new Question (q20, "void"),
      };
   
      int total = runTest(satest);
      return total;
   
   }

   /** This method accepts an array of the questions */
   public static int runTest(Question [] test)throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      int score = 0;
      for (int i = 0; i < test.length; i++)
      {
         System.out.println(test[i].question);
         String useranswer = keyboard.nextLine();
         FileWriter fW = new FileWriter("Exam Score.txt", true); //Opens file that results will be written to
         PrintWriter outputFile = new PrintWriter(fW);
         outputFile.println(" User's Answer: " + useranswer );
         outputFile.close();     // Closes file that results were written to


         if (useranswer.equals(test[i].answer))
         {
            System.out.println("Correct");
            System.out.println();

            score++;
         }
         else
         {
            System.out.println("Wrong");
            System.out.println();

         }    
      }
      return score; 
   } 
   
   
   /** This method displays the score and writes score to a text file*/
   public static void writeToFile(int score)throws IOException
   {
      FileWriter fW = new FileWriter("Exam Score.txt", true); //Opens file that results will be written to
      PrintWriter outputFile = new PrintWriter(fW);
      outputFile.println(" Your Score is " + score + "/20");
      outputFile.println();
      outputFile.close();     // Closes file that results were written to
      System.out.println("Your Score is " + score + "/20");
      System.out.println("Your Scores have been Written to a text file");
   
   }

  
}

