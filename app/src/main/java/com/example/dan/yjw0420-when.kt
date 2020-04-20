package com.example.dan

//when 条件语句

//写法一
//fun getScore(name:String) = if (name == "Tom"){
//    86
//} else if (name == "Jim"){
//    77
//} else if (name == "Jack"){
//    95
//} else if (name == "Lily"){
//    100
//} else {
//    0
//}

fun main(){
    println(getScore("Tom"))
    val num = 10f
    checkNumber(num)
}

fun getScore(name:String) = when (name){
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 86
}

//  写法二
//  类型匹配

fun checkNumber(num:Number){
    when (num){
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}

//  写法三
fun OgetScore(name: String) = when{
    name == "Tom" -> 86
    name == "Jack" -> 59
    name == "Lily" -> 73
    name == "Jim" -> 100
    else -> 0
}

fun JgetScore(name: String) = when{
    name.startsWith("Tom") -> 86
    name == "Jack" -> 59
    name == "Lily" -> 73
    name == "Jim" -> 100
    else -> 0
}