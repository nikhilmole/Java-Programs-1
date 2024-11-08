import java.util.*;


class Program94
{
    static boolean Search(int Arr[], int iLength)
    {
        int i = 0;
        boolean bFlag = false;

        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] == 11)
            {
                bFlag =true;
                break;
            }
        }
        return bFlag;
    }
    public static void main(String[] Argv)
    {
        int i = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want to add : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");
        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        bRet = Search(P, iSize);

        if(bRet == true)
        {
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is not present");
        }
    }
}