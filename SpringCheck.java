package com.sushovan.springpractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringCheck
{

	public static void main(String[] args)
	{
		//BeanFactory factory=new XmlBeanFactory (new FileSystemResource("SpringConfig.xml")); //We Can use BeanFactory as because it's a blueprint of 
																								//beans from a Configuration File.
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml"); //Similarly use as the BeanFactory Using.(advance level COntainer several Enterprise)
																							//1.FileSystemXMLApplicationContext.
																							//2.ClassPathXmlApplicationContext.
																							//3.XmlWebApplicationContext.
		Triangle tr=(Triangle)context.getBean("triangle");
		tr.draw();
		

	}

}
