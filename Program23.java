import java.util.*;

class Program23
{
    static void OddNumber(int iNum)
    {
        int i = 0;

        for(i = 1; i<= iNum; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i+"   ");
            }
        }
    }
    public static void main(String Argv[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        OddNumber(iNo);
    }
}