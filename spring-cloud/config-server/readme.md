config

@EnableConfigServer

/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

测试 
http://localhost:8770/<prop>/<profile>