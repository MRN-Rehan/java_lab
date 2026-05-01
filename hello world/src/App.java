import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new java.util.Scanner(System.in );
        System.out.println("hiii whats your name");
        String name = sc.nextLine ();
        System.out.println("Hello, World!" +name);

        sc.close();
    }
}
