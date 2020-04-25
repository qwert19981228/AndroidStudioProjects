package com.example.dan

// run run函数的用法和使用场景其实和 with 函数是非常类似的
//     首先 run函数是不能直接调用的, 而是一定要调用某个对象的 run 函数
//     其次 run 函数只接收一个 Lambda 参数 , 并且会在 lambda 表达式中提供调用对象的上下文
//     其他方面和 with 函数是一样的 , 包括也会使用 lambda 表达式中的最后一行代码作为返回值返回

fun main(){
    val list = listOf("Apple","Banana","Grape","Orange","Pear")
    val result = StringBuilder().run {
        append("Start eating fruits.\n")
        for (fruit in list){
            append(fruit).append("\n")
        }
        append("Ate all fruits")
        toString()
    }
    println(result)
}