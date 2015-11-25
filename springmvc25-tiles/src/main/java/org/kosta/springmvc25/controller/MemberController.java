package org.kosta.springmvc25.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	/*@RequestMapping ("member_find.do")
	public String find(){
		return "member_find";
	}
	@RequestMapping ("member_update.do")
	public String update(){
		return "member_update";
	}*/
	@RequestMapping("findMemberById.do")
	public ModelAndView findMemberById(String memberId){
		return new ModelAndView("member_find_result","result",memberId+"아이유");
	}
}
