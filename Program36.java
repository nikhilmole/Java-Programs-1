import java.util.*;


class Program36
{
    static float FhToCs(float Temp)
    {
        float Celcius = 0.0f;

        Celcius = (Temp - 32) * (5.0f/9.0f);

        return Celcius;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter tempreature : ");
        float fNo = sobj.nextFloat();

        float fRet = FhToCs(fNo);

        System.out.println(fRet);
    }
}
