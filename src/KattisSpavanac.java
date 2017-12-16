
import java.util.Scanner;


public class KattisSpavanac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int total=h*60+m;
        total=total-45;
        h=total/60;
        int nm=total%60;
        if(h==0)
        {
             nm=60+nm;
             System.out.print(23);
             System.out.println(" "+nm);
        }
        else
        {
        System.out.print(h+" ");
        System.out.print(nm);
        }
        
        
                
    }
}
