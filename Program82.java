import java.util.*;


class Program82
{
    static void Pattern(int iRows, int iCols)
    {
        int i = 0;
        int j  = 0;

        for(i = 1; i <= iRows; i++)
        {
            for(j = 1; j <= iCols; j++)
            {
                if(i + j == iCols + 1)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of column : ");
        int iNo2 = sobj.nextInt();

        Pattern(iNo1, iNo2);

    }
}