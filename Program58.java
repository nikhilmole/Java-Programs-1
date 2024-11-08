import java.util.*;

class Program58
{
    static void Pattern(int iRows, int iCols)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRows; i++)
        {
            for(j = 1; j <= iCols; j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String Argv[])
    {
        int iNo1 = 0;
        int iNo2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number of Rows : ");
        iNo1 = sobj.nextInt();

        System.out.println("enter the number of Cols : ");
        iNo2 = sobj.nextInt();

        Pattern(iNo1, iNo2);

    }
}