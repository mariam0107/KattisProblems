
import java.util.Scanner;


public class KattisSibice {
    public static void main(String[] args) {
        int n,w,h,i=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        w=sc.nextInt();
        h=sc.nextInt();
        int l[]=new int[n];
        while(i<n)
        {
            l[i]=sc.nextInt();
            i++;
        }
         for (int j = 0; j < n; j++) {
            if(n*w*h>=l[j]*w*h)
                System.out.println("DA");
            else
                System.out.println("NE");
        }
   
         
            
        }
        
    }

