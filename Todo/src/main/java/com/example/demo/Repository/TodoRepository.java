package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.todo;

public interface TodoRepository extends JpaRepository<todo,Integer>{

}
