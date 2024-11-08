import java.util.*;

class Program24
{
    static void Multiple(int iNum)
    {
        int i  = 0;

        for(i = 1; i <= 5; i++)
        {
            System.out.println(iNum*i+"  ");
        }
    }
    public static void main(String[] Argv)
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        Multiple(iNo);

    }
}