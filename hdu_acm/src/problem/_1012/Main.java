package problem._1012;

import java.util.Scanner;

/**
 * HDOJ 1012 - u Calculate e
 *
 * 问题描述：计算 e 的值，使用公式 e = 1 + 1/1! + 1/2! + ... + 1/n!
 * 输入格式：输入 n（0 <= n <= 9）
 * 输出格式：输出前 n+1 项 e 的值
 * 约束：n 最大为 9
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            double e = 1.0;
            double factorial = 1.0;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
                e += 1.0 / factorial;
            }

            System.out.printf("%.9f%n", e);
        }

        scanner.close();
    }
}
