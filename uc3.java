import java.awt.*;
import java.util.Scanner;

public class UC3 {
    public static double length_line(String s){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X and Y Co-ordinate Of 1st Point of "+ s);
        Point p1=new Point(sc.nextInt(),sc.nextInt());
        System.out.println("Now 2nd Point");
        Point p2=new Point(sc.nextInt(),sc.nextInt());
        double ans= Math.pow((p2.x- p1.x),2)+Math.pow((p2.y- p1.y),2);
        ans=Math.sqrt(ans);
        return ans;
    }
    public static void main(String[] args) {
        double l1=length_line("_1st Line");
        double l2=length_line("_2nd Line");
        String s1=String.valueOf(l1),s2=String.valueOf(l2);
        System.out.println( s1.compareTo(s2)==0 ? "Lines are equal in length" : ( s1.compareTo(s2)>0 ? "First Line is Greater" : "Second Line is Greater"));
    }
}
