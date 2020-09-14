package com.sbs.dan.at.controller.usr;

import javax.servlet.http.HttpSession;

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
		return articleDao.getAllCounnt() + "개가 있음~!!";
	}

	@RequestMapping("/doSetSession")
	@ResponseBody
	public String doSetSession(HttpSession session) {
		session.setAttribute("a",10);
		return "세션 설정 완료";
	}
	
	@RequestMapping("/getSession")
	@ResponseBody
	public int getSession(HttpSession session) {
		return (int)session.getAttribute("a");
	}
}

