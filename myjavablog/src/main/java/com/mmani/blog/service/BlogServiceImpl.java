package com.mmani.blog.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mmani.blog.domain.Post;

@Service("blogService")
@Repository
public class BlogServiceImpl implements BlogService{
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional(readOnly=true)
	public List<Post> findAll(){
		TypedQuery<Post> qry = em.createNamedQuery("post.findAll", Post.class);
		//List<Post> posts = em.createNamedQuery("post.findAll", Post.class).getResultList();
		return null;
	}
	
	public Post findByTitle(String title){
		return null;
	}
	public Post findByAuthor(String author){
		return null;
	}
}
