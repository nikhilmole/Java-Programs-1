import java.util.*;

class Pogram18
{
    static void NonFacto(int iNum)
    {
        int i = 0;
        if(iNum < 0)
        {
            iNum = -iNum;
        }
        for(i = 1; i < iNum; i++)
        {
            if(iNum % i != 0)
            {
                System.out.println("The non factorial number is : "+i);
            }
        }
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        NonFacto(iNo);
    }
}