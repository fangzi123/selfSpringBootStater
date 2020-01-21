package com.example.demo.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration // 配置注解
@EnableConfigurationProperties(PersonServiceProperties.class) // 开启指定类的配置
@ConditionalOnProperty(prefix = "person", name = "enable", havingValue = "true")//通过application.yml的person.enable=true|false 来控制Configuration是否生效
public class PersonServiceAutoConfiguration {

	@Autowired
	private PersonServiceProperties properties;
	
	@Bean
  	@ConditionalOnMissingBean(PersonService.class)// 当容器中没有指定Bean的情况下，自动配置PersonService类
	public PersonService personService(){
		PersonService personService = PersonService.builder()
				.name(properties.getName())
				.age(properties.getAge())
				.sex(properties.getSex())
				.build();
		return personService;
	}
}
