import java.util.*;

class Program33
{
    static int DefOddEvenFacto(int iNum)
    {
        int i = 0;
        int iEvenFacto = 1;
        int iOddFacto = 1;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(i = 1; i <= iNum; i++)
        {
            if(i % 2 == 0)
            {
                iEvenFacto = iEvenFacto * i;
            }
            else
            {
                iOddFacto = iOddFacto * i;
            }
        }
        return iEvenFacto - iOddFacto;
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iRet = DefOddEvenFacto(iNo);
        System.out.println(iRet);
    }
}