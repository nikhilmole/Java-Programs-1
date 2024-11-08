import java.util.*;

class Program43
{
    static void DisplayDig(int iNum)
    {
        int iDigit = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum > 0)
        {
            iDigit = iNum % 10;
            System.out.println(iDigit);
            iNum = iNum / 10;
        }
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        DisplayDig(iNo);
    }
}