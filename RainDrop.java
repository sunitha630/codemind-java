import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%3==0)
        {
            System.out.print("Pling");
        }
        if(a%5==0)
        {
            System.out.print("Plang");
        }
        if(a%7==0)
        {
            System.out.print("Plong");
        }
        if(a%3!=0 && a%5!=0 && a%7!=0)
        {
            System.out.print(a);
        }
    }
}