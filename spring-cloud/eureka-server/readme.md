主要配置：

#主机名
eureka.instance.hostname=localhost
#使用IP注册
#eureka.instance.prefer-ip-address=true
#是否注册或被发现 eureka server
eureka.client.register-with-eureka=false
#是否从eureka server获取注册服务列表
eureka.client.fetch-registry=false
#注册中心地址
eureka.client.service-url.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka/