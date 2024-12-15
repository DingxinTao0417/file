分层：
 - Controller：前端部分
 - Service：后端代码运行逻辑部分
 - Dao：数据库连接（数据访问层）
Entity 封装对象
Ali web分层
	web -> service -> manager -> dao

Controller
	controller(web\app\应用层\web应用层)
module(模型，service + dao)

网络基础自学目录：
	百度百科
	HTTP\TCP\UDP\网络分层协议\URL\Cookie
	TCP三次握手和四次挥手
		- **三次握手 (建立连接):**
    
    1. **客户端发送SYN**：请求建立连接，发送一个带SYN标志的数据包。
    2. **服务器回复SYN-ACK**：确认客户端请求，同时表示自己可以通信。
    3. **客户端回复ACK**：确认服务器回复，连接建立成功。
		- **四次挥手 (关闭连接):**
		    
		    1. **客户端发送FIN**：请求关闭连接。
		    2. **服务器回复ACK**：确认客户端请求。
		    3. **服务器发送FIN**：通知客户端准备关闭。
		    4. **客户端回复ACK**：确认服务器通知，连接关闭完成。
	TCP\UDP对应传输层
	HTTP对应应用层
	TCP、UDP、HTTP的区别

应用：
	TCP: http://      ftp:// 文件传输     smtp:// 邮件传输
	UDP: udp:// 音视频网络传输
	URL: 网址（http:// https:// udp:// ）

cookie:
	1. 存储在浏览器上
	2. 随HTTP请求头一起发送到后端
	3. 手机app或小程序不涉及cookie

路由和Spring MVC
    springMVC代码
    ```
	   @RequestMapping("/test/index")
	   public Response testIndex() {
		   return new Response(1001);
	   }
	```
	通过Requestmapping将URL对应到Controller的testIndex function上
	function返回（Response）网络应答
	springMVC核心工作就是路由解析： 把URL解析成Controller里面的方法

MVC
M: service + dao
V: view frontend
C: controller

URL ->request -> JAVA
     <- response <-

spring
- IOC: 
	  Spring帮助实例化包名和类名的字符串，方便后期调用对象（getInstance）
	  控制反转
	  @Service， @Controller
- DI: 
	 @Autowired
	 注入依赖
- AOP: 
	 面向切面编程
- 反射: java本身反射代码过于复杂，Web框架通过IOC把类传给Spring再获取对象。
	  本质，Spring把反射包了一层，统一处理
- 八爪鱼：
	 IOC把类交给spring（八爪鱼）管理，通过收集@service和@controller
	 当在运行过程中遇到@Autowired，将对应的类作为对象传过来


spring AOP: 面向切面编程，请求和相应与web应用之间的拦截器
Spring mvn 做拦截器：transaction，事务处理

spring商业宣传：
	IOC控制反转
	DI依赖注入
	AOP面向切面编程
	各种优势：解耦

SpringBoot 启动器
	快速引入spring相关框架及第三方库

核心注解考点：
	@SpringBootApplication = @SpringBootConfiguration+@EnableAutoConfiguration+@ComponentScan

mybatis: 三个核心—>一个核心（mapper）
1.mapper (接口，注解@mapper，必须有)
2.entity（一个和数据库的表一一对应的表（一般），一个和mapper返回数据一一对应的类（正解））
3.xml文件（mapper接口的补充，可以没有）

jdbc:java和数据库的连接器
jdbc是个jar包
所有的ORM（object relation mapping）框架，底层都是jdbc（包括mybatis）

mybatis和jdbc 在application.properties
jdbc不止一个

sql注入（通过sql注入外部攻击）
select * from 'student' where student_name = 'xxx'; drop database; '
学生名字xxx';drop database

避免注入
mybatis通过#{} 预处理的方式

maven和maven wrapper
廖雪峰学java
maven：
1. 目的 管理引入的jar包，并把项目打包
2. 为达成目的引入标准：maven项目结构
3. pom.xml
maven本地仓库->
intelliJ preferences->
Build, Execution, deployment->
maven->
maven home path: idea或者本地maven版本

maven wrapper
.mvn文件夹
确保maven版本,如果没有