package com.example.dan

var content:String? = "Hello"

fun main(){
    doStudy(null)
    if (content != null){
        printUpperCase()
    }
}

// ?. 当对象不为空时正常调用相应的方法 , 当对象为空时则什么都不做
fun doStudy(study:`yjw0420-class-Study`?) {
//    if (study != null) {
//        study.doHomework()
//        study.readBooks()
//    }
    study?.readBooks()
    study?.doHomework()
}

// ?: 这个操作符的左右两边都接收一个表达式
//    如果左边表达式的结果不为空时就返回左边表达式的结果
//    否则就返回右边表达式的结果
//fun getTextLength(text:String?):Int{
//    if (text != null){
//        return text.length
//    }
//    return 0
//}
// 简化写法
fun getTextLength(text: String?) = text?.length ?: 0

// !! 如果我们想要强行通过编译 , 可以使用非空断言工具 , 写法是在对象的后面加上 !!

fun printUpperCase(){
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}

// let 作为一个函数 , 这个函数提供了函数式API的编程接口 , 并将原始调用对象作为参数传递到lambda表达式中
// 优化 dostudy 函数
fun dostudy(study: `yjw0420-class-Study`?){
    study?.let {
        it.doHomework()
        it.readBooks()
    }
}
