import java.util.*;

class Program100
{
    static void Range(int Arr[], int iLength, int iStart, int iEnd)
    {
        int i = 0;

        if(iStart > iEnd)
        {
            System.out.println("Starting range is greater than ending");
            return;
        }
        for(i = 0; i < iLength; i++)
        {
            if((Arr[i] > iStart)&&(Arr[i] < iEnd))
            {
                System.out.println(Arr[i]+"\t");
            }
        }
    }
    public static void main(String[] Argv)
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("How many numbes you want to add in array : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");
        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        System.out.println("Enter the starting range : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the ending range : ");
        int iNo2 = sobj.nextInt();

        Range(P, iSize, iNo1, iNo2);
    }
}