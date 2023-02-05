package com.example.Blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
	@GetMapping("/articles")
	public String displayList(Model model) {
		List<Article> articles= articleService.findAll();
		model.addAttribute("articles",articles);
		return "articles";
	}
}
