import java.math.BigInteger;
import java.util.Scanner;

/**
 * HDOJ 1002 - A + B Problem II
 *
 * 问题描述：计算两个大数的和，数字可能超过普通整数范围
 * 输入格式：第一行是测试用例数 T，之后每行两个大数 a 和 b
 * 输出格式：每个用例输出 "Case i:" 后跟 "a + b = result"，用例间空行分隔
 */
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
