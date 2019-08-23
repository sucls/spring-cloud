config

spring.cloud.config.uri失效
写入到bootstrap.properties

配置：
 spring.cloud.config.label=master
 spring.cloud.config.profile=dev
 #spring.cloud.config.uri=http://localhost:8770
 
 #下面两个配置可以使通过application-nmame来访问配置中心，而非uri
 spring.cloud.config.discovery.enabled=true
 spring.cloud.config.discovery.service-id=config-server
 
 
 
 
 
 如何对配置的更新及时可见？
 spring-cloud-starter-bus-amqp
 spring-boot-starter-actuator
 @RefreshScope（使用有配置的类上）
 
 http://localhost:8771/bus/refresh
 
 或者
 spring-boot-starter-actuator
 
 @RefreshScope（使用有配置的类上）
 http://localhost:8771/refresh
 如果有权限问题加上 management.security.enabled=false