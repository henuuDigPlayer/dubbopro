package co.lindj.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lindj
 * @Description 启动类
 * @date 2018/4/11 0011
 */
@SpringBootApplication
@MapperScan("co.lindj.dubbo.mapper")
@ComponentScan(value = {"com.zjdex", "co.lindj.dubbo"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}