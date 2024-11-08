import java.util.*;


class Display 
{
    public int iNO;

    public Display(int iNo)
    {
        iNO = iNo;
    }

    public void Print() 
    {
        for (int i = iNO; i > 0; i--) 
        {
            System.out.println(i);
        }
    }
}
class Program4 {
    public static void main(String Argv[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number u want to display in reverse order :");
        int iNum = sobj.nextInt();
        
        Display dobj = new Display(iNum);

        dobj.Print();
    }
}
