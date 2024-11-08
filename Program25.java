import java.util.*;

class Program25
{
    static void Number(int iNum)
    {
        if(iNum < 50)
        {
            System.out.println("Small");
        }
        else if((iNum < 50) && (iNum > 100))
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Bigger");
        }
    }
    public static void main(String Argv[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number  : ");
        iNo = sobj.nextInt();

        Number(iNo);
    }
}