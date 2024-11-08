import java.util.*;

class Program96
{
    static int Freq(int Arr[], int iLength, int iNum)
    {
        int i = 0;
        int iCnt = 0;

        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] == iNum)
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    public static void main(String[] Argv)
    {
        int iRet = 0;
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

        System.out.println("Which number you want to calculate frequency plss enter : ");
        int iNo = sobj.nextInt();

        iRet = Freq(P, iSize, iNo);
        System.out.println("Freq of "+iNo+"is : "+iRet);
    }
}