import java.util.*;

class Program65
{
    static void Pattern(int iRows, int iCols)
    {
        int i = 0;
        int j = 0;
        char ch1 = '\0';
        char ch2 = '\0';

        for(i = 1, ch1 = 'A'; i <= iRows; i++,ch1++)
        {
            for(j = 1, ch2 = 'A'; j <= iCols; j++,ch2++)
            {
                System.out.print(ch1+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String Argv[])
    {
        int iNo1 = 0;
        int iNo2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the number of cols : ");
        iNo2 = sobj.nextInt();

        Pattern(iNo1, iNo2);

    }
}