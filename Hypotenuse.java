import java.util.Scanner;
import java.lang.*;
public class Double{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double z=Math.sqrt(((x*x)+(y*y)));
        System.out.printf("%.2f",z);
        
    }
}