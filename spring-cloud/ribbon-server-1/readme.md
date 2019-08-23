Ribbon+RestTemplate实现服务间的调用
 由RestTemplate调研http请求的调用
 通过@LoadBalanced申明负载均衡(条件是有多个相关的服务并注册到eureka server)

配置：
 注入RestTemplate
 为 RestTemplate 添加@LoadBalanced 使该服务能够负载均衡
 调用方式 restTemplate.getForObject("http://app/hello?name="+name,String.class);
 
 
Hystrix断路器
 实现服务故障时的处理，防止服务故障导致应用连锁问题
 
配置：
 启动@EnableHystrix
 在接口方法上添加@HystrixCommand(fallbackMethod = "<method-name>") 根据方法名称定义方法，参数相同
 

HystrixDashboard仪表盘
 @EnableHystrixDashboard
 http://localhost:8764/hystrix
 -> http://localhost:8764/hystrix.stream
 -> http://localhost:8764/hello?name=tom
 
 