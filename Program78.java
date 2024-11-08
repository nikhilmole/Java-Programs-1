import java.util.*;

class Program78
{
    static void Pattern(int iRows, int iCols)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRows; i++)
        {
            for(j = 1; j <= iCols; j++)
            {
                if(j <= iCols - i + 1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] argv)
    {
        int iNo1 = 0;
        int iNo2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the number of column : ");
        iNo2 = sobj.nextInt();

        Pattern(iNo1, iNo2);

    }
}