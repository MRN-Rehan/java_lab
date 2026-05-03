import java.util.Scanner;
public class pg1
{
    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Arithmetic Operations ===");
        System.out.println("1.ADD \n2.SUB\n3.MULP\n4.DIV");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();

        double result;

        switch (choice) 
        {
            case 1:
            result = num1 + num2;
            System.out.println("sum: " + num1 + " + " + num2 + " = " + result);
            break;
        
            case 2:
            result = num1 - num2;
            System.out.println("sum: " + num1 + " - " + num2 + " = " + result);
            break;

            case 3:
            result = num1 * num2;
            System.out.println("sum: " + num1 + " * " + num2 + " = " + result);
            break;

            case 4:
            if (num2!=0)
            {
                result = num1 / num2;
                System.out.println("sum: " + num1 + " / " + num2 + " = " + result);
            }   
            else
            {
                System.out.println("Denominator cant be 0 you dumbass");
            } 
            break;
            default:
            System.out.println("invalid choice, choose from 1-4");
            break;
        }

        sc.close();

    }
}
