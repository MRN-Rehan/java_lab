import java.util.Scanner;

public class VCshit2pg 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int vowelCount = 0;
        int consonentCount =0;

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
               
            if (ch >= 'a' && ch <= 'z' ) 
            {
                if (ch == 'a' || ch == 'e' || ch== 'i' || ch=='o' || ch == 'u') 
                {
                    vowelCount++;
                }
                else
                {
                    consonentCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consomnents: " + consonentCount);

        sc.close();
    }
}
