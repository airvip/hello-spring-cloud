
# 初始化分布式配置中心
* 开发 dev
* 生产 prod
* 测试 test

```
java -jar hello-spring-cloud-web-admin-feign-1.0.0-SNAPSHOT.jar # 默认开发
java -jar hello-spring-cloud-web-admin-feign-1.0.0-SNAPSHOT.jar --spring.profiles.active=prod
```

## 命令行指令

启动顺序
1. EurekaApplication   服务注册与发现
2. ConfigApplication   服务的分布式配置中心
3. ZipKinApplication   
4. AdminApplication    
5. ServiceAdminApplication  服务提供者
6. WebAdminFeignApplication | WebAdminRibbonApplication   服务消费者
7. ZuulApplication    Api网关

### Git 全局设置
```
git config --global user.name "airvip"
git config --global user.email "sdqhwzb@163.com"
```

### 创建新版本库
```
git clone ssh://git@192.168.1.27:2222/airvip/spring-cloud-config.git
cd spring-cloud-config
touch README.md
git add README.md
git commit -m "add README"
git push -u origin master
```

### 已存在的文件夹
```
cd existing_folder
git init
git remote add origin ssh://git@192.168.1.27:2222/airvip/spring-cloud-config.git
git add .
git commit -m "Initial commit"
git push -u origin master
```

### 已存在的 Git 版本库
```
cd existing_repo
git remote rename origin old-origin
git remote add origin ssh://git@192.168.1.27:2222/airvip/spring-cloud-config.git
git push -u origin --all
git push -u origin --tags
```