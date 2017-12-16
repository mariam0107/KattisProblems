
import java.util.Scanner;

public class KattisFaktor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int I = sc.nextInt();
        if (A == 1) {
            System.out.println(I);
        } else {
            System.out.println((A * I) - (A - 1));
        }
    }

}
