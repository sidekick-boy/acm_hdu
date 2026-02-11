package problem._1018;

import java.util.Scanner;

/**
 * HDOJ 1018 - Big Number
 *
 * 问题描述：给定 n，求 n! 的位数
 * 输入格式：多组数据，每组输入 n（0 <= n <= 10^7）
 * 输出格式：输出 n! 的位数
 * 约束：使用对数公式：log10(n!) = sum(log10(i))，位数 = floor(sum) + 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println(1);
                continue;
            }

            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += Math.log10(i);
            }

            System.out.println((int) sum + 1);
        }

        scanner.close();
    }
}
