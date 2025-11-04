// WAP to check whether the number is perfect number or not

class logic 
{
    void PrintReverse(int iNo)
    {
        int iCnt = 0, iSum = 0;
        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iSum == iNo)
        {   
            System.out.println("Yes, The number is Perfect number");
        }
        else
        {
            System.out.println("No, The number is not perfect number");    
        }
    }
}

class program03 
{
    public static void main(String[] args)
    {
        logic obj = new logic();
        obj.PrintReverse(28);
        
    }
}