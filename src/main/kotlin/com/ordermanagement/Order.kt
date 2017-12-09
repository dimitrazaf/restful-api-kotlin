package com.ordermanagement

data class Order(val id: Long?, val description: String?,
            val cost: Long?, var isCompleted: Boolean ){

    fun isComplete() { this.isCompleted = true }
    fun isIncomplete(){ this.isCompleted = false}



}