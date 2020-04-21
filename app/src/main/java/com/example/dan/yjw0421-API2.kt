package com.example.dan

// 集合中几个常用的API函数式

fun main(){
    val list = listOf("Apple","Banana","orange","Pear","Grape","Watermelon")
    // map
    val newlist = list.map { it.toUpperCase() }
    val newlist1 = list.map { it.toLowerCase() }
    // filter
    val newlist2 = list.filter { it.length <= 5 }
                       .map { it.toUpperCase() }
    for (fruit in newlist2){
        println(fruit)
    }

    // any / all
    val anyResult = list.any { it.length <= 5 }
    val allResult = list.all { it.length <= 5 }
    println("anyResult is " + anyResult + " , allResult is " + allResult)
}

