import java.util.*;

class Program16
{
    static void EvenNumber(int iNum)
    {
        int i = 0;

        for(i = 1; i <= iNum/2; i++)
        {
            if((i % 2 == 0) && (iNum % i == 0))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("En ter the number : ");

        int iNo = sobj.nextInt();

        EvenNumber(iNo);
    }
}