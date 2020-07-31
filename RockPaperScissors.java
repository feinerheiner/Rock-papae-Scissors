import java.util.*;
import java.io.*;

class RockPaperScissors
{
   

   public String getUserChoice  (){
      Scanner in = new Scanner(System.in);
      String user = "";
      String userUpper = "";
      boolean error = false;
      do{
         try{
            error = false;
            System.out.println("Please enter Rock, Paper, or Scissors.");
            user = in.nextLine();
            userUpper = user.toUpperCase();
            
            if (userUpper.equals ("ROCK") || userUpper.equals ("PAPER") || userUpper.equals ("SCISSORS")){
               error = false;
            }   
            else{
               error = true;
            }
         }
         catch(InputMismatchException e){
         error = true;
            System.out.println("Invalid input, please try again.");
         }
      }while(error = true);   
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
            cpu = "ROCK";
            break;
         case 2:
            cpu = "PAPER";
            break;
         case 3:
            cpu = "SCISSORS";
            break;
      }
      return cpu;
   }
   public int pickWinner (String user, String cpu){
   
   int winner = 0;
   
   //0 tie, 1 user win, 2 cpu win, -1 error
   switch (user)
   {
      case "ROCK":
         switch (cpu)
         {
            case "ROCK":
               winner = 0;
               break;
            case "PAPER":
               winner = 2;
               break;
            case "SCISSORS":
               winner = 1;
               break;
            default:
               winner = -1;
               break;
         }
         break;
 //0 tie, 1 user win, 2 cpu win, -1 error
      case "PAPER":
         switch (cpu)
         {
            case "ROCK":
               winner = 1;
               break;
            case "PAPER":
               winner = 0;
               break;
            case "SCISSORS":
               winner = 2;
               break;
            default:
               winner = -1;
               break;
            
         }
         break;
 //0 tie, 1 user win, 2 cpu win, -1 error
      case "SCISSORS":
         switch (cpu)
         {
            case "ROCK":
               winner = 2;
               break;
            case "PAPER":
               winner = 1;
               break;
            case "SCISSORS":
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