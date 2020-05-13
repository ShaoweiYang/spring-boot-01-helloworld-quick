package com.atguigu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法返回的数据直接写给浏览器，如果是对象还能转成json数据
//@ResponseBody
//@Controller("helloController")
@RestController("helloController")
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "<h1 style='color:red;'>Hello World 123!!!</h1>";
	}
	
	@RequestMapping("/hello/{id}")
	@ResponseBody
	public String hello2(@PathVariable(name = "id",required = true)Integer id) {
		System.out.println(id);
		return "<h1 style='color:grey;'>Hello World 123!!!</h1>";
	}
	
	
	
}
