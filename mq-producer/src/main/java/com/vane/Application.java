package com.vane;

import com.vane.config.ProducerChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @Author Vane
 * @Date 2018年11月02日
 */
@SpringBootApplication
@EnableBinding({ProducerChannel.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
