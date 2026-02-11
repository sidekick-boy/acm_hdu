package problem._1008;

import java.util.Scanner;

/**
 * HDOJ 1008 - Elevator
 *
 * 问题描述：计算电梯运行时间，上楼每层 6 秒，下楼每层 4 秒，每停一层 5 秒
 * 输入格式：多组数据，每组 N 个楼层请求（N=0 结束），然后 N 个楼层
 * 输出格式：输出总时间
 * 约束：楼层在 1-100 之间，初始在 0 层
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            int currentFloor = 0;
            int totalTime = 0;

            for (int i = 0; i < n; i++) {
                int nextFloor = scanner.nextInt();

                if (nextFloor > currentFloor) {
                    // 上楼：每层 6 秒
                    totalTime += (nextFloor - currentFloor) * 6;
                } else if (nextFloor < currentFloor) {
                    // 下楼：每层 4 秒
                    totalTime += (currentFloor - nextFloor) * 4;
                }
                // 停靠：5 秒
                totalTime += 5;

                currentFloor = nextFloor;
            }

            System.out.println(totalTime);
        }

        scanner.close();
    }
}
