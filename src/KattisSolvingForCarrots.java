
import java.util.Scanner;

public class KattisSolvingForCarrots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        if (P <= 1000) {
            System.out.println(P);
        } else {
            System.out.println("1000");
        }
    }
}
