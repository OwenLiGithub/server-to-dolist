package com.thoughtworks.parking_lot.dao;

import com.thoughtworks.parking_lot.entity.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoItemResposity extends JpaRepository<ToDoItem,String> {
}
