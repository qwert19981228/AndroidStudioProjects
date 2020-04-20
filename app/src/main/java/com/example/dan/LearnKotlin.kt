package com.example.dan

var PI = 3.14
var c = 0
fun main(){
    println("Hello Kotlin!")
    var a :Int = 10
    a = a*10
    val b :String = "你好啊!!!"
    println("输出结果:"+a+b)
    println(methodName(1,1))
    println("sum of 19 and 23 = ${sum(19,23)}")
    printSum(-1,8)
    var x = 5
    x += 1
    println("x = $x")

    println("c = $c,PI = $PI")
    incrementX()
    println("incrementX()")
    println("c = $c,PI = $PI")
    println(str())
    println("max of 0 and 42 is ${maxof(0,42)}")
    println("max of 0 and 42 is ${maxon(0,42)}")


    fun printLength(obj: Any){
        println("'$obj' string length is ${getStringLength(obj)?:"... err,not a string"}")
    }
    printLength("Incomprehensibilites")
    printLength(1000)
    printLength(listOf(Any()))
    val items = listOf("apple","banana","kiwifruit")
    for (item in items){
        println(item)
    }

    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }
    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
    }
}
fun methodName(param1: Int,param2: Int): Int{
    return param1+param2
}
fun sum(a:Int,b:Int) = a + b

fun printSum(a:Int,b: Int): Unit{
    println("sum of $a and $b is ${a-b}")
}

fun incrementX(){
    c += 1
}

fun str(): String {
    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is","was")},but now is $a"
    return s2
}

fun maxof(a: Int,b: Int):Int{
    if (a>b){
        return a
    } else {
        return b
    }
}

fun maxon(a: Int,b: Int):Int = if (a>b) a else b

fun getStringLength(obj:Any):Int?{
    if (obj is String){
        return obj.length
    }
    return null
}