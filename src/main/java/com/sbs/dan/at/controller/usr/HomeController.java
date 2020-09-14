package com.sbs.dan.at.controller.usr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.dan.at.dao.ArticleDao;

@Controller
public class HomeController {
	@Autowired
	private ArticleDao articleDao;
	
	@RequestMapping("/")
	@ResponseBody
	public String showMain() {
		return articleDao.getAllCounnt() + "개";
	}
}
