import java.util.*;

class Program53
{
    static void Pattern(int iNum)
    {
        int i = 0;
        char ch = '\0';

        for(i = 1, ch = 'A'; i <= iNum; i++, ch++)
        {
            System.out.println(ch);
        }
    }
    public static void main(String[] Argv)
    {
        int iNo = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        Pattern(iNo);
    }
}