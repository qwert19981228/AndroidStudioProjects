package com.example.dan

fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    var maxLengthFruit = list.maxBy { it.length }
//    for (fruit in list) {
//        if (fruit.length > maxLengthFruit.length){
//            maxLengthFruit = fruit
//        }
//    }
    println("max length fruit is " + maxLengthFruit)
}