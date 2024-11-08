import java.util.*;

class Program97
{
    static boolean Search(int Arr[], int iLength, int iNum)
    {
        int i = 0;
        boolean bFlag = false;

        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] == iNum)
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
    public static void main(String[] Argv)
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want to add : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");
        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        System.out.println("Which number you want to search is present or not : ");
        int iNo = sobj.nextInt();

        boolean bRet = Search(P, iSize, iNo);
        if(bRet == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}