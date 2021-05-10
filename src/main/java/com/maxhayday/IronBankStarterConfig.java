package com.maxhayday;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronBankStarterConfig {
    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.destination")
    public IronBankRavenApplicationListener ravenApplicationListener(){
        return new IronBankRavenApplicationListener();
    }

    @Bean
    public FrontendControllerHandler1 frontendControllerHandler(){
        return new FrontendControllerHandler1();
    }
}
