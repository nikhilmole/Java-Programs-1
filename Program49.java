import java.util.*;

class Program49
{
    static int OddFreq(int iNum)
    {
        int iDigit = 0;
        int Freq = 0;
        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum > 0)
        {
            iDigit = iNum % 10;
            if(iDigit % 2 != 0)
            {
                Freq++;
            }
            iNum = iNum / 10;
        }
        return Freq;
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

       int iRet =  OddFreq(iNo);
       System.out.println(iRet);
    }
}