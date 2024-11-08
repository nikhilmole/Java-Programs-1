import java.util.*;

class Display
{
    public int iRows;
    public int iCols;

        public Display(int iRo, int iCo)
        {
            iRows = iRo;
            iCols = iCo;
        }

        public void Pattern()
        {
            int i = 0;
            int j = 0;

            for(i = iRows; i > 0; i--)
            {
                for(j = iCols; j > 0; j--)
                {
                    System.out.print(i+"  ");
                }
                System.out.println();
            }
            
        }
}
class Program66
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of cols : ");
        int iNo2 = sobj.nextInt();

        Display dobj = new Display(iNo1, iNo2);

        dobj.Pattern();
    }
}