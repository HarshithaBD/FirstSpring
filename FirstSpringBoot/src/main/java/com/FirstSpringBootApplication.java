package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.entity.Coder;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FirstSpringBootApplication.class, args);
	
		ApplicationContext ctx=SpringApplication.run(FirstSpringBootApplication.class, args);
	   System.out.println("welcome to Spring Boot");
	   Coder c1=(Coder) ctx.getBean("coder");
	   c1.setCid(102);
	   c1.setCname("mina");
	   c1.setTech("java");
	   System.out.println(c1);
	   System.out.println(c1.hashCode());
	   
	   Coder c2=(Coder) ctx.getBean("coder");
	   c2.setCid(103);
	   c2.setCname("rina");
	   c2.setTech("javaFs");
	   System.out.println(c2);
	   System.out.println(c2.hashCode());
	   
	}

}
