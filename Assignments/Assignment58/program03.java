// Write a program to accept directory name from user and Write data of all file
// into one newly created file name as "Marvellous.txt"

import java.io.*;
import java.util.*;

class program03 
{
    public static void main(String[] args) throws IOException
    {
        String Filename = null;
        boolean bRet = false;
        File fobj = null;
        FileReader frobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Derectory : ");
        Filename = sobj.nextLine();

        fobj = new File(Filename);
        
        bRet = fobj.exists();

        if(bRet == true)
        {
            System.out.println("File already exist");
        }
        else
        {
            bRet = fobj.createNewFile();

            if(bRet == true)
            {
                System.out.println("File created Succesfully");
            }
            else
            {
                System.out.println("Unable to create file");
            }
        }
        
        sobj.close();
    }
}