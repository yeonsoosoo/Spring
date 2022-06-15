package com.korea.param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.MyPath;
import vo.PersonVO;

@Controller
public class ParamController {
	
	public ParamController() {
		
	}
	
	//value라는 속성은 배열 형식으로 여러가지 매핑을 줄 수 있다.
	@RequestMapping(value= {"/","/insert_form.do"})
	public String insert() {
		return MyPath.PATH + "insert_form.jsp";
	}
	
	//name=연수&age=22&tel=0103212313 메서드와 파라미터의 이름이 일치한다면 값이 바로 저장됨
	@RequestMapping("insert1.do")
	public String insert1(Model model, String name, int age, String tel) {
		//인코딩은 다음에 들어오는 파라미터들을 인코딩 하는 것이므로 컨트롤러에서 이런식으로 코드를 작성하면 안됨.
		//request.setCharacterEncoding("utf-8");
		
		//name, age, tel 파라미터가 자동으로 넘어온다.
		PersonVO vo = new PersonVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setTel(tel);
		
		model.addAttribute("vo", vo);
		
		return MyPath.PATH + "insert_result.jsp";
	}
	
	//vo타입으로도 받을 수 있음
	//vo안에 name이라는 이름이 있으므로 만약 String name을 하나더 파라미터로 받게되면 오류가남(주의)
	@RequestMapping("insert2.do")
	public String insert2(Model model, PersonVO vo) {
		//파라미터로 넘어온 name,age,tel을 vo 객체에 자동으로 세팅해줌
		model.addAttribute("vo", vo);
		
		return MyPath.PATH + "insert_result.jsp";
	}
	
}
