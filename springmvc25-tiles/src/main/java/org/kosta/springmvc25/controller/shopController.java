package org.kosta.springmvc25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class shopController {
	/**
	 * 	@pathVariable:
	 * 					요청 url 정보를 변수로 할당받을 수 있다.
	 * 요청 url과 일치하는 url 매핑이 있으면
	 * (즉 별도의 메서드가 있으면)
	 * 그 메서드가 실행되고 
	 * 없으면 PathVariable 적용 메서드가 실행된다
	 */
	@RequestMapping("{viewId}.do")
	public String showTilesView(@PathVariable String viewId){
		System.out.println("viewId:"+viewId);
		return viewId;
	}
	/*@RequestMapping("home.do")
	public String home(){
		
		 * home은 view name
		 * tiles definition name으로 home이 있으면 tiles 적용 응답화면 제공
		 * 만약없으면 viewResolver  우선순위에 의해 일반 jsp로 응답
		 
		return "home";
	}*/
	/*@RequestMapping("shop_register.do")
	public String register(){
		return "shop_register";
	}
	@RequestMapping("shop_update.do")
	public String update(){
		return "shop_update";
	}
	@RequestMapping("shop_delete.do")
	public String delete(){
		return "shop_delete";
	}
	@RequestMapping("admin_shopmgr_login.do")
	public String shopAdminLogin(){
		return "admin_shopmgr_login";
		}*/
}
