package com.ordermanagement

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class OrderController{

    private val orderRepository = OrderRepository();

    @RequestMapping("/orders",method = arrayOf(RequestMethod.GET))
    fun getOrders(): MutableSet<MutableMap.MutableEntry<String, Order>> {
        return orderRepository.retrieveAllOrders();

    }
}