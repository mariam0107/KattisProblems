
import java.util.Scanner;

public class KattisR2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int S = sc.nextInt();
        if ((R1 >= -1000 && R1 <= 1000) && (S >= -1000 && S <= 1000)) {
            System.out.println(2 * S - R1);
        }

    }
}
