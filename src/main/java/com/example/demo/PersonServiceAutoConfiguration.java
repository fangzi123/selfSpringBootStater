package com.example.demo;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration // 配置注解
@EnableConfigurationProperties(PersonServiceProperties.class) // 开启指定类的配置
@ConditionalOnClass(PersonService.class)// 当PersonService这个类在类路径中时，且当前容器中没有这个Bean的情况下，开始自动配置
public class PersonServiceAutoConfiguration {
	@Autowired
	private PersonServiceProperties properties;
	
	@Bean
  	@ConditionalOnMissingBean(PersonService.class)// 当容器中没有指定Bean的情况下，自动配置PersonService类
	public PersonService personService(){
		PersonService personService = new PersonService(properties);
		return personService;
	}
}
