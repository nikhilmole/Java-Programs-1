import java.util.*;

class Program90
{
    static void Divi(int Arr[], int iLength)
    {
        int i = 0;

        System.out.println("Number divisible by 5 or 3 are : ");
        for(i = 0; i < iLength; i++)
        {
            if((Arr[i] % 3 == 0)&&(Arr[i] % 5 == 0))
            {
                System.out.println(Arr[i]);
            }
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        
        System.out.println("How many number you want to add : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers :");

        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        Divi(P,iSize);
    }
}