import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first value:");
        int a = sc.nextInt();
        System.out.println("Enter the second value:");
        int b=sc.nextInt();
        System.out.println("Choose Operation 1-Add 2-sub 3-mul");
        
        int choice = sc.nextInt();// we can directly give the operation number(1,2,3)//
        switch(choice)
        {
            case 1:
                System.out.println("Result :"+(a+b));
                break;
            case 2:
                System.out.println("Result :"+(a-b));
                break;
            case  3:
                System.out.println("Result:"+(a*b));
                break;
                
                default:
                System.out.println("different operation is not possible");
        }
        
    }
}
