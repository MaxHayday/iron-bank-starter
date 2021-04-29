package com.maxhayday;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "raven")
@Data
public class RavenProperties {
    private String destination;
    private String name;
}
