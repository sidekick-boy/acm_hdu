import java.util.Scanner;

/**
 * HDOJ Sum Problem
 *
 * 问题描述：计算 SUM(n) = 1 + 2 + 3 + ... + n
 * 输入格式：多行输入，每行一个整数 n
 * 输出格式：每行输出 SUM(n) 的结果，后跟一个空行
 * 约束：结果在 32-bit signed integer 范围内
 */
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
