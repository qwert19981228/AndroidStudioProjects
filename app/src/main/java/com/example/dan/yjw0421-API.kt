package com.example.dan

fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val maxLengthFruit = list.maxBy { it.length }
//    for (fruit in list) {
//        if (fruit.length > maxLengthFruit.length){
//            maxLengthFruit = fruit
//        }
//    }
    // 写法一
    val lambda1 = { fruit:String -> fruit.length }
    val maxLengthFruit1 = list.maxBy(lambda1)

    // 写法二 (一步步简化)
    val maxLengthFruit2 = list.maxBy({ fruit:String -> fruit.length })

    // 写法三
    val maxLengthFruit3 = list.maxBy(){ fruit:String -> fruit.length }

    // 写法四
    val maxLengthFruit4 = list.maxBy { fruit:String -> fruit.length }

    // 写法五
    val maxLengthFruit5 = list.maxBy { fruit -> fruit.length }

    // 写法六
    val maxLengthFruit6 = list.maxBy { it.length }


    println("max length fruit is " + maxLengthFruit)
    println("max length fruit is " + maxLengthFruit1)
    println("max length fruit is " + maxLengthFruit2)
    println("max length fruit is " + maxLengthFruit3)
    println("max length fruit is " + maxLengthFruit4)
    println("max length fruit is " + maxLengthFruit5)
    println("max length fruit is " + maxLengthFruit6)
}