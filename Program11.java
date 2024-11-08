import java.util.*;

class Display
{
    public int iNum;

    public Display(int iNo2)
    {
        iNum = iNo2;
    }
    public boolean Print()
    {
        if(iNum > 0)
        {
            iNum = -iNum;
        }
        if((iNum % 2) == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    } 
}

class Program11
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter number you wnat chaeck its even or odd: ");
        int iNo1 = sobj.nextInt();

        Display dobj = new Display(iNo1);
        
        boolean bRet = false;

        bRet = dobj.Print();
        if(bRet == true)
        {
            System.out.println("The number you entered is a even number");
        }
        else
        {
            System.out.println("the number you entered is a odd number");
        }
    }
}