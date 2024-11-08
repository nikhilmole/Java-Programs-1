import java.util.*;

class Program38
{
    static void Display(int iNum1, int iNum2)
    {
        int i = 0;

        for(i = iNum1; i <= iNum2; i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();
        Display(iNo1,iNo2);

    }
}