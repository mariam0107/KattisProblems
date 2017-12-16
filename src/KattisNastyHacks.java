
import java.util.Scanner;

public class KattisNastyHacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] cases;

        cases = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                cases[i][j] = sc.nextInt();

            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            if ((cases[i][0] + cases[i][2]) == cases[i][1]) {
                System.out.println("DOES NOT MATTER");

            } else if ((cases[i][0] + cases[i][2]) < cases[i][1]) {
                System.out.println("ADVERTISE");

            } else {
                System.out.println("DO NOT ADVERTISE");

            }

        }

    }
}
