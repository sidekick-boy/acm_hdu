# ACM HDOJ Solutions

本项目包含杭州电子科技大学在线评测系统（HDOJ）的题目解答。

## 项目特点

本项目中的所有题目解答均使用 **Claude Code** 进行编程和自动提交到 GitHub。

## 已解决问题

| 题号 | 题目 | 路径 |
|------|------|------|
| 1000 | Sum Problem | [problem/_1000/Main.java](hdu_acm/src/problem/_1000/Main.java) |
| 1002 | A + B Problem II | [problem/_1002/Main.java](hdu_acm/src/problem/_1002/Main.java) |
| 1003 | Max Sum | [problem/_1003/Main.java](hdu_acm/src/problem/_1003/Main.java) |
| 1004 | Let the Balloon Rise | [problem/_1004/Main.java](hdu_acm/src/problem/_1004/Main.java) |
| 1005 | Number Sequence | [problem/_1005/Main.java](hdu_acm/src/problem/_1005/Main.java) |
| 1008 | Elevator | [problem/_1008/Main.java](hdu_acm/src/problem/_1008/Main.java) |
| 1009 | FatMouse' Trade | [problem/_1009/Main.java](hdu_acm/src/problem/_1009/Main.java) |
| 1012 | u Calculate e | [problem/_1012/Main.java](hdu_acm/src/problem/_1012/Main.java) |
| 1013 | The 3n + 1 problem | [problem/_1013/Main.java](hdu_acm/src/problem/_1013/Main.java) |
| 1014 | Uniform Generator | [problem/_1014/Main.java](hdu_acm/src/problem/_1014/Main.java) |
| 1018 | Big Number | [problem/_1018/Main.java](hdu_acm/src/problem/_1018/Main.java) |
| 1019 | Least Common Multiple | [problem/_1019/Main.java](hdu_acm/src/problem/_1019/Main.java) |
| 1020 | Encoding | [problem/_1020/Main.java](hdu_acm/src/problem/_1020/Main.java) |

**待实现的复杂题目**（需要高级算法）：
- 1006: Tick and Tock
- 1007: Quoit Design (最近点对)
- 1010: Tempter of the Bone (DFS)
- 1011: Starship Troopers (树形DP)
- 1015: Safecracker (暴力搜索)
- 1016: Prime Ring Problem (回溯)
- 1017: A Mathematical Curiosity

## 目录结构

每个题目解答都存储在独立的子目录中，所有 Java 文件的类名均为 `Main`，通过包路径来区分题目：

```
hdu_acm/
└── src/           # 源代码目录
    └── problem/   # 所有题目解答
        ├── _1000/ # Sum Problem - 求和问题
        ├── _1002/ # A + B Problem II - 大数加法
        ├── _1003/ # Max Sum - 最大子段和（Kadane 算法）
        ├── _1004/ # Let the Balloon Rise - 统计出现最多的颜色
        ├── _1005/ # Number Sequence - 数列模7
        ├── _1008/ # Elevator - 电梯时间计算
        ├── _1009/ # FatMouse' Trade - 贪心算法
        ├── _1012/ # u Calculate e - 计算 e 值
        ├── _1013/ # The 3n + 1 problem - 3n+1 猜想
        ├── _1014/ # Uniform Generator - 随机数生成器判断
        ├── _1018/ # Big Number - 阶乘位数
        ├── _1019/ # Least Common Multiple - 最小公倍数
        └── _1020/ # Encoding - 编码统计
```

## 包路径规范

所有题目解答使用统一的包路径规范：`problem._{题号}`，避免类名冲突。每个题目的包名以下划线+数字开头，便于排序和识别。

## 开发工具

- **编程助手**: Claude Code
- **语言**: Java

## 许可证

MIT License
