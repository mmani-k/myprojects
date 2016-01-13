package com.mmani.blog.service;

import java.util.List;


import com.mmani.blog.domain.Post;





public interface BlogService {
	
	public List<Post> findAll();
	
	public Post findByTitle(String title);

	public Post findByAuthor(String author);

}
