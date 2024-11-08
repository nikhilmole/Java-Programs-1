import java.util.*;

class Program34
{
    static float CircleArea(float PI, float Radius)
    {
        float Area = 0.0f;

        Area = PI * Radius * Radius;
        return Area;
    }
    public static void main(String[] Argv)
    {
        float fRet = 0.0f;
        float PI = 3.14f;

        Scanner sobj = new Scanner(System.in);

        Sysytem.out.println("Enter Radius : ");
        float Radius = sobj.nextFloat();

        fRet = CircleArea(PI,Radius);

        System.out.println(fRet);
    }
}