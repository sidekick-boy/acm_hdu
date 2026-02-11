# ACM HDOJ Solutions

本项目包含杭州电子科技大学在线评测系统（HDOJ）的题目解答。

## 项目特点

本项目中的所有题目解答均使用 **Claude Code** 进行编程和自动提交到 GitHub。

## 已解决问题

| 题号 | 题目 | 路径 |
|------|------|------|
| - | A+B Problem | [problem/A/Main.java](hdu_acm/problem/A/Main.java) |
| - | Sum Problem | [problem/Sum/Main.java](hdu_acm/problem/Sum/Main.java) |
| 1002 | A + B Problem II | [problem/1002/Main.java](hdu_acm/problem/1002/Main.java) |

## 目录结构

每个题目解答都存储在独立的子目录中，所有 Java 文件的类名均为 `Main`，通过包路径来区分题目：

```
hdu_acm/
└── problem/       # 所有题目解答
    ├── A/          # A+B 问题
    │   └── Main.java
    ├── Sum/        # 求和问题
    │   └── Main.java
    └── 1002/       # 大数加法问题
        └── Main.java
```

## 包路径规范

所有题目解答使用统一的包路径规范：`hdu_acm.problem.{题号或题目名}`，避免类名冲突。

## 开发工具

- **编程助手**: Claude Code
- **语言**: Java

## 许可证

MIT License
