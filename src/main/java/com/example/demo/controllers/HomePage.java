package com.example.demo.controllers;

import com.example.demo.domains.Tacos;
import com.example.demo.domains.TacosOrder;
import com.example.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Jackson.Wen
 */
@RestController
@RequestMapping("/api/v1")
public class HomePage {
    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/")
    public List<TacosOrder> home(){
        return orderRepository.findByDeliveryZip("1") ;
    }
}
