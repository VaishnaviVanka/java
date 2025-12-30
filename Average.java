import java.util.Scanner;

public class Average{
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int sum = 0;
        double avg;
        

        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
             }
             avg= sum/a.length;
             System.out.println("The sum of the elements:"+sum);

        System.out.println("The avg of the elements: " + avg);
    }
}
