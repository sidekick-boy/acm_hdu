package problem._1003;

import java.util.Scanner;

/**
 * HDOJ 1003 - Max Sum
 *
 * 问题描述：给定一个序列，求最大子段和，并输出起始和结束位置
 * 输入格式：第一行是测试用例数 T，每个用例先输入 N，然后 N 个整数
 * 输出格式：每个用例输出 "Case i:"，然后是最大值、起始位置、结束位置，用例间空行分隔
 * 约束：N <= 100,000，每个整数在 [-1000, 1000] 之间
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int caseNum = 1; caseNum <= t; caseNum++) {
            int n = scanner.nextInt();

            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;
            int start = 0, end = 0, tempStart = 0;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                if (currentSum + num < num) {
                    currentSum = num;
                    tempStart = i;
                } else {
                    currentSum += num;
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = tempStart;
                    end = i;
                }
            }

            System.out.println("Case " + caseNum + ":");
            System.out.println(maxSum + " " + (start + 1) + " " + (end + 1));

            if (caseNum < t) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
