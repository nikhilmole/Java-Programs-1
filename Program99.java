import java.util.*;


class Program99
{
    static int FirstOcc(int Arr[], int iLength, int iNum)
    {
        int i = 0;

        for(i = iLength-1; i >= 0; i--)
        {
            if(Arr[i] == iNum)
            {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] Argv)
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want to add in : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");
        for(i = 0; i < iSize; i++)
        {
            P[i] =sobj.nextInt();
        }

        System.out.println("Enter number for getting First occurunce : ");
        int iNo = sobj.nextInt();

        int iRet = FirstOcc(P, iSize, iNo);
        if(iRet == -1)
        {
            System.out.println("The number is not present");
        }
        else
        {
            System.out.println("The Last opccurance is : "+iRet);
        }
    }
}