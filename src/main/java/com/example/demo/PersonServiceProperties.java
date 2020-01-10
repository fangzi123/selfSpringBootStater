package com.example.demo;
 
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
 
/**
 * 描述：人员信息自动配置属性类
 */
@Data
@ConfigurationProperties(prefix="person")// 定义application.yml 配置文件中的配置前缀
public class PersonServiceProperties {
	private boolean enable;//控制Configuration是否生效
	private String name;// 姓名
	private int age;// 年龄
	private String sex = "man";// 性别，不配置的时候默认为 man

}
