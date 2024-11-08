import java.util.*;

class Program41
{
    static int EvenAdd(int iNum1, int iNum2)
    {
        int Ans = 0;
        int i = 0;

        if(iNum1 > iNum2)
        {
            System.out.println("Invalid Option");
        }
        for(i = iNum1; i <= iNum2; i++)
        {
            if(i % 2 == 0)
            {
                Ans = Ans + i;
            }
        }
        return Ans;
    }

    public static void main(String[] Argv)
    {
        int iNo1 = 0;
        int iNo2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number  :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the Second number  :");
        iNo2 = sobj.nextInt();

        int iRet = EvenAdd(iNo1, iNo2);

        if(iNo1 <= iNo2)
        {
            System.out.println(iRet);
        }
    }
}