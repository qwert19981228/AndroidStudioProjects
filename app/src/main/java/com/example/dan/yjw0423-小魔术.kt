package com.example.dan


fun main(){
    // $ 字符串内嵌表达式
    val brand = "Samsung"
    val price = 1299.99
    println("Cellphone(brand=$brand,price=$price)")
    printParams(str = "world")
}

// 给函数设定参数默认值
fun printParams(num:Int = 100,str:String){
    println("num is $num, str is $str")

}