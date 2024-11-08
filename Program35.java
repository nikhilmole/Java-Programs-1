import java.util.*;

class Program35
{
    static int KMToMeter(int Meter, int inum)
    {
        int Ans = 0;

        Ans = Meter * inum;

        return Ans;
    }
    public static void main(String[] Argv)
    {
        int meter = 1000;
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter klilometer : ");
        iNo = sobj.nextInt();

        iRet = KMToMeter(meter,iNo);
        System.out.println(iRet);
    }

}