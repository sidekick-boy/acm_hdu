package hdu_acm.problem.A;

import java.util.Scanner;

/**
 * HDOJ A+B Problem
 *
 * 问题描述：计算两个整数 a 和 b 的和
 * 输入格式：多行输入，每行两个整数 a 和 b
 * 输出格式：每行输出 a + b 的结果
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
        scanner.close();
    }
}
