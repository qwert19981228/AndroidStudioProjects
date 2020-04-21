package com.example.dan

fun main(){
    val student = `yjw0420-class-Student`("Jack",19)
    doStudy(student)

    val cellphone1 = `yjw0421-class-Cellphone`("Samsung",1299.99)
    val cellphone2 = `yjw0421-class-Cellphone`("Samsung",1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))

    `yjw0421-object-Singleton`.singletonTest()
}

fun doStudy(study: `yjw0420-class-Study`){
    study.readBooks()
    study.doHomework()
}