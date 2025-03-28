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

![2](https://github.com/user-attachments/assets/eae50b82-0cde-4347-81cd-70acad14c2a2)





## Login

![3](https://github.com/user-attachments/assets/27a354e0-261b-4a3e-a86d-7ff2b215e9d7)



![4](https://github.com/user-attachments/assets/41618a1a-7ba3-462d-9d0e-4c24c9d41c96)




## UI
![5](https://github.com/user-attachments/assets/6a0d2ced-043e-4a09-9b40-8c18b58c4cd1)




## 订单
![6](https://github.com/user-attachments/assets/b4f96c58-d220-4eba-ac63-72af327c3984)



### 添加
![7](https://github.com/user-attachments/assets/b6b1efcc-8a81-4285-85d5-9d2eb7a5dc67)




### 修改
![8](https://github.com/user-attachments/assets/0094bd53-3bc6-435f-9647-775423689786)




### 查看
![9](https://github.com/user-attachments/assets/2b0bb05f-cad6-4808-95a5-8de01e6b1e89)


订单大类和商品之间是一对多的关系

商品也可以实现增删改查



## 商品



### 增加
![10](https://github.com/user-attachments/assets/a37529de-ed91-496f-a400-76f82acf7ff9)




### 查看
![11](https://github.com/user-attachments/assets/10ac82c5-b030-452e-9cad-ba51e6e45236)




## 员工信息管理

### UI

![12](https://github.com/user-attachments/assets/66ffeb98-dce2-4ecc-814f-f126ef0a521f)




### 增加

![15](https://github.com/user-attachments/assets/6063abe4-e6b6-4143-b405-c3bbf71ca910)





修改
![13](https://github.com/user-attachments/assets/937199d5-43c2-4b82-a818-ceaaf7a62fc2)




### 查询
![14](https://github.com/user-attachments/assets/3411a10b-8dac-4a1a-9aa5-e05510b6d84c)




侧边栏上面的“退出”和“注销”按钮分别可以实现[退出账号]和[注销自己的账号]
