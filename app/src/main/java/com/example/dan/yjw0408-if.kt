package com.example.dan

// if 条件语句

fun main(){
    println(largerNumber1(1,2))
    println(largerNumber2(1,2))
    println(largerNumber3(1,2))
    println(largerNumber4(1,2))
    println(largerNumber5(1,2))
}

// 写法一
fun largerNumber1(num1:Int,num2:Int):Int{
    var value = 0
    if (num1 > num2){
        value = num1
    } else {
        value = num2
    }
    return value
}

// 写法二
fun largerNumber2(num1: Int,num2: Int):Int{
    val value = if (num1 > num2){
        num1
    } else {
        num2
    }
    return value
}

// 写法三
fun largerNumber3(num1: Int,num2: Int):Int{
    return if (num1 > num2){
        num1
    } else {
        num2
    }
}

// 写法四
fun largerNumber4(num1: Int,num2: Int) = if (num1 > num2){
    num1
} else {
    num2
}

//写法五
fun largerNumber5(num1: Int,num2: Int):Int = if (num1 > num2) num1 else num2