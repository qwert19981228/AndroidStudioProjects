package com.example.dan

import kotlin.text.StringBuilder

//  apply  apply函数和 run 函数也是极其类似的,都要在某个对象上调用,并且只接收一个Lambda 参数
//      也会在lambda表达式中提供调用对象的上下文 , 但是apply 函数无法指定返回值 , 而是会自动返回调用对象本身

fun main(){
    val list = listOf("Apple","Banana","Orange","Pear","Grape")
    val result = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (fruit in list){
            append(fruit).append("\n")
        }
        append("Ate all fruits")
    }
    println(result.toString())
}