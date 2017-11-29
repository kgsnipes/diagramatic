package com.diagramatic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({ "com.diagramatic.*" })
@EnableJpaRepositories(basePackages={"com.diagramatic"})	
public class DiagramaticConfig {

}
