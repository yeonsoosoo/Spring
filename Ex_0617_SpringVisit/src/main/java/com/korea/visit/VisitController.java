package com.korea.visit;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.VisitDAO;
import util.MyCommon;
import vo.VisitVO;

@Controller
public class VisitController {

	VisitDAO visit_dao;
	
	public void setVisit_dao(VisitDAO visit_dao) {
		this.visit_dao = visit_dao;
	}
	
	//목록 전체 조회
	@RequestMapping(value= {"/", "/list.do"})
	public String list(Model model) {
		List<VisitVO> list = visit_dao.selectList();
		
		model.addAttribute("list", list);
		
		return MyCommon.VIEW_PATH+"visit_list.jsp";
	}
	
	//새글쓰기 폼으로 이동
	@RequestMapping("/insert_form.do")
	public String insert_form() {
		return MyCommon.VIEW_PATH+"visit_insert_form.jsp";
	}
	
	//새글 작성
	@RequestMapping("/insert.do")
	public String insert(VisitVO vo, HttpServletRequest request) {
		//insert.do?name="홍길동"&content~~~~
		String ip = request.getRemoteAddr();
		vo.setIp(ip);
		
		//바인딩
		int res = visit_dao.insert(vo);
		
		//포워딩
		return "redirect:list.do";				
	}
	
	//게시글 삭제
	@RequestMapping("/delete.do")
	@ResponseBody //return값을 view 형태로 인식하지 않고 콜백메서드로 전달하기 위한 어노테이션
	public String delete(int idx, String pwd) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("idx", idx);
		map.put("pwd", pwd);
		
		int res = visit_dao.delete(map);
		
		String result = "no";
		if(res ==1) {
			result="yes";
		}
		
		String finRes = String.format("[{'res':'%s'}]", result);
		
		//return에 finRes를 쓰면 "[{'res':'%s'}]" -> view가 있는줄 암
		return finRes;
	}
}
