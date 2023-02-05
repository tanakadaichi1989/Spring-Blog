package com.example.Blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class Submit {
	@PostMapping("/submit")
	public String submit(@ModelAttribute Article article, Model model) {
		System.out.println("submitted");
		return "result";
	}
}
