
import java.util.Scanner;
public class KattisSpeedLimit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean loop=true;
        int n;
        int[] arr=new int[10];
        int j=0;
        //int count=0;
        while(loop)
        {
             n=sc.nextInt();
            if(n!=-1)
            {
                 //count=1;
                int t=0,s,tl,sum=0;
               for(int i=0;i<n;i++) 
               {
                  s=sc.nextInt() ;
                  tl=sc.nextInt();
                  sum+=(s*(tl-t));
                  t=tl;
               }
               arr[j]=sum;
               j++;
               //count++;
                
            }
            else
                loop=false;
        }
        for(int i=0;i<j;i++)
            System.out.println(arr[i]+" miles");
            
         
    }
    
}
