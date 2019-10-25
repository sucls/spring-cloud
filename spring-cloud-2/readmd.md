1、创建项目，添加依赖包
2、修改配置，创建启动类
3、启动

http://localhost:8760访问


# 1
    eureka作为注册中心，默认会有保护机制，即服务实例下线在注册中心仍会存在，只不过处于不可用状态，主要为了处理在出现网络故障时导致服务的不可用，相对zk
    来说，实现了微服务的AP，但是放弃了系统的一致性（CP）
# 2
    ribbon属于客户端负载均衡
# 3
    feign默认支持负载均衡与hystrix熔断器，但需要feign.hystrix.enabled=true开启
# 4
    eureka server默认有服务自我保护机制，可以通过
    在15分钟内如果有85%的客户端没有心跳检测，则注册中心不再移除过期服务；新的服务可以注册并查询，但是不会同步到其他节点；服务恢复后服务列表重新同步
# 5
    主动剔除下线服务/eureka/apps/{application.name}/
     PUT/DELETE   http://localhost:8760/eureka/apps/FEIGN-HELLO/localhost:feign-hello:8781/status?value=OUT_OF_SERVICE
    代码实现：DiscoveryManager.getInstance().shutdownComponent()
# 6
    zuul配置服务路由时，默认情况下会有 zuul.routers.xxx.paths=/xxx/***  zuul.routers.xxx.serviceId=***
    最好是禁用默认的配置，完全通过自定义的zuul路由完成服务导向
#7 
    config server访问配置文件内容(application对应的是name)
    /{application}/{profile}[/{label}] ->
    /{application}-{profile}.yml
    /{label}/{application}-{profile}.yml
    /{application}-{profile}.properties
    /{label}/{application}-{profile}.properties
