package com.korea.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.MyPath;
import util.MyPath2;

@Controller
public class TestController {

	public TestController() {
		// TODO Auto-generated constructor stub
		System.out.println("--TestController()--생성자 호출");
	}

	//경로 사용
	@RequestMapping("/test.do")
	public String test(Model model, HttpServletRequest request) {
		//인터페이스를 활용하면 좀 더 짧게 사용가능
		//return MyPath.TestClass.VIEW_PATH + "test";
		
		String[] msg = {"사과","딸기","배", "수박", "참외"};
		
		String ip = request.getRemoteAddr();
		
		model.addAttribute("list", msg);
		model.addAttribute("ip", ip);
		
		return MyPath2.VIEW_PATH2 + "test.jsp";
	}
}
