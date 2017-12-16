
import java.util.Scanner;


public class KattisBijele {
    public static void main(String[] args) {
        int k,q,r,b,kn,p;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        q=sc.nextInt();
        r=sc.nextInt();
        b=sc.nextInt();
        kn=sc.nextInt();
        p=sc.nextInt();
        
              k=k-1;
              q=q-1;
              r=r-2;
              b=b-2;
              kn=kn-2;
              p=p-8;
              if(k<0)
                  System.out.print(1);
              else if(k>0)
                  System.out.print((-k));
              else
   System.out.print(k);
              if(q<0)
                  System.out.print(" "+1);
              else if(q>0)
                  System.out.print(" "+(-q));
              else
   System.out.print(" "+q);
              if(r<0)
                  System.out.print(" "+(-r));
              else if(r>0)
                  System.out.print(" "+(-r));
              else
   System.out.print(" "+r);
              if(b<0)
                  System.out.print(" "+(-b));
              else if(b>0)
                  System.out.print(" "+(-b));
              else
   System.out.print(" "+b);
              if(kn<0)
                  System.out.print(" "+(-kn));
              else if(kn>0)
                  System.out.print(" "+(-kn));
              else
   System.out.print(" "+kn);
              if(p<0)
                  System.out.print(" "+(-p));
              else if(p>0)
                  System.out.print(" "+(-p));
              else
   System.out.print(" "+p);
              System.out.println();
              
              
              
            
            }
}
