package com.example.Blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class New {
	@RequestMapping("/new")
	public String getNew() {
		return "New.html";
	}
}
