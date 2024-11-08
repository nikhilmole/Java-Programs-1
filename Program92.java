import java.util.*;

class Nnumbers
{
    public int iLength;
    public int Arr[];

    Nnumbers(int iSize)
    {
        iLength = iSize;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);
        
        for(i = 0; i < iLength; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public int EvenCount()
    {
        int i = 0;
        int iCnt = 0;

        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program92
{
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want to add in array : ");
        int iSize = sobj.nextInt();

        Nnumbers nobj = new Nnumbers(iSize);

        nobj.Accept();
        int iRet = nobj.EvenCount();
        System.out.println("Numbers of evencount is : "+iRet);
    }
}