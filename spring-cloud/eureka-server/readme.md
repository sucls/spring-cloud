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


在服务中心，每个服务都可以通过使用相同的spring.application.name来将多个相同的服务组成集群，从而实现负载均衡，最主要是的提高服务的可靠性，但是
服务中心如何实现同样的事情

1、 eureka.instance.hostname => 修改为主机名 sucl1、sucl2
  linux : /etc/hosts
  win   : c:/windows/system32/drivers/etc/hosts
    127.0.0.1 sucl1
    127.0.0.1 sucl2
2、 eureka.client.service-url.defaultZone=http://sucl1/sucl2:${server.port}/eureka/

eureka.instance.preferIpAddress=true 通过服务会将IP注册eureka server并非主机名

Docker
  src/main/docker/Dockerfile
  mvn package docker:build
  
  docker-compose容器编排
  
开启docker 2375端口进行ftp通信，直接在setting中设置，如果是linux或虚拟机中，则需要额外配置