package com.korea.auto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.DeptDAO;
import vo.DeptVO;

@Controller
public class TestController {
	
	//변수명이랑 DAO에서 정한 별칭이 반드시 똑같아야 사용가능
	@Autowired
	DeptDAO dept_dao;
	
	public TestController() {
		System.out.println("--TestController의 생성자--");
	}
	
	@RequestMapping(value = {"/", "/list.do"})
	public String dept_list(Model model) {
		List<DeptVO> dept_list = dept_dao.selectList();
		
		model.addAttribute("list", dept_list);
		
		return "/WEB-INF/views/dept_list.jsp";
	}
}
