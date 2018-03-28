###tut1 hello World 如何启动应用程序
-> 1. 首先打成jar包
-> 2. 然后分别启动生产者和消费者(进入target目录)
-> 3. 启动生产者命令: java -jar rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,sender
-> 4. 启动消费者命令: java -jar rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,receiver
###tut2 work-queue 如何启动应用程序
-> 1. mvn clean package
-> 2. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=work-queues,receiver
-> 3. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=work-queues,sender
###tut3 publish/subscribe 如何启动应用程序
-> 1. mvn clean package
-> 2. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=pub-sub,sender --tutorial.client.duration=60000
-> 3. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=pub-sub,receiver --tutorial.client.duration=60000
###tut4 routing 如何启动应用程序
-> 1. mvn clean package
-> 2. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=routing,receiver --tutorial.client.duration=60000
-> 3. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=routing,sender --tutorial.client.duration=60000
###tut5 topics 如何启动应用程序
-> 1. mvn clean package
-> 2. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=topics,receiver --tutorial.client.duration=60000
-> 3. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=topics,sender --tutorial.client.duration=60000
###tut6 RPC 如何启动应用程序
-> 1. mvn clean package
-> 2. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=rpc,server
-> 3. java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=rpc,client
###为什么要命令启动
应为使用了@Profile 注解，应用程序使用Spring配置文件来控制它的行为

###其他

###本人开发环境 
	java version "1.8.0_144"
