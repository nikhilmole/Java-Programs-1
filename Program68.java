import java.util.*;

class Program68
{
    static void Pattern(int iRows, int iCols)
    {
        int i = 0;
        int j = 0;

        int iCnt = 1;

        for(i = 1; i <= iRows; i++)
        {
            for(j = 1; j <= iCols; j++)
            {
                System.out.print(iCnt+"\t");
                iCnt = iCnt + 1;
                if(iCnt == 10)
                {
                    iCnt = 1;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of cols : ");
        int iNo2 = sobj.nextInt();

        Pattern(iNo1, iNo2);

    }
}