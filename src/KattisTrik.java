
import java.util.Scanner;


public class KattisTrik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1;
                str1=sc.nextLine();
                char c,ch;
                int A=1,B=0,C=0;
                int temp;
                for (int i = 0; i < str1.length(); i++) {
                    c=str1.charAt(i);
            if(c=='A'||c=='a')
            {
                temp=A;
                A=B;
                B=temp;
            }
            else if(c=='B'||c=='b')
              {
                temp=B;
                B=C;
                C=temp;
            }
            else if(c=='C'||c=='c')
              {
                temp=C;
                C=A;
                A=temp;
            }
                }
            if(A==1)
           System.out.println(1);  
            else if(B==1)
           System.out.println(2); 
            else if(C==1)
           System.out.println(3);  
        }
    }

