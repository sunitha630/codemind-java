import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if((5*x) >= y)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}