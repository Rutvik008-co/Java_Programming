// WAP to print number from N down to 1 in reverse order

class logic 
{
    void PrintReverse(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class program02
{
    public static void main(String[] args)
    {
        logic obj = new logic();
        obj.PrintReverse(10);
        
    }
}