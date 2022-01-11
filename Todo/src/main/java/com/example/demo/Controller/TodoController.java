package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.todo;
import com.example.demo.Repository.TodoRepository;


@RestController
public class TodoController {
	
	@Autowired
	TodoRepository todoRepository;
	

	
	@GetMapping("/todos")
	public Iterable<todo> todos()
	{
		return todoRepository.findAll();
	}
	
	@PostMapping("/todos")
	public todo hello(@RequestBody todo T) {
		 return todoRepository.save(T);
	}
	
}

