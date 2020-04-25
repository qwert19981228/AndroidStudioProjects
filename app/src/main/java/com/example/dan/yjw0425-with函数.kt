package com.example.dan

import kotlin.text.StringBuilder

// with 在连续调用同一个对象的多个方法时让代码变得更加简洁

fun main(){
    val list = listOf("Apple","Banana","Orange","Pear","Grape")
//    val builder = StringBuilder()
//    builder.append("Start eating fruits.\n")
//    for (fruits in list){
//        builder.append(fruits).append("\n")
//    }
//    builder.append("Ate all fruits")
//    val result = builder.toString()
//    println(result)
    val result = with(StringBuilder()){
        append("start eating fruits.\n")
        for (fruits in list){
            append(fruits).append("\n")
        }
        append("Ate all fruits")
        toString()
    }
    println(result)
}