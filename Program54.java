import java.util.*;

class Program54
{
    static void Pattern(int iNum)
    {
        int i = 0;

        for(i = iNum; i > 0; i--)
        {
            System.out.print(i+"  #  ");
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