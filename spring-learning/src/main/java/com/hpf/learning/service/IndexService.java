package com.hpf.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {


	@Autowired
	UserService userService;

	public IndexService(){
		System.out.println("indexService  construct");
	}

	public void sayHello(){
		System.out.println("indexservice  sayhello");
	}
}
