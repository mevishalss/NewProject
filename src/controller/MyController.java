package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import dto.UserDetails;

@Controller
public class MyController {

	@RequestMapping(value="/Login.jsp")
	public String login(ModelMap map){
		map.put("User",new UserDetails());
		return "Login";
	}
	
	@RequestMapping(value="/Validate.jsp")
	public String Validate(UserDetails user,ModelMap map){
		map.put("User","welcome "+user.getUserid());
		return "Home";
	}
	
}
