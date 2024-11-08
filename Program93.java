import java.util.*;

class Program93
{
    static int EvenOddCount(int Arr[], int iLength)
    {
        int i = 0;
        int iEvenCount = 0;
        int iOddCount = 0;
        int Ans = 0;

        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }
        Ans = iEvenCount - iOddCount;
        return Ans;
    }
    public static void main(String[] Argv)
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want add : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");
        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        int iRet = EvenOddCount(P, iSize);
        System.out.println("Difference between even and odd : "+iRet);
    }
}