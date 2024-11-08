import java.util.*;

class Program55
{
    static void Pattern(int iNum)
    {
        int i = 0;

        for(i = 1; i <= iNum; i++)
        {
            System.out.print(i+"  *  ");
        }
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Pattern(iNo);
    }
}