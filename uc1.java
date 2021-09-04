import java.awt.*;
import java.util.Scanner;

public class UC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X and Y Co-ordinate Of 1st Point");
        Point p1=new Point(sc.nextInt(),sc.nextInt());
        System.out.println("Now 2nd Point");
        Point p2=new Point(sc.nextInt(),sc.nextInt());
        double ans= Math.pow((p2.x- p1.x),2)+Math.pow((p2.y- p1.y),2);
        ans=Math.sqrt(ans);
        System.out.println("Length Of Line "+ans );
    }
}
