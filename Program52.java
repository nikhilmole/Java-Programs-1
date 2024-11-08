import java.util.*;

class Program52
{
    static int SumOddEven(int iNum)
    {
        int iDigit = 0;
        int OddSum = 0;
        int EvenSum = 0;
        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum > 0)
        {
            iDigit = iNum % 10;
            if(iDigit % 2 == 0)
            {
                EvenSum = EvenSum + iDigit;
            }
            else
            {
                OddSum = OddSum + iDigit;
            }
            iNum = iNum / 10;
        }
        return EvenSum - OddSum;
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

       int iRet =  SumOddEven(iNo);
       System.out.println(iRet);
    }
}