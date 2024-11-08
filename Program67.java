import java.util.*;

class Program67
{
    static void Pattern(int iRows, int iCols)
    {
        int i = 0;
        int j = 0;
        int iCnt = 0;

        for(i = 0; i < iRows; i++)
        {
            for(j = 0; j < iCols; j++)
            {
                iCnt = iCnt + 1;
                System.out.print(iCnt+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows  : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of rows  : ");
        int iNo2 = sobj.nextInt();

        Pattern(iNo1, iNo2);
    }
}