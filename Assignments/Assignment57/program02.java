// Write java program accept file name from user and check whether that file is regular file or not.

import java.io.File;
import java.util.Scanner;

class program02
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fname = sobj.nextLine();

        File fobj = new File(fname);

        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("It is a regular file");
            }
            else
            {
                System.out.println("It is NOT a regular file");
            }
        }
        else
        {
            System.out.println("File does not exist");
        }

        sobj.close();
    }
}
