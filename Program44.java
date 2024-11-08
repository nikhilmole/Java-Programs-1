import java.util.*;

class Program44
{
    static boolean DisplayDig(int iNum)
    {
        int iDigit = 0;
        boolean bflag = false; 
        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum > 0)
        {
            iDigit = iNum % 10;
            iNum = iNum / 10;
            if(iDigit == 0)
            {
                bflag = true;
            }            
        }
        return bflag;
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        boolean bRet = DisplayDig(iNo);
        if(bRet == true)
        {
            System.out.println("Zero contains");
        }
        else
        {
            System.out.println("Zero not available");
        }
    }
}