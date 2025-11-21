// WAP to reverse number

class Logic
{
    int iRev = 0;

    void reverseNumber(int iNo)
    {
        while (iNo > 0)
        {
            iRev = iNo % 10;
            System.out.print(iRev);
            iNo = iNo / 10;
        }
    }
}

class program04
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(120286);
    }
}
