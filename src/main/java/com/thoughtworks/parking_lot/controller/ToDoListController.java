package com.thoughtworks.parking_lot.controller;

import com.thoughtworks.parking_lot.dao.ToDoItemResposity;
import com.thoughtworks.parking_lot.entity.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/todolists")
public class ToDoListController {

    @Autowired
    private ToDoItemResposity toDoItemResposity;
    @GetMapping()
    public ResponseEntity getallItem() {
        return ResponseEntity.status(HttpStatus.OK).body(toDoItemResposity.findAll());
}
}
