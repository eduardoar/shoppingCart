package com.rosales.carritocompras.entity.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "openapi")
@ConstructorBinding
@AllArgsConstructor
@Data
public class OpenApiProperties {

    private final String projectTitle;
    private final String projectDescription;
    private final String projectVersion;

}
