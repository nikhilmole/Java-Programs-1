import java.util.*;

class Program42
{
    static void RangeDisplayRev(int Start, int End)
    {
        int i = 0;
        if(Start > End)
        {
            System.out.println("Invalid Option");
        }
        for(i = End; i >= Start; i--)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter starting point");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter ending point");
        int iNo2 = sobj.nextInt();

        RangeDisplayRev(iNo1, iNo2);

    }
}