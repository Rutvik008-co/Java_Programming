// WAP to find sum of all even number up to N

class logic
{
    void FindSum(int iNo)
    {
        int iCnt = 0, iSum = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum = iCnt;
            }
        }
        System.out.println(iCnt);        
    }
}

class program04
{
    public static void main(String[] args)
    {
        int iValue = 0;

        logic obj = new logic();
        obj.FindSum(iValue);    

    }
}