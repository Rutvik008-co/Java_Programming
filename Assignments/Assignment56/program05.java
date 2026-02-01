// Write JAVA program to accept derectory name and display all names of file from that derectroy

import java.io.File;
import java.util.Scanner;

class program05
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dname = sobj.nextLine();

        File fobj = new File(dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            String files[] = fobj.list();

            System.out.println("Files in directory:");

            for(int i = 0; i < files.length; i++)
            {
                System.out.println(files[i]);
            }
        }
        else
        {
            System.out.println("Directory does not exist");
        }

        sobj.close();
    }
}
