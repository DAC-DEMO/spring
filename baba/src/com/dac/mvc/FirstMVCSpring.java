package com.dac.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.dac.dao.PostDao;
import com.dac.model.PostClass;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/rest")
public class FirstMVCSpring {
	@Autowired
	private PostDao postDao;
	
	@GetMapping
	@RequestMapping("/first")
	public PostClass springOne()
	{
		PostClass ps = new PostClass();
		ps.setPost("True King of the North");
		return ps;
	}
	
	@GetMapping
	@RequestMapping("/second")
	public List<PostClass> readAll(){
		List<PostClass> list=new ArrayList<PostClass>();
		PostClass ps = new PostClass();
		ps.setPost("You know nothing");
		
		list.add(ps);
		list.add(ps);
		list.add(ps);
		return list;
	}
	
	@GetMapping
	@RequestMapping("/post")
	public List<Map<String, Object>> readAllPost(){
		return postDao.readAllPost();
	}
	
	
	@PostMapping
	@RequestMapping(value="/create", consumes = {"application/json"})
	public PostClass createPost(@RequestBody PostClass post){
		postDao.insertPost(post);
		return post;
	}
	
	@PostMapping("upload")
	public String imageUpload(@RequestParam CommonsMultipartFile file, HttpServletRequest request){
		return "Hello world";
	}
}











