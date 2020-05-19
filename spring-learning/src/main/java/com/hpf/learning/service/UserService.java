package com.hpf.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	IndexService indexService;

	public UserService() {
		System.out.println("Userservice construct");

	}

	public void sayHello() {
		System.out.println("userservice sayhello");
	}

}
