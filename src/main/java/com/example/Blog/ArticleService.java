package com.example.Blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	@Autowired
	ArticleRepository articleRepository;
	
	public List<Article> findAll(){
		return articleRepository.findAll();
	}
}
