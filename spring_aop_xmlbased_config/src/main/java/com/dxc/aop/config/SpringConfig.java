package com.dxc.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"com.dxc.aop"})
@EnableAspectJAutoProxy
public class SpringConfig {

}
