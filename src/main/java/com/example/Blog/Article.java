package com.example.Blog;
import java.util.UUID;

public class Article {
	private UUID id;
	private String title;
	private String body;
	
	Article(String title, String body){
		this.id = UUID.randomUUID();
		this.title = title;
		this.body = body;
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
}
