package com.example.dan

// fou循环
// 用法一
// 两个点表示区间 ..
fun main(){
    for (i in 1..10){
        println(i)
    }

// 用法二
    // until表示一个左闭右开的区间
    for (i in 0 until 10 step 2){
        println(i)
    }
// 用法三
    for (i in 10 downTo 1){
        println(i)
    }
}


