
import java.util.Scanner;
import java.lang.Math;

public class KattisPot {

    public static void main(String[] args) {
        int[] N = new int[10];
        int number, sum = 0, rnumber;
        int power;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            N[i] = sc.nextInt();
            power = N[i] % 10;
            rnumber = N[i] / 10;
            sum += Math.pow(rnumber, power);
        }
        System.out.println(sum);
    }
}
