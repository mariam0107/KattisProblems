
import java.util.Scanner;

public class KattisColdPuterScience {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temperatures, count = 0;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            temperatures = sc.nextInt();
            if (temperatures < 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
