import java.util.*;

class Program88
{
    static void Divisible(int Arr[], int iLenght)
    {
        int i = 0;

        System.out.println("Divisible by 5 number is : ");

        for(i = 0; i < iLenght; i++)
        {
            if(Arr[i] % 5 == 0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("How many number you want to add : ");
        int iSize = sobj.nextInt();

        int p[] = new int[iSize];

        int i = 0;

        System.out.println("Enter the numbers : ");
        
        for(i = 0; i < iSize; i++)
        {
            p[i] = sobj.nextInt();
        }

        Divisible(p, iSize);
    }
}