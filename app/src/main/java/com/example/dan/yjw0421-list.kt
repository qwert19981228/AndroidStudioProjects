package com.example.dan


fun main(){
    val list = listOf("Apple","Banana","Orange","Pear","Grape")

    val list1 = mutableListOf("Apple","Banana","Orange","Pear","Grape")

    for (fruit in list){
        println(fruit)
    }

    list1.add("Watermelon")

    for (fruit in list1){
        println(fruit)
    }
}
