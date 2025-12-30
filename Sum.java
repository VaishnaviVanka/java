import java.util.Scanner;

public class Sum
{
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int sum = 0;
        
       System.out.println("Enter 3 numbers:");
        for (int i = 0; i < a.length; i++)
          {
            a[i] = sc.nextInt();
            sum = sum + a[i];
             }
             
             System.out.println("The sum of the elements:"+sum);

        
    }
}
