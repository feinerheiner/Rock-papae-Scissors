import java.util.*;
import java.io.*;

class RockPaperScissors
{
   

   public String getUserChoice  (){
      Scanner in = new Scanner(System.in);
      String user = "";
      
      try{
         System.out.println("Please enter Rock, Paper, or Scissors.");
         user = in.nextLine();
      }
      catch(InputMismatchException e){
         System.out.println("Invalid input, please try again.");
      }
      return user;
   }
   public String getCPUChoice (){
      Random r = new Random();
      String cpu = "";
      int choice = 0;
      
      choice = r.nextInt(3) + 1;
      
      switch (choice)
      {
         case 1:
            cpu = "Rock";
            break;
         case 2:
            cpu = "Paper";
            break;
         case 3:
            cpu = "Scissors";
            break;
      }
      return cpu;
   }
   public int pickWinner (String user, String cpu){
   
   int winner = 0;
   
   //0 tie, 1 user win, 2 cpu win, -1 error
   switch (user)
   {
      case "Rock":
         switch (cpu)
         {
            case "Rock":
               winner = 0;
               break;
            case "Paper":
               winner = 2;
               break;
            case "Scissors":
               winner = 1;
               break;
            default:
               winner = -1;
               break;
         }
         break;
 //0 tie, 1 user win, 2 cpu win, -1 error
      case "Paper":
         switch (cpu)
         {
            case "Rock":
               winner = 1;
               break;
            case "Paper":
               winner = 0;
               break;
            case "Scissors":
               winner = 2;
               break;
            default:
               winner = -1;
               break;
            
         }
         break;
 //0 tie, 1 user win, 2 cpu win, -1 error
      case "Scissors":
         switch (cpu)
         {
            case "Rock":
               winner = 2;
               break;
            case "Paper":
               winner = 1;
               break;
            case "Scissors":
               winner = 0;
               break;
            default:
               winner = -1;
               break;
         }
         break;
      
      default:
         winner = -1;
         break;
   }
   return winner;
   
   
   }
}