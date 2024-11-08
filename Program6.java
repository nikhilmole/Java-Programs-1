import java.util.*;

class Display 
{

    public int iNo;

    public Display(int iNum) {
        iNo = iNum;
    }

    public void Print() 
    {
        for (int i = 0; i < iNo; i++) 
        {
            System.out.print("*\t");
        
        }
    }
}

class Program6 
{
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number how many times you want display *: ");
        int iSize = sobj.nextInt();

        Display dobj = new Display(iSize);

        dobj.Print();
    }
}
