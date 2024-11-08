import java.util.*;

class Program40
{
    static int RangeAdd(int iNum1, int iNum2)
    {
        int iAns = 0;

        if (iNum1 > iNum2)
        {
            System.out.println("Invalid range. The first number must be less than or equal to the second number.");
            return 0; 
        }

        for (int i = iNum1; i <= iNum2; i++)
        {
            iAns += i;
        }
        return iAns;
    }

    public static void main(String[] Argv)
    {
        int iNo1 = 0;
        int iNo2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iNo2 = sobj.nextInt();

        int iRet = RangeAdd(iNo1, iNo2);

        if (iNo1 <= iNo2) 
        {
            System.out.println("The sum of numbers in the range is: "+iRet);
        }
    }
}
