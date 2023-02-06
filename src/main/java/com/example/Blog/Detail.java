package com.example.Blog;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Detail {
	@RequestMapping("/detail")
	public String getDetail() {
		return "Detail.html";
	}
}
