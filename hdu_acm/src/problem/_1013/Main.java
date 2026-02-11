package problem._1013;

import java.util.Scanner;

/**
 * HDOJ 1013 - The 3n + 1 problem
 *
 * 问题描述：对于 3n+1 问题，给定范围 [i, j]，求最长循环长度
 * 输入格式：多组数据，每组两个整数 i 和 j
 * 输出格式：输出 i, j 和它们之间的最大循环长度
 * 约束：i, j 在 [0, 10000] 之间，i 不一定小于 j
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int start = Math.min(i, j);
            int end = Math.max(i, j);

            int maxLength = 0;

            for (int n = start; n <= end; n++) {
                int length = getCycleLength(n);
                maxLength = Math.max(maxLength, length);
            }

            System.out.println(i + " " + j + " " + maxLength);
        }

        scanner.close();
    }

    private static int getCycleLength(int n) {
        int length = 1;

        while (n != 1) {
            if (n % 2 == 1) {
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }
            length++;
        }

        return length;
    }
}
