import java.util.*;

class Program29
{
    static void Display(int iNum)
    {
        int i = 0;

        for(i = 1; i <= iNum; i++)
        {
            System.out.print("*  ");
        }
        for(i = 1; i <= iNum; i++)
        {
            System.out.print("#  ");
        }
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Display(iNo);
    }
}