package it.ccf.democlone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemocloneController {
	
	@GetMapping("/welcome")
	public String getWelcome(Model m) {
		// prova per git clone
		m.addAttribute("welcome", "Simple SpringBoot test");
		return "welcome";
		
	}

}
