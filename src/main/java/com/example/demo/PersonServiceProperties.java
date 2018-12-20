package com.example.demo;
 
import org.springframework.boot.context.properties.ConfigurationProperties;
 
/**
 * 描述：人员信息自动配置属性类
 * @author chhliu
 * 创建时间：2017年2月13日 下午9:05:34
 * @version 1.2.0
 */
@ConfigurationProperties(prefix="person.proterties.set")// 定义application.properties配置文件中的配置前缀
public class PersonServiceProperties {
	
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 性别，不配置的时候默认为person.proterties.set=man
	private String sex = "man";
	// 身高
	private String height;
	// 体重
	private String weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
}
