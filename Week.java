import java.util.Scanner;
 public class Week
 {
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     {
       System.out.println("Enter the week (1-3):");
         int week = sc.nextInt();
        
   switch(week)
         {
           case 1:
             System.out.println("monday");
             break;
             case 2:
                 System.out.println("tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
                
             default:
             System.out.println("invalid week number.");
            }
        }
    }
 }

