import java.util.*;

class Program15
{
    static void Factors(int iNum)
    {
        int i = 0;

        for(i = 1; i <= iNum/2; i++)
        {
            if(iNum % i == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Factors(iNo);
    }
}