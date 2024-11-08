import java.util.*;

class Program70
{
    static void Pattern(int iRows, int iCols)
    {
        int i = 0;
        int j = 0;
        char ch1 = '\0';
        char ch2 = '\0';

        for(i = 1, ch1 = 'a'; i <= iRows; i++,ch1++)
        {
            for(j = 1, ch2 = 'a'; j <= iRows; j++,ch2++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(ch2+"\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;
        int iNo2 = 0;

        System.out.println("Enter the number of rows : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the number of cols : ");
        iNo2 = sobj.nextInt();

        Pattern(iNo1, iNo2);    
    }
}