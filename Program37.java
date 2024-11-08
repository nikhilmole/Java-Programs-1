import java.util.*;

class Program37
{
    static double SquareMeter(float fValue)
    {
        double Ans = 0.0f;

        Ans = 0.0929 * fValue;

        return Ans;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Area in SqFit");
        float iNo = sobj.nextFloat();

        double dRet = SquareMeter(iNo);
        System.out.println(dRet);
    }
}