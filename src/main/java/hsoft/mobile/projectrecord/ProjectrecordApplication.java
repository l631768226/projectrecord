package hsoft.mobile.projectrecord;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan({"hsoft.mobile.projectrecord.dao", "hsoft.mobile.projectrecord.mapper"})
public class ProjectrecordApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectrecordApplication.class, args);
    }
}
