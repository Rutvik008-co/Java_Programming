// Write java program to accept file name from user and Creat that file if it is not exist

import java.io.*;
import java.util.Scanner;


class program04
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();


        fobj = new File(FileName);

        bRet = fobj.exists();

        if(bRet == true)
        {
            System.out.println("File is already present");
        }
        else
        {
            if(fobj.createNewFile())
            {
                System.out.println("File gets created successfully");
            }
            else
            {
                System.out.println("Unable to create file");
            }
        }
        
        sobj.close();
    }
}