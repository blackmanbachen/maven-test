package com.znsd.test.testdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author wen578351314@gmail.com
 * @Date 2020-09-18 11:11
 * @Version 1.0
 **/
@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "hello world docker";
	}
}
