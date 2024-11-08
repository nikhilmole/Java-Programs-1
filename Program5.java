import java.util.*;

class Display
{
    public int iNum;
    
    public Display(int iNo1)
    {
        iNum = iNo1;
    }

    public void Divisible()
    {
        int i = 0;

        if((iNum % 5) == 0)
        {
            System.out.println("The number are divisuible by 5 ");
        }
        else
        {
            System.out.println("The number is not divisible by 5");
        }
    }
}
class Program5
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number you want check its divisible or not: ");
        int iNo = sobj.nextInt();

        Display dobj = new Display(iNo);

        dobj.Divisible();
        
    }
}