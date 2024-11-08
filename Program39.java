import java.util.*;

class Program39
{
    static void Display(int iNum1, int iNum2)
    {
        int i = 0;

        for(i = iNum1; i <= iNum2; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        int iNo2 = sobj.nextInt();

        Display(iNo1, iNo2);

    }
}