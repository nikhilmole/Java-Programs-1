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

        if(iNum < 0)
        {
            iNum = -iNum;
        }
        while(iNum >= i)
        {
            System.out.print("*");
            i++;
        }
    }
}
class Program7
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the number you want to display * on screen: ");
        int iNo1 = sobj.nextInt();

        Display dobj = new Display(iNo1);
        
        dobj.Print();

    }
}