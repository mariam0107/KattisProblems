
import java.util.Scanner;


public class KattisAutori {
    public static void main(String[] args) {
        String str;
        String output;
        output = "";
        char c;
        int pos;
        
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        
        c=str.charAt(0);
        output=output+c;
        for(pos=1;pos<str.length();pos++)
        {
            if(str.charAt(pos)=='-')
            {
                output+=str.charAt(pos+1);
                
        }
            
                
        
    }
        System.out.println(output);
    }
}

