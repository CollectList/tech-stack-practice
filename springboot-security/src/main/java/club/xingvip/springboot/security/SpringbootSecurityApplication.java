package club.xingvip.springboot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/6/19 12:55
 */
@SpringBootApplication
@ComponentScan("club.xingvip.springboot.security")
public class SpringbootSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringbootSecurityApplication.class, args );
    }

}
