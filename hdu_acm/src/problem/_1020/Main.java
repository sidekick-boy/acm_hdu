package problem._1020;

import java.util.Scanner;

/**
 * HDOJ 1020 - Encoding
 *
 * 问题描述：统计字符串中各字符出现次数，按字母降序、出现次数降序、ASCII码升序输出
 * 输入格式：多组数据，每组输入一个字符串
 * 输出格式：输出字符及其出现次数，按排序规则输出
 * 约束：只考虑大写字母，字母按出现次数降序，相同则按ASCII升序
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            int[] count = new int[26];

            for (char c : line.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    count[c - 'A']++;
                }
            }

            // 使用冒泡排序，按次数降序，字母升序
            int[] order = new int[26];
            for (int i = 0; i < 26; i++) {
                order[i] = i;
            }

            for (int i = 0; i < 26; i++) {
                for (int j = i + 1; j < 26; j++) {
                    int charI = order[i];
                    int charJ = order[j];

                    if (count[charJ] > count[charI] ||
                        (count[charJ] == count[charI] && charJ < charI)) {
                        int temp = order[i];
                        order[i] = order[j];
                        order[j] = temp;
                    }
                }
            }

            int weight = 26;
            int total = 0;

            for (int i = 0; i < 26; i++) {
                int charIndex = order[i];
                if (count[charIndex] > 0) {
                    total += count[charIndex] * weight;
                    weight--;
                }
            }

            System.out.println(total);
        }

        scanner.close();
    }
}
