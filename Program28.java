import java.util.*;
class Program28
{
    static void Table(int iNum)
    {
        int i = 0;

        for(i = 1; i <= 10; i++)
        {
            System.out.println(iNum + "*" +i+ "="+ iNum * i);
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System .out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Table(iNo);
    }
}