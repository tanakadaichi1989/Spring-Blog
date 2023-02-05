package com.example.Blog;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import lombok.*;

@Entity
@Data
@Table(name="article")
public class Article {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private UUID id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="body")
	private String body;
	
	public UUID getId() {
		return id;
	}
	
	public void setId() {
		this.id = UUID.randomUUID();
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
