import java.util.*;

class Print
{
    public int iNum;
    
    public Print(int iPrint)
    {
        iNum = iPrint;
    }

    public void Display()
    {
        int i = 0;

        for(i = 0; i < iNum; i++)
        {
            System.out.println("Jay Ganesh\n");
        }
    }
}
class Program3
{
    public static void main (String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number u want to print JAy GAnesh on screen: ");
        int iNo = sobj.nextInt();

        Print pobj = new Print (iNo);

        pobj.Display();
    }
}