// Write a java program to accept file name from user calculate checksum of that file and display on screen

import java.io.*;
import java.util.Scanner;


class program04
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fname = sobj.nextLine();

        try
        {
            FileInputStream fis = new FileInputStream(fname);

            MessageDigest md = MessageDigest.getInstance("MD5");

            byte buffer[] = new byte[1024];
            int bytesRead = 0;

            while((bytesRead = fis.read(buffer)) != -1)
            {
                md.update(buffer, 0, bytesRead);
            }

            byte digest[] = md.digest();

            System.out.print("Checksum (MD5) : ");
            for(byte b : digest)
            {
                System.out.printf("%02x", b);
            }

            fis.close();
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }

        sobj.close();
    }
}
