Zuul
 Authentication 安全认证
 Insights  性能监控
 Stress Testing  压力测试
 Canary Testing 
 Dynamic Routing  动态路由
 Service Migration 服务迁移
 Load Shedding 负载均衡
 Security 访问控制
 Static Response handling 静态资源处理
 Active/Active traffic management
 

配置：
 启动@EnableZuulProxy
 zuul.routes
 
 之前的所有服务
   app1:   http://localhost:8762/hello?name=tom
   app2:   http://localhost:8763/hello?name=tom
   ribbon: http://localhost:8764/hello?name=tom => app1/app2
   feign:  http://localhost:8766/hello?name=tom => app1/app2
   
   zuul:   http://localhost:8767
   zuul配置后
   zuul.routes.app1.path=/app1/**
   zuul.routes.app1.service-id=ribbon
   
   http://localhost:8767/app1/hello?name=tom => ribbon