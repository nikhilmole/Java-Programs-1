import java.util.*;

class Program30
{
    static int DollerInRs(int iNum)
    {
        int Ans = 0;
        int Rs = 70;

        Ans = Rs * iNum;
        
        return Ans;
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Doller : ");
        int iNo = sobj.nextInt();

        int iRet = DollerInRs(iNo);
        System.out.println("Doller in rs is : "+iRet);
    }
}