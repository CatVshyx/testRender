package com.example.demo.controller;

import com.example.demo.dao.ComputerRepository;
import com.example.demo.model.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GreetingController {
    @Autowired
    private ComputerRepository computerRepository;
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/addComp")
    public String add(){
        Random rd = new Random();
        Computer comp = new Computer("Acer "+rd.nextInt(20));
        computerRepository.save(comp);
        return "added";
    }
    @GetMapping("/list")
    public Iterable<Computer> list(){
        return computerRepository.findAll();
    }
}
