package com.example.dan

fun main(){
    val student = `yjw0420-class-Student`("Jack",19)
    doStudy(student)
}

fun doStudy(study: `yjw0420-class-Study`){
    study.readBooks()
    study.doHomework()
}