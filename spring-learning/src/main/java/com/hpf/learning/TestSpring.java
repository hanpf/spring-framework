package com.hpf.learning;

import com.hpf.learning.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService bean = applicationContext.getBean(IndexService.class);
		bean.sayHello();
	}
}
