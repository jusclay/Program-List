/** 
Justin Clayton and Remi Abayie
COSC 221
Purpose: This program creates a clss for a pencil*/
 
public class RunProgram
{
   public static void main(String[]args)
   {
      Pencil eightB = new Pencil();
      eightB.assignValues();
      
   }
}

/* Class decleration*/
class Pencil
{
   String type;
   String color;
   String size;
   String hasRubber;
   
   /* Display values of objects*/
   public void display()
   {
      
      System.out.println(" Characteristics of a Pencil");
      System.out.println(" Type: " + type);
      System.out.println(" Color: " + color);
      System.out.println(" Size: " + size);
      System.out.println(" Has rubber? : " + hasRubber);
      
   }
   /* Assign values to variables*/
   public void assignValues()
   {
      Pencil eightB = new Pencil();
      
      eightB.type ="8B";
      eightB.color = "Black";
      eightB.size = "Regular";
      eightB.hasRubber = "No";
      
      eightB.display();

   }
   
}