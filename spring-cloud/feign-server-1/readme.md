基于feign实现服务间的调用，相比ribbon，一个是通过rest请求一个是通过接口

配置：
 启动@EnableFeignClients
 @FeignClient("<spring.application.name>")接口上申明需要调用的服务
 

hystrix断路器
 在feign中默认实现了hystrix
 
配置：
 不需要单独引入hystrix依赖
 开启 feign.hystrix.enabled=true
 在@FeignClient(value="<spring.application.name>",fallback = <error-service>.class)中添加fallback，其值为class类型，
 而该类是实现了申明的服务接口，并需要注入到IOC容器。
 
 
HystrixDashboard仪表盘
 @EnableHystrixDashboard
 http://localhost:8765/hystrix
 -> http://localhost:8765/hystrix.stream
 -> http://localhost:8765/hello?name=tom
  注意：虽然feign中集成了hystrix，但是要使用仪表盘功能，必须添加两处
   1、<dependency>
         <groupId>org.springframework.cloud</groupId>
         <artifactId>spring-cloud-starter-hystrix</artifactId>
      </dependency>
   2、@EnableHystrix
   


