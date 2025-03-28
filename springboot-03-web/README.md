# 员工商品管理平台小项目

这是一个可以实现员工和销售商品的管理平台项目，包含前端管理端、后端Java代码。是一个springboot入门的小项目



## 项目组成

本项目由以下几个主要部分组成：

1. 前端管理端
2. 后台Java代码
3. MySQL数据库  mysql5版本导入最好  mysql8版本导入可能需要更改数据库



## 快速开始



### 1. 数据库设置

SQL文件：`springbootweb.sql`

使用步骤：

1. 在您的MySQL数据库管理工具中创建一个新的数据库（比如名为 `springbootweb.sql`）
2. 导入 `springboot.sql` 文件来创建所需的表格和初始数据

```sql
create database springbootweb;
use springbootweb;
SOURCE /path/to/springbootweb.sql;
# 或者通过自己的Mysql管理工具进行导入	下面演示使用sqlYog导入
```

![1](https://github.com/user-attachments/assets/e531aee9-8dfd-474b-bb11-900d22b731c5)


![image-20250224105841807](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250224105841807.png)

3. 配置MySQL用户名和密码
   在`application.yml`文件中，找到数据库配置部分，并设置正确的用户名和密码：

```yml
spring:
  thymeleaf:
    cache: false
  # 配置国际化
  messages:
    basename: i18n.login
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
    username: root		# 替换为您的MySQL用户名
    password: 123456	# 替换为您的MySQL密码
    url: jdbc:mysql://localhost:3300/springbootweb?useUnicode=true&characterEncoding=UTF-8&useSSL=true&serverTimezone=UTC		#端口号我这里是设置成了3300  一般为3306 根据自己的情况进行修改

```

请确保使用具有适当权限的MySQL用户，能够访问和修改`springboot`数据库。



### 2. 后台Java代码

后台Java代码是本项目的核心部分，负责处理业务逻辑、数据持久化和API接口等功能。我使用的是JDK11版本  Maven版本使用3.6.1  刷新maven仓库可以运行项目就行



## 系统要求

- MySQL 5.7数据库
- Java JDK11
- Maven3.6+



# 运行结果截图



## Register

![image-20250328082550704](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082550704.png)





## Login

![image-20250328082507792](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082507792.png)



![image-20250328082520294](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082520294.png)



## UI

![image-20250328082709479](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082709479.png)



## 订单

![image-20250328082728096](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082728096.png)



### 添加

![image-20250328082816805](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082816805.png)



### 修改

![image-20250328082835311](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082835311.png)



### 查看

![image-20250328082852276](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082852276.png)

订单大类和商品之间是一对多的关系

商品也可以实现增删改查



## 商品



### 增加

![image-20250328083022052](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328083022052.png)



### 查看

![image-20250328082952213](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328082952213.png)



## 员工信息管理

### UI

![image-20250328083110829](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328083110829.png)



### 增加

![image-20250328083139493](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328083139493.png)



修改

![image-20250328083153602](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328083153602.png)



### 查询

![image-20250328083227257](C:\Users\qian\AppData\Roaming\Typora\typora-user-images\image-20250328083227257.png)



侧边栏上面的“退出”和“注销”按钮分别可以实现[退出账号]和[注销自己的账号]
