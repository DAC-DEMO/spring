package com.dac.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dac.model.PostClass;

@RestController
@RequestMapping("/rest")
public class FirstMVCSpring {
	
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
	public List<PostClass> readAllPost(){
		List<PostClass> list=new ArrayList<PostClass>();
		PostClass ps = new PostClass();
		ps.setPost("You know nothing");
		
		list.add(ps);
		list.add(ps);
		list.add(ps);
		return list;
	}
	
}











