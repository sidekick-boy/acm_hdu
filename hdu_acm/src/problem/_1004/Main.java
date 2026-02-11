package problem._1004;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * HDOJ 1004 - Let the Balloon Rise
 *
 * 问题描述：统计出现次数最多的颜色
 * 输入格式：多组测试用例，每组先输入气球数量 N（N=0 时结束），然后 N 个颜色名称
 * 输出格式：每组输出出现次数最多的颜色名称
 * 约束：N <= 1000，颜色名称不超过 15 个字符
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            Map<String, Integer> colorCount = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String color = scanner.next();
                colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            }

            String maxColor = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : colorCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxColor = entry.getKey();
                }
            }

            System.out.println(maxColor);
        }

        scanner.close();
    }
}
