package com.dota.gg.test.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	@RequestMapping(value = "/a")
	public String getTestPage(){
		logger.info("gm.root:"+System.getProperty("gm.root"));
		logger.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return "/test/test";
	}
}
