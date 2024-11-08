import java.util.*;

class Program87
{
    static int Difference(int Arr[], int iLength)
    {
        int i = 0;
        int OddSum = 0;
        int EvenSum = 0;
        int Ans = 0;

        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                EvenSum = EvenSum + Arr[i]; 
            }
            else
            {
                OddSum = OddSum + Arr[i];
            }
        }
        Ans = EvenSum - OddSum;
        return Ans;
    }
    public static void main(String[] Argv)
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        if(Arr == null)
        {
            System.out.println("Unable to allocate the memory");
        }

        int i = 0;

        System.out.println("Enter the "+iSize+"elements :");
        for( i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int iret = Difference(Arr,iSize);
        System.out.println("Difference is : "+iret);
        
    }
}