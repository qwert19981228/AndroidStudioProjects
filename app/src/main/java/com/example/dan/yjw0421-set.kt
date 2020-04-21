package com.example.dan

fun main(){
    val set = setOf("Apple","Banana","Orange","Pear","Grape")
    val set1 = mutableSetOf("Apple","Banana","Orange","Pear","Grape")
    for (fruit in set){
        println(fruit)
    }
    for (fruit in set1){
        println(fruit)
    }
}