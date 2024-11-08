import java.util.*;

class Program31
{
    static int EvenFactorial(int iNum)
    {
        int i = 0;
        int iFacto = 1;

        if(iNum < 0)
        {
            iNum = -iNum;
        }
        for(i = 1; i <= iNum; i++)
        {
            if(i % 2 == 0)
            {
                iFacto = iFacto * i;
            }
        }
        return iFacto;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iRet = EvenFactorial(iNo);
        System.out.println(iRet);
    }
}