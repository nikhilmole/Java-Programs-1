import java.util.*;

class Program71
{
    static void Pattern(int iRows, int iCols)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRows; i++)
        {
            for(j = 1; j <= iCols; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(-j+"\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] arg[])
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