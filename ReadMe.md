# usercenter

## 说明

此工程是Spring Boot工程的简单示例。工程通过MyBatis访问MySQL查询数据。

运行工程时使用时注意修改文件`application.properties`中数据库配置信息。

## 工程结构

```
├── ReadMe.md       # 说明文件
├── pom.xml
├── gen/            # MyBatis生成文件
├── scripts/
│   └── schema.sql  # 数据库初始化脚本
└── src/            # 代码
```

**注意**：  

`gen`目录中包含了通过MySQL数据库逆向生成`dao`和`mapper`的工具，修改`generatorConfig.xml`文件中的配置，运行`gen.bat`即可。
