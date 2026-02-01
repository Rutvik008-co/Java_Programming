// Write java program to accept file name from user and open that file and read the data from that file

import java.io.*;
import java.util.Scanner;

class program02
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        boolean bRet = false;
        String FileName = null;
        byte Buffer[] = new byte[100];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();
        
        File fobj = new File(FileName);

        if(fobj.exists())
        {
            String str = null;

            FileInputStream fiobj = new FileInputStream(fobj);
            
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer,0,iRet);        // IMP
                System.out.print(str);
                str = null;
            }

            System.out.println();
        }
        else
        {
            System.out.println("There is no such file");
        }
         
        sobj.close();
    }
}


/*
class program02
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