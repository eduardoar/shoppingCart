package com.rosales.carritocompras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CarritoComprasApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarritoComprasApplication.class, args);
    }

}
