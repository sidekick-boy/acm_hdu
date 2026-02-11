package problem._1014;

import java.util.HashSet;
import java.util.Scanner;

/**
 * HDOJ 1014 - Uniform Generator
 *
 * 问题描述：判断随机数生成器是否是"好的"
 * 输入格式：多组数据，每组 STEP, MOD
 * 输出格式：如果是好的输出 "Good Choice"，否则输出 "Bad Choice"
 * 约束：生成器 Xnext = (Xprev + STEP) % MOD，好的生成器能产生 MOD 个不同的值
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int step = scanner.nextInt();
            int mod = scanner.nextInt();

            if (step == 0 && mod == 0) {
                break;
            }

            // 生成器的好的条件：step 和 mod 互质（gcd(step, mod) == 1）
            if (gcd(step, mod) == 1) {
                System.out.printf("%10d%10d    Good Choice%n", step, mod);
            } else {
                System.out.printf("%10d%10d    Bad Choice%n", step, mod);
            }
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
}
