package com.example.easylogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ecsite")
public class IndexController {
	
	@Autowired
	private GoodsRepository goodsRepos;
	

}
