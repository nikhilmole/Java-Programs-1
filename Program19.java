import java.util.*;

class Facto
{
    public int iNum;

    public Facto(int iValue)
    {
        iNum = iValue;
    }
    public int NonFactoSum()
    {
        int i = 0;
        int iSum = 0;

        for(i = 1; i <= iNum; i++)
        {
            if(iNum % i != 0)
            {
                iSum = iSum + i;
            }
        }
        return iSum;
    }
}
class Program19
{
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Facto fobj = new Facto(iNo);

        int iRet = fobj.NonFactoSum();

        System.out.println("Summation of non factorial is : "+iRet);
    }   
}