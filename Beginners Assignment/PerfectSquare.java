package BeginnerAssignment;
import java.util.*;
import java.lang.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sqr=Math.sqrt(n);
        double b=Math.floor(sqr);
        if((sqr-b)==0.00){
            System.out.print("The given number is a perfect square");
        }else{
            System.out.print("The given number is not a perfect square");
        }
    }
}