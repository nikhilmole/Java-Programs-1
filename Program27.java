import java.util.*;

class Facto
{
    public int iNum;

    public Facto(int iValue)
    {
        iNum = iValue;
    }

    public int Factorial()
    {
        int i = 0;
        int iFacto = 1;

        for(i = 1; i <= iNum; i++)
        {
            iFacto = iFacto * i;
        }
        return iFacto;
    }
}

class Program27
{
    public static void main(String[] Arhv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Facto fobj = new Facto(iNo);

        int iRet = fobj.Factorial();
        System.out.println("Factorial is : "+iRet);
    }
}