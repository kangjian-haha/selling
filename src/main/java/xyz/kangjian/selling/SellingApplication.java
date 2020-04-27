package xyz.kangjian.selling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "xyz.kangjian.selling.dataobject.mapper")
@EnableCaching
public class SellingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellingApplication.class, args);
    }

}
