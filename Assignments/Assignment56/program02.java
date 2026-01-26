// Write a program to find the sum of all even numbers up to N

class logic 
{
    void SumEvenNo(int iNo)
    {
        int iCnt = 0, iSum = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.println(iSum);
    }
}

class program01
{
    public static void main(String[] args)
    {
        
        logic obj = new logic();
        obj.SumEvenNo(10);
        
    }
}