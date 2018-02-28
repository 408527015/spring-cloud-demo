# spring-cloud-demo

基于spring cloud生态圈搭建一个demo，包含网关、注册中心、配置中心、spring boot服务、服务监控等

## **配置**
### 1.JDK 
1.8.0_151
### 2.Maven 
3.5.2
### 3.Spring Cloud 
Edgware.SR2
### 4.Spring Boot
1.5.10.RELEASE
### 5.pringframework
4.3.14.RELEASE

## maven:settings.xml
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
    <localRepository>D:\MavenHome</localRepository>

    <servers>
        <server>
            <id>host-releases</id>
            <username>test</username>
            <password>****</password>
        </server>
        <server>
            <id>host-snapshots</id>
            <username>test</username>
            <password>****</password>
        </server>
    </servers>

    <mirrors>
        <mirror>
            <id>nexus-dreamyao</id>
            <mirrorOf>*</mirrorOf>
            <name>Nexus dreamyao</name>
            <url>http://maven.dreamyao.com/repository/maven-public/</url>
        </mirror>
    </mirrors>

    <profiles>
        <profile>
            <id>dev</id>
            <repositories>
                <repository>
                    <id>MavenPublic</id>
                    <url>http://maven.dreamyao.com/repository/maven-public/</url>
                    <releases>
                        <enabled>true</enabled>
                    </releases>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </repository>
            </repositories>
        </profile>
    </profiles>

    <activeProfiles>
        <activeProfile>dev</activeProfile>
    </activeProfiles>

</settings>


```

最近比较忙，不过有空的话就会更新的