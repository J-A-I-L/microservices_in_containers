package eu.jail.training.configsesrver;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.swing.*;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(ConfigServerApplication.class);
//        application.setBannerMode(Banner.Mode.LOG);
//        application.run(args);
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
