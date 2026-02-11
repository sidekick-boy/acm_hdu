import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            System.out.println("Case " + i + ":");
            System.out.println(a + " + " + b + " = " + a.add(b));

            if (i < t) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
