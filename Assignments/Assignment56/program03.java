// Write java program to accept file name from user and open that file in write mode and write some data in this file

import java.io.*;
import java.util.Scanner;

public class program03
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);
        
        fwobj.write("Jay Ganesh...");
         
        fwobj.close();
        sobj.close();
    }
}

/* 
class program03
{
    public static void main(String args[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.print("Enter file name : ");
            String fname = sobj.nextLine();

            // Open / Create file
            File fobj = new File(fname);

            if (fobj.createNewFile())
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("File already exists");
            }

            // Write file
            FileWriter fw = new FileWriter(fname, true);
            fw.write("Jay_Ganesh\n");

            fw.close();

            // Read file
            FileReader fr = new FileReader(fname);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nFile contents:");
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            br.close();
            sobj.close();
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
*/