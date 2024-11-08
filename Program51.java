import java.util.*;

class Program51
{
    static int MultiDigi(int iNum)
    {
        int iDigit = 0;
        int Freq = 0;
        int iMulti = 1;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum > 0)
        {
            iDigit = iNum % 10;
            iMulti = iMulti * iDigit;
            iNum = iNum / 10;
        }
        return iMulti;
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

       int iRet =  MultiDigi(iNo);
       System.out.println(iRet);
    }
}