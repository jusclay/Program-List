/**
Justin Clayton & Remi Abayie
COSC 221
Purpose: This program creates a class with attributes of a cup. */ 

public class CupProgram
{
   /* Executes main method*/
   public static void main(String[]args)
   {
      Cup teaCup = new Cup(); // Creates object
      output();
      System.out.println(teaCup.returnValues());
   }
   
   /* Output statement*/
   public static void output()
   {
      System.out.println("These are the attributes of a cup.");
   }
}

/** Creates Class with attributes for a cup */
class Cup
{
   /* Decleration of variables*/
   String material = "Chalk" ;
   String color ="White";
   String type = "Tea cup";
   String size = "8 Oz";
   String design = "cup with handle";

  
   /* Return values*/
   public String returnValues()
   {
      return ("The material is " + material
      + "\nThe color is " + color
      + "\nThe type is a " + type
      + "\nThe size is a " + size
      + "\nThe design is a " + design);  
   }

}
