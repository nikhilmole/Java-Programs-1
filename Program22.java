import java.util.*;

class Program22
{
    static void Pattern(int iNum)
    {
        int i = 0;

        for(i = -iNum; i <= iNum; i++)
        {
            System.out.print(+i+" ");
        }
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the numner : ");
        int iNo = sobj.nextInt();

        Pattern(iNo);
    }
}