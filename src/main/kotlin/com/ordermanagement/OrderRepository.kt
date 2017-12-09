package com.ordermanagement

import org.springframework.stereotype.Repository

@Repository
class OrderRepository() {

    var orders: MutableMap<String, Order> = mutableMapOf<String, Order>()
    // currently keep orders in memory
    init {
        val order1 = Order(1L,"book",10L,true)
        val order2 = Order(2L,"mobile",7000L,false)

        orders.put("1", order1)
        orders.put("2",order2)
    }

    fun retrieveAllOrders(): MutableSet<MutableMap.MutableEntry<String, Order>> {
        return orders.entries;
    }

    fun retrieveOrder(orderId: String): Order?
    {
        if (!orders.containsKey(orderId)){
            return null
        }
        return orders!!.get(orderId)
    }
}