import java.util.*;

class Program98
{
    static int FirstOcc(int Arr[], int iLength, int iNum)
    {
        int i = 0;

        for(i = 0; i < iLength; i++)
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
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many nummbers you want add in array : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");

        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        System.out.println("Enter number you want to search index number: ");
        int iNo = sobj.nextInt();

        iRet = FirstOcc(P, iSize, iNo);

        if(iRet == -1)
        {
            System.out.println("There is no such a number");
        }
        else
        {
            System.out.println("The First occurance "+iNo+" is a index : "+iRet);
        }
    }   
}