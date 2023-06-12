package com.example.demo.Configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ConfigurationProperties(prefix = "config")
@Component
public class SpringConfig {
    private String url;
}
