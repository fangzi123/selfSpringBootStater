package com.example.demo;
 
public class PersonService {
	
	private PersonServiceProperties properties;
	
	public PersonService(PersonServiceProperties properties){
		this.properties = properties;
	}
	
	public PersonService(){
		
	}
	
	public String getPersonName(){
		return properties.getName();
	}
	
	public int getPersonAge(){
		return properties.getAge();
	}
	
	public String getPersonSex(){
		return properties.getSex();
	}
}
