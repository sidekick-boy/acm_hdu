import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            long sum = (long) n * (n + 1) / 2;
            System.out.println(sum);
            System.out.println();
        }
        scanner.close();
    }
}
