import java.util.*;

class Program32
{
    static int OddFacto(int iNum)
    {
        int i = 0;
        int iFacto = 1;

        for(i = 1; i <= iNum; i++)
        {
            if(i % 2 != 0)
            {
                iFacto = iFacto * i;
            }
        }
        return iFacto;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the nuymber : ");
        int iNo = sobj.nextInt();

        int iRet = OddFacto(iNo);
        System.out.println(iRet);
    }
}