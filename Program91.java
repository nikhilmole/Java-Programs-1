import java.util.*;

class Program91
{
    static void Divi(int Arr[], int iLength)
    {
        int i = 0;

        System.out.println("Numbers divisible by 11 are :");
        
        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] % 11 == 0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
    public static void main(String[] Argv)
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want to add in array : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");

        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        Divi(P, iSize);

    }
}