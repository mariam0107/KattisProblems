
import java.util.Scanner;

public class KattiesOddities {

    public static void main(String[] args) {
        int[] x = new int[20];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (x[i] % 2 == 0) {
                System.out.println("" + x[i] + " is even");
            } else {
                System.out.println("" + x[i] + " is odd");
            }

        }

    }
}
