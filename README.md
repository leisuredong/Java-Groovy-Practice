# Java-Groovy-Practice

这是一个展示Java和Groovy集成使用的示例项目。

## 项目结构

```
src/main/java/org/example/
├── GroovyFunction.java    # Groovy函数定义
├── GroovyFunctionMain.java # 主程序入口
├── Main.java             # 示例程序
└── samples.groovy        # Groovy示例脚本
```

## 功能特性

1. Java调用Groovy脚本
2. Groovy动态方法调用
3. Groovy闭包使用
4. Java和Groovy类型互操作

## 使用示例

1. 运行Groovy函数：
```java
Script script = shell.parse("foo('abc',',','xyz')");
Object result = script.run();
```

2. 动态方法调用：
```groovy
def obj = new Expando()
obj.sayHello = { println 'Hello!' }
obj.sayHello()
```

## 环境要求

- JDK 8+
- Maven 3.6+
- Groovy 3.0+

## 构建运行

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="org.example.GroovyFunctionMain"
```

## 作者

- leisuredong

## 许可证

MIT License 