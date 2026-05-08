class studentDB
{

    String name;
    String srn;

    static String Collegename = "PES UNIVERSITY";

    public studentDB(String name, String srn)
    {
            this.name = name;
            this.srn = srn;
    }

    public void displaydetails()
    {
        System.out.println("STUDENT NAME:" + name);
        System.out.println("SRN:" + srn);

        System.out.println("COLLEGE NAME: " +studentDB.Collegename);
        System.out.println("-------------------------");
    }
}

public class studentDB4th
{
    public static void main(String[] args)
    {
        // Task 1: Insert values into members and display them
        System.out.println("Creating initial student record:");
        System.out.println("Initial college name:" +studentDB.Collegename);

        System.out.println("======================================");

        studentDB S1 = new studentDB("ARAV RAJ", "ABC2788308");
        studentDB S2 = new studentDB("niggah man", "BCC2736284");

        S1.displaydetails();
        S2.displaydetails();

        // Task 2: Change the value of the static variable

        System.out.println("Updating static clg name");
        studentDB.Collegename = "RV UNI";

        System.out.println("static college name changed:" +studentDB.Collegename + " ");
        System.out.println("=================\n");



    }
    
}
