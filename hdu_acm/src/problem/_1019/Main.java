package problem._1019;

import java.util.Scanner;

/**
 * HDOJ 1019 - Least Common Multiple
 *
 * 问题描述：求多个数的最小公倍数
 * 输入格式：多组数据，每组先输入 n，然后 n 个正整数
 * 输出格式：输出这些数的最小公倍数
 * 约束：lcm(a,b) = a*b/gcd(a,b)，多个数的lcm = lcm(lcm(a,b),c)...
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int result = 1;
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                result = lcm(result, num);
            }

            System.out.println(result);
        }

        scanner.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
