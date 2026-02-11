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

## 目录结构

每个题目解答都存储在独立的子目录中，所有 Java 文件的类名均为 `Main`，通过包路径来区分题目：

```
hdu_acm/
└── src/           # 源代码目录
    └── problem/   # 所有题目解答
        ├── _1000/ # Sum Problem - 求和问题
        ├── _1002/ # A + B Problem II - 大数加法
        ├── _1003/ # Max Sum - 最大子段和（Kadane 算法）
        └── _1004/ # Let the Balloon Rise - 统计出现最多的颜色
```

## 包路径规范

所有题目解答使用统一的包路径规范：`problem._{题号}`，避免类名冲突。每个题目的包名以下划线+数字开头，便于排序和识别。

## 开发工具

- **编程助手**: Claude Code
- **语言**: Java

## 许可证

MIT License
