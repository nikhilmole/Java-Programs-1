import java.util.*;

class Display
{
    public int iNum;

    public Display(int iNo2)
    {
        iNum = iNo2;
    }

    public void Print()
    {
        int i = 0;
        for(i = 1; i <= (iNum/2); i++)
        {
            if(((iNum % i) == 0) && ((i % 2) == 0))
            {
                System.out.println(i);
            }
        }
    }
}
class Program14
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        Display dobj = new Display(iNo);

        dobj.Print();
    }
}