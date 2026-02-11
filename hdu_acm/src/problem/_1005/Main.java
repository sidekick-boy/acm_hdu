package problem._1005;

import java.util.Scanner;

/**
 * HDOJ 1005 - Number Sequence
 *
 * 问题描述：f(n) = A*f(n-1) + B*f(n-2)，求第 n 项
 * 输入格式：多组数据，每组 A, B, n（n <= 7），当 A=0, B=0, n=0 时结束
 * 输出格式：输出 f(n) % 7 的结果
 * 约束：注意模运算性质，f(n) % 7 有周期性
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            if (a == 0 && b == 0 && n == 0) {
                break;
            }

            if (n <= 2) {
                System.out.println(1);
                continue;
            }

            int f1 = 1, f2 = 1;
            for (int i = 3; i <= n; i++) {
                int f3 = (a * f2 + b * f1) % 7;
                f1 = f2;
                f2 = f3;
            }

            System.out.println(f2);
        }

        scanner.close();
    }
}
