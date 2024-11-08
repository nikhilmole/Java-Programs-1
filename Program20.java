import java.util.*;

class Program20
{
    static void Pattern(int iNum)
    {
        int i = 0;
        for(i = 1; i <= iNum; i++)
        {
            System.out.print("$  *  ");
        }
    }
    public static void main(String Argv[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.pRintln("Please enter the number : ");
        iNo = sobj.nextInt();

        Pattern(iNo);
    }
}