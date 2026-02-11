package problem._1009;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * HDOJ 1009 - FatMouse' Trade
 *
 * 问题描述：用猫粮换 JavaBean，优先换汇率高的房间
 * 输入格式：多组数据，每组先输入 M（猫粮）、N（房间数），然后 N 对（catFood, javaBean）
 * 输出格式：输出最多能得到的 JavaBean 数量
 * 约束：贪心算法，按 javaBean/catFood 比率降序排列
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            if (m == -1 && n == -1) {
                break;
            }

            double[][] rooms = new double[n][2];

            for (int i = 0; i < n; i++) {
                rooms[i][0] = scanner.nextDouble(); // javaBean
                rooms[i][1] = scanner.nextDouble(); // catFood
            }

            // 按汇率降序排序（javaBean/catFood）
            Arrays.sort(rooms, new Comparator<double[]>() {
                @Override
                public int compare(double[] a, double[] b) {
                    double rate1 = a[0] / a[1];
                    double rate2 = b[0] / b[1];
                    return Double.compare(rate2, rate1);
                }
            });

            double totalBeans = 0;
            double remainingFood = m;

            for (int i = 0; i < n && remainingFood > 0; i++) {
                double beans = rooms[i][0];
                double foodNeeded = rooms[i][1];

                if (remainingFood >= foodNeeded) {
                    totalBeans += beans;
                    remainingFood -= foodNeeded;
                } else {
                    totalBeans += beans * (remainingFood / foodNeeded);
                    remainingFood = 0;
                }
            }

            System.out.printf("%.3f%n", totalBeans);
        }

        scanner.close();
    }
}
