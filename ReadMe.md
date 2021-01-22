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


## jasypt使用方法

[`jasypt`](http://www.jasypt.org/) 是用于Java加密的工具包。通常用于解决配置文件中明文配置密码所带来的安全风险。
使用`jasypt`后，在配置文件中配置数据库密码使用加密后的密文，工具包按照指定的算法解密后与数据库建立连接。可以参考`application.properties`中`jasypt`相关配置。

使用如下命令可以生成加密后的密码
```
java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI password=random-string-for-usercenter-demo  algorithm=PBEWithMD5AndDES ivGeneratorClassName=org.jasypt.iv.RandomIvGenerator input=123456
```