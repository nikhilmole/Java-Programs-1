import java.util.*;

class Display
{
    public int iNum;
    public int iIter;

    public Display(int iNo1, int iNo2)
    {
        iNum = iNo1;
        iIter = iNo2;
    }
    public void Print()
    {
        int i = 0;
        for( i = 0; i < iIter; i++)
        {
            System.out.print(iNum+"\t");
        }
    }
}
class Program10
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter number you want to display: ");
        int iNo = sobj.nextInt();

        System.out.println("How many time you want display the number :");
        int iFreq = sobj.nextInt();

        Display dobj = new Display(iNo,iFreq);

        dobj.Print();
    }
}