import java.util.Scanner;
public class RightMost1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i<<=1){
            if((n&i)!=0){
                System.out.print(i);
                System.exit(0);  

            }
        }
    }
}