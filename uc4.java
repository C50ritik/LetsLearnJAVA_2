import java.awt.*;
import java.util.Scanner;
class uc4{
    Point P1=new Point();
    Point P2=new Point();
    Line(String s){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X and Y Co-ordinate Of 1st Point of "+ s);
        this.P1.x=sc.nextInt();
        this.P1.y=sc.nextInt();
        System.out.println("Now Enter Co-ordinate Of 2nd Point");
        this.P2.x=sc.nextInt();
        this.P2.y=sc.nextInt();
    }
    public double cal(){
        double ans= Math.pow((P2.x- P1.x),2)+Math.pow((P2.y- P1.y),2);
        ans=Math.sqrt(ans);
        return ans;
    }
}
public class Check {
    public static void main(String[] args) {
        Line l1=new Line("_1st Line");
        Line l2=new Line("_2nd Line");
        String s1=String.valueOf(l1.cal()),s2=String.valueOf(l2.cal());
        System.out.println( s1.compareTo(s2)==0 ? "Lines are equal in length" : ( s1.compareTo(s2)>0 ? "First Line is Greater" : "Second Line is Greater"));
    }
}
