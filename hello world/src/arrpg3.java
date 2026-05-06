import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class arrpg3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");

        int size = sc.nextInt();
        int OGarray[] = new int[size];
        System.out.println("Enter the elements");
            
        for (int i = 0; i < size; i++) 
        {
            OGarray[i] = sc.nextInt(); 
        }

        System.out.println("original array " +Arrays.toString (OGarray));
        

        // --- Operation 1: Copy all elements to another array ---
        System.out.println("\\n## 1. Copying the Arra");

        int [] copiedArray = new int[OGarray.length];

        for (int i = 0; i < OGarray.length; i++) 
        {
            copiedArray[i] = OGarray[i];
        }

        // --- Operation 2: Remove duplicate elements ---
        System.out.println("\\n## 2. Removing Duplicates");
        
        LinkedHashSet<Integer> uniqueset= new LinkedHashSet<>();

        for(int element : OGarray)
        {
            uniqueset.add(element);
        }

        int[] uniquearray = new int[uniqueset.size()];

        int index =0;

        for(int element : uniqueset)
        {
            uniquearray[index++]=element;
        }

        System.out.println("Array without duplicates:  "   + Arrays.toString(uniquearray));

        // --- Operation 3: Print only even positions ---

        System.out.println("printing evenm number position");

        System.out.println("Element at even position( like 2nd 4th etc...)");

        for (int i = 1; i < OGarray.length; i+= 2) 
        {
            System.out.println(OGarray[i]+ "");   
        }

        System.out.println();
        sc.close();
    }
}
