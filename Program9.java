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
        if(iNum < 10)
        {
            System.out.println("The number is less than 10 ");
        }
        else
        {
            System.out.println("The nu8mber is greater than 10");
        }
    }
}
class Program9
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number you want to check is in less than 10 or greater than 10");
        int iNo = sobj.nextInt();

        Display dobj = new Display(iNo);

        dobj.Print();
    }
}