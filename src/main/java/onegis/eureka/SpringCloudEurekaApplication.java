package onegis.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: tunan
 * @version: v.1.0.1
 * @company: 苏州中科蓝迪公司
 * @date: created on 16:15 2019-02-13
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudEurekaApplication.class)
                .web(true).run(args);
    }
//    public static void main(String[] args) {
//        SpringApplication.run(SpringCloudEurekaApplication.class, args);
//    }

}
