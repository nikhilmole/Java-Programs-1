import java.util.*;

class Program45
{
    static int DisplayDig(int iNum)
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
            iNum = iNum / 10;
            if(iDigit == 2)
            {
                Freq++;
            }
        }
        return Freq;
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

       int iRet =  DisplayDig(iNo);
       System.out.println(iRet);
    }
}