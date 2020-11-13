package vip.aplatform.a.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "vip.aplatform.a.oauth2.mapper")
public class OAuth2ServerApplication {

    public static void main(String[] args) {
//        System.out.println(new BCryptPasswordEncoder().encode("secret"));
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }



}
