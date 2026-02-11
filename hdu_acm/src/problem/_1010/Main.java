package problem._1010;

import java.util.Scanner;

/**
 * HDOJ 1010 - Tempter of the Bone
 *
 * 问题描述：小狗在迷宫中寻找朋友，判断是否能在恰好T秒内从S点到达D点
 * 输入格式：多组数据，每组输入 N, M, T，然后是 N×M 的迷宫地图
 * 输出格式：如果能恰好T秒到达输出 "YES"，否则输出 "NO"
 * 约束：N, M <= 7，T <= 50
 *
 * 算法：DFS + 三种剪枝优化
 * 1. 奇偶剪枝：根据起点终点颜色判断所需步数的奇偶性
 * 2. 最短路径剪枝：剩余时间不足以到达终点
 * 3. 可行格子数剪枝：时间超过可走格子数
 */
public class Main {
    static int N, M, T;
    static char[][] maze;
    static boolean[][] visited;
    static int startX, startY, endX, endY;
    static boolean success;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            N = scanner.nextInt();
            M = scanner.nextInt();
            T = scanner.nextInt();

            if (N == 0 && M == 0 && T == 0) {
                break;
            }

            maze = new char[N][M];
            visited = new boolean[N][M];
            success = false;
            int wallCount = 0;

            for (int i = 0; i < N; i++) {
                String line = scanner.next();
                for (int j = 0; j < M; j++) {
                    maze[i][j] = line.charAt(j);

                    if (maze[i][j] == 'S') {
                        startX = i;
                        startY = j;
                    } else if (maze[i][j] == 'D') {
                        endX = i;
                        endY = j;
                    } else if (maze[i][j] == 'X') {
                        wallCount++;
                    }
                }
            }

            // 剪枝3：检查可用格子数是否足够
            if (T > N * M - wallCount - 1) {
                System.out.println("NO");
                continue;
            }

            visited[startX][startY] = true;
            dfs(startX, startY, 0);

            if (success) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    /**
     * DFS搜索
     * @param x 当前x坐标
     * @param y 当前y坐标
     * @param time 已用时间
     */
    static void dfs(int x, int y, int time) {
        if (success) {
            return; // 已找到解，剪枝
        }

        // 到达终点
        if (x == endX && y == endY && time == T) {
            success = true;
            return;
        }

        // 超过时间
        if (time >= T) {
            return;
        }

        // 剪枝1：奇偶性检查
        int minDist = Math.abs(x - endX) + Math.abs(y - endY);
        if ((minDist % 2) != ((T - time) % 2)) {
            return;
        }

        // 剪枝2：剩余时间不足以到达终点
        if (time + minDist > T) {
            return;
        }

        // 四个方向搜索
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 边界检查
            if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                continue;
            }

            // 障碍物或已访问
            if (maze[nx][ny] == 'X' || visited[nx][ny]) {
                continue;
            }

            visited[nx][ny] = true;
            dfs(nx, ny, time + 1);
            visited[nx][ny] = false; // 回溯

            if (success) {
                return;
            }
        }
    }
}
