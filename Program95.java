import java.util.*;

class Program95
{
    static int Freq(int Arr[], int iLength)
    {
        int i = 0;
        int iCnt = 0;

        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] == 11)
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    public static void main(String[] Argv)
    {
        int i = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want add : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");

        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        iRet = Freq(P, iSize);
        System.out.println("frequency of 11 is : "+iRet);

    }
}