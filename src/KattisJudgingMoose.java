
import java.util.Scanner;


public class KattisJudgingMoose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int big;
        if(l>=0&&r<=20)
        {
            if(l==0&&r==0)
                System.out.println("Not a moose");
            else if(l==r)
                System.out.println("Even "+(l+r));
            else
            {
                big=l;
            if(big<r)
                big=r;
                System.out.println("Odd "+2*big);
                
            }
        }
        else
            System.out.println("INvalid INPUT");
    }
}
