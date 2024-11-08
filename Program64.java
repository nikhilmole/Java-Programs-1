import java.util.*;

class Program64
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
            if(i % 2 == 0)
            {
                System.out.print((char)(ch2 + 32)+"  ");
            }
            else
            {
                System.out.print(ch2+"  ");
            }
    
        }
        System.out.println();
    }
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        int iNo2 = sobj.nextInt();

        Pattern(iNo1, iNo2);
    }
}