import java.util.*;

class Program89
{
    static void EvenOrDivisible(int Arr[], int iLength)
    {
        int i = 0;

        System.out.println("The numbers are even and divisible by 5 are : ");
        
        for(i = 0; i < iLength; i++)
        {
            if((Arr[i] % 2 == 0)&&(Arr[i] % 5 == 0))
            {
                System.out.println(Arr[i]);
            }
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want to add in array : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");
        int i = 0;

        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        EvenOrDivisible(P, iSize);
    }
}