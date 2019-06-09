package id.web.dragonbee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import id.web.dragonbee.model.User;
import id.web.dragonbee.service.UserService;

@Controller
public class HelloController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public String hello(Model model) {
		Object obj = userService.findAll();
		User user = new User();
		System.out.println("TO STRING: " + obj.toString());
		model.addAttribute("obj", obj);
		model.addAttribute("user", user);
		return "HelloWorld";
	}
	
	@RequestMapping(value = "/hello", method=RequestMethod.POST)
	public String helloPost(User user) {
		userService.insertUser(user);
		return "redirect:/hello";
	}
}
