import java.util.*;

class Display 
{
    public int iNum;

    public Display(int iNo1)
    {
        iNum = iNo1;
    }
    public void Print()
    {
        int iCnt = 0;

        while(iCnt < iNum)
        {
            System.out.print("*\t");
            iCnt++;
        }
    }
}
class Program8
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number you want display *: ");
        int iNo = sobj.nextInt();

        Display dobj = new Display(iNo);

        dobj.Print();
    }
}