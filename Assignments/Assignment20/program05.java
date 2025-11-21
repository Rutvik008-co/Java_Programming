// WAP to find the smallest digit in number

class logic
{
    void PrintSmallDigit(int iNo)
    {
        int iDigit = 0, iSmall = 9;
        
        while (iNo > 0)
        {
            iDigit = iNo % 10;

            if(iSmall > iDigit)
            {
                iSmall = iDigit;
            }
            iNo = iNo / 10;
        }
        System.out.println(iSmall);        
    }
}

class program05
{
    public static void main(String[] args)
    {
        int iValue = 120286;

        logic obj = new logic();
        obj.PrintSmallDigit(iValue);    

    }
}
