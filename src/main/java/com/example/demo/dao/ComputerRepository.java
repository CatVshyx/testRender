package com.example.demo.dao;

import com.example.demo.model.Computer;
import org.springframework.data.repository.CrudRepository;

public interface ComputerRepository extends CrudRepository<Computer,Long> {

}
