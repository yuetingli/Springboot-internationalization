package cn.auan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//启动定时
@EnableCaching //开启缓存
@EnableAsync
@EnableAutoConfiguration
public class DemoApplication extends SpringBootServletInitializer {

    //添加Tomcat支持
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(DemoApplication.class);
    }

    public static void main(String[] args) {
        System.out.println("SpringBoot开始加载");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("SpringBoot加载完毕");
    }
}
