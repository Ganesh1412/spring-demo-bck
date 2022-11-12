package com.jenkins.gaia.sample.repository;

import com.jenkins.gaia.sample.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoItem, Long> {
}