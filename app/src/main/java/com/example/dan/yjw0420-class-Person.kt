package com.example.dan

open class `yjw0420-class-Person` {
    var name = ""
    var age = 0

    fun eat(){
        println(name + " is eating. He is " + age + " year old.")
    }
}

fun main(){
    val p = `yjw0420-class-Person`()
    p.name = "Jack"
    p.age = 19
    p.eat()
}
